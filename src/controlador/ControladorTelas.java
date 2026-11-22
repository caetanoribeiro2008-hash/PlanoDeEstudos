
package controlador;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Conteudo;
import modelo.ConteudoPrioridade;
import modelo.Disponibilidade;
import modelo.Materia;
import visao.TelaConteudos;
import visao.TelaDisponibilidade;
import visao.TelaMaterias;
import visao.TelaPlanoDeEstudos;
import visao.TelaPrioridades;


public class ControladorTelas {

   
    private JDesktopPane jDesktopPane1;
    private JLabel jLabelMatematica;
    private JPanel telaAtual;
    private ArrayList<JPanel> historico = new ArrayList<>();

    
    public static void main(String[] args) {
    }

    
    public ControladorTelas(JDesktopPane jDesktopPane1) {
        this.jDesktopPane1 = jDesktopPane1;
        jDesktopPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {
                if (telaAtual != null) {
                    telaAtual.setBounds(0, 0, jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
                }
            }
        });
    }

    public void trocarTela(JPanel novaTela) {
        if (telaAtual != null) {
            historico.add(telaAtual);
        }
        mostrar(novaTela);
    }

    private void mostrar(JPanel tela) {
        if (telaAtual != null) {
            jDesktopPane1.remove(telaAtual);
        }
        telaAtual = tela;
        if (tela != null) {
            tela.setBounds(0, 0, jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
            jDesktopPane1.add(tela, javax.swing.JLayeredPane.PALETTE_LAYER);
        }
        jDesktopPane1.revalidate();
        jDesktopPane1.repaint();
    }

    public void voltar() {
        if (historico.isEmpty()) {
            mostrar(null); // Tela inicial
        } else {
            JPanel anterior = historico.remove(historico.size() - 1);
            mostrar(anterior);
        }
    }

    public void carregarTelaMaterias() {
        trocarTela(new TelaMaterias(this));
    }

    public void carregarTelaConteudos(Materia materia) {
        TelaConteudos tela = new TelaConteudos(this, materia);
        trocarTela(tela);
    }

    public void setjLabelMatematica(JLabel jLabelMatematica) {
        this.jLabelMatematica = jLabelMatematica;
    }

    public void carregarTelaPrioridades(ArrayList<Conteudo> conteudosEscolhidos) {

    TelaPrioridades tela = new TelaPrioridades(this, conteudosEscolhidos);

    trocarTela(tela);
}
    
   
    public void carregarTelaDisponibilidade(
            ArrayList<ConteudoPrioridade> listaPrioridades) {

        trocarTela(new TelaDisponibilidade(this, listaPrioridades));
    }


    public void carregarTelaPlanoDeEstudos(
            ArrayList<ConteudoPrioridade> listaPrioridades,
            Disponibilidade disponibilidade) {

        TelaPlanoDeEstudos tela = new TelaPlanoDeEstudos(
            this,
            listaPrioridades,
            disponibilidade
        );

        trocarTela(tela);
    }

   
    
    
}