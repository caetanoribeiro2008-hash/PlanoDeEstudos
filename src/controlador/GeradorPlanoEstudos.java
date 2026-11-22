/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import modelo.ConteudoPrioridade;
import modelo.Disponibilidade;
import modelo.SessaoEstudo;
/**
 *
 * @author caeta
 */

public class GeradorPlanoEstudos {

    public ArrayList<SessaoEstudo> gerarPlano(
            ArrayList<ConteudoPrioridade> prioridades,
            Disponibilidade disponibilidade) {

        ArrayList<SessaoEstudo> plano = new ArrayList<>();

        if (prioridades == null || prioridades.isEmpty() || disponibilidade == null) {
            return plano;
        }

        int quantidade = prioridades.size();

        // Pesos: alta = 4, média = 2, baixa = 1
        int[] pesos = new int[quantidade];

        int pesoTotal = 0;

        for (int i = 0; i < quantidade; i++) {

            int prioridade = prioridades.get(i).getPrioridade();

            switch (prioridade) {
                case 1:
                    pesos[i] = 4;
                    break;
                case 2:
                    pesos[i] = 2;
                    break;
                case 3:
                    pesos[i] = 1;
                    break;
                default:
                    pesos[i] = 1;
            }

            pesoTotal += pesos[i];
        }

        int totalHoras = disponibilidade.getTotalHoras();
        int[] horasConteudo = new int[quantidade];

        // Quando há tempo suficiente, cada conteúdo aparece pelo menos uma vez.
        int horasRestantes = totalHoras;
        if (totalHoras >= quantidade) {
            for (int i = 0; i < quantidade; i++) {
                horasConteudo[i] = 1;
            }
            horasRestantes -= quantidade;
        }

        // Distribui o tempo que sobrou de acordo com as prioridades.
        if (horasRestantes > 0) {
            int[] restos = new int[quantidade];
            int horasDistribuidas = 0;

            for (int i = 0; i < quantidade; i++) {
                int calculo = horasRestantes * pesos[i];

                horasConteudo[i] += calculo / pesoTotal;
                restos[i] = calculo % pesoTotal;
                horasDistribuidas += calculo / pesoTotal;
            }

            Integer[] ordem = new Integer[quantidade];

            for (int i = 0; i < quantidade; i++) {
                ordem[i] = i;
            }

            Arrays.sort(ordem, new Comparator<Integer>() {
                @Override
                public int compare(Integer a, Integer b) {
                    int comparacao = Integer.compare(restos[b], restos[a]);

                    if (comparacao != 0) {
                        return comparacao;
                    }

                    return Integer.compare(
                            prioridades.get(a).getPrioridade(),
                            prioridades.get(b).getPrioridade()
                    );
                }
            });

            int horasAindaNaoDistribuidas = horasRestantes - horasDistribuidas;
            for (int i = 0; i < horasAindaNaoDistribuidas; i++) {
                horasConteudo[ordem[i]]++;
            }
        }

        // Percorre os dias e alterna os conteúdos para não deixar
        // um único conteúdo ocupar todos os dias disponíveis.
        int proximoConteudo = 0;

        for (String dia : disponibilidade.getHorasPorDia().keySet()) {

            int horasDisponiveis = disponibilidade.getHoras(dia);
            int[] horasDoDia = new int[quantidade];

            for (int hora = 0; hora < horasDisponiveis; hora++) {
                int tentativas = 0;

                while (tentativas < quantidade
                        && horasConteudo[proximoConteudo] == 0) {
                    proximoConteudo = (proximoConteudo + 1) % quantidade;
                    tentativas++;
                }

                if (tentativas == quantidade) {
                    break;
                }

                horasDoDia[proximoConteudo]++;
                horasConteudo[proximoConteudo]--;
                proximoConteudo = (proximoConteudo + 1) % quantidade;
            }

            for (int i = 0; i < quantidade; i++) {
                if (horasDoDia[i] > 0) {
                    plano.add(new SessaoEstudo(
                            dia,
                            prioridades.get(i),
                            horasDoDia[i]
                    ));
                }
            }
        }

        return plano;
    }
}

