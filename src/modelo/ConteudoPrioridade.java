
package modelo;


public class ConteudoPrioridade {

    private Conteudo conteudo;
    private int prioridade;

    public ConteudoPrioridade(Conteudo conteudo, int prioridade) {
        this.conteudo = conteudo;
        this.prioridade = prioridade;
    }

    public Conteudo getConteudo() {
        return conteudo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getNomePrioridade() {
        switch (prioridade) {
            case 1:
                return "Alta";
            case 2:
                return "Média";
            case 3:
                return "Baixa";
            default:
                return "Não definida";
        }
    }
}
