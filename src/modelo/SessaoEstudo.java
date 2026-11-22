/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author caeta
 */

public class SessaoEstudo {

    private String dia;
    private ConteudoPrioridade conteudoPrioridade;
    private int duracao;

    public SessaoEstudo(String dia,
                        ConteudoPrioridade conteudoPrioridade,
                        int duracao) {
        this.dia = dia;
        this.conteudoPrioridade = conteudoPrioridade;
        this.duracao = duracao;
    }

    public String getDia() {
        return dia;
    }

    public ConteudoPrioridade getConteudoPrioridade() {
        return conteudoPrioridade;
    }

    public int getDuracao() {
        return duracao;
    }
}
