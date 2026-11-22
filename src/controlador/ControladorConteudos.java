
package controlador;

import modelo.Conteudo;
import modelo.Materia;
import java.util.ArrayList;
import java.util.List;

public class ControladorConteudos {

    private ArrayList<Conteudo> todosConteudos;

    public ControladorConteudos() {

        todosConteudos = new ArrayList<>();

        todosConteudos.add(new Conteudo("Matemática", "Adição"));
 todosConteudos.add(new Conteudo("Matemática", "Subtração"));
 todosConteudos.add(new Conteudo("Matemática", "Multiplicação"));
 todosConteudos.add(new Conteudo("Matemática", "Divisão"));
 todosConteudos.add(new Conteudo("Matemática", "Frações"));
 todosConteudos.add(new Conteudo("Matemática", "Porcentagem"));
 todosConteudos.add(new Conteudo("Matemática", "Razão e proporção"));
 todosConteudos.add(new Conteudo("Matemática", "Regra de três"));

 
 todosConteudos.add(new Conteudo("Matemática", "Potenciação e radiciação"));
 todosConteudos.add(new Conteudo("Matemática", "Equações do primeiro grau"));
 todosConteudos.add(new Conteudo("Matemática", "Equações do segundo grau"));
 todosConteudos.add(new Conteudo("Matemática", "Função afim"));
 todosConteudos.add(new Conteudo("Matemática", "Função quadrática"));
 todosConteudos.add(new Conteudo("Matemática", "Probabilidade"));
 todosConteudos.add(new Conteudo("Matemática", "Estatística"));
 todosConteudos.add(new Conteudo("Matemática", "Análise combinatória"));
 todosConteudos.add(new Conteudo("Matemática", "Geometria plana"));

 
 todosConteudos.add(new Conteudo("Matemática", "Geometria espacial"));
 todosConteudos.add(new Conteudo("Matemática", "Geometria analítica"));
 todosConteudos.add(new Conteudo("Matemática", "Trigonometria"));
 todosConteudos.add(new Conteudo("Matemática", "Logaritmos"));
 todosConteudos.add(new Conteudo("Matemática", "Função exponencial"));
 todosConteudos.add(new Conteudo("Matemática", "Progressão aritmética e geométrica"));
 todosConteudos.add(new Conteudo("Matemática", "Matrizes e determinantes"));

 todosConteudos.add(new Conteudo("Física", "Grandezas físicas e unidades"));
 todosConteudos.add(new Conteudo("Física", "Notação científica"));
 todosConteudos.add(new Conteudo("Física", "Movimento e repouso"));
 todosConteudos.add(new Conteudo("Física", "Velocidade média"));
 todosConteudos.add(new Conteudo("Física", "Aceleração média"));


 todosConteudos.add(new Conteudo("Física", "Cinemática"));
 todosConteudos.add(new Conteudo("Física", "Movimento uniforme"));
 todosConteudos.add(new Conteudo("Física", "Movimento uniformemente variado"));
 todosConteudos.add(new Conteudo("Física", "Leis de Newton"));
 todosConteudos.add(new Conteudo("Física", "Dinâmica"));
 todosConteudos.add(new Conteudo("Física", "Trabalho e energia"));
 todosConteudos.add(new Conteudo("Física", "Termologia"));
 todosConteudos.add(new Conteudo("Física", "Calorimetria"));
 todosConteudos.add(new Conteudo("Física", "Ondulatória"));


 todosConteudos.add(new Conteudo("Física", "Gravitação universal"));
 todosConteudos.add(new Conteudo("Física", "Hidrostática"));
 todosConteudos.add(new Conteudo("Física", "Termodinâmica"));
 todosConteudos.add(new Conteudo("Física", "Óptica geométrica"));
 todosConteudos.add(new Conteudo("Física", "Eletrostática"));
 todosConteudos.add(new Conteudo("Física", "Eletrodinâmica"));
 todosConteudos.add(new Conteudo("Física", "Magnetismo"));
 todosConteudos.add(new Conteudo("Física", "Física moderna"));

 todosConteudos.add(new Conteudo("Química", "Introdução à Química"));
 todosConteudos.add(new Conteudo("Química", "Matéria e suas propriedades"));
 todosConteudos.add(new Conteudo("Química", "Estados físicos da matéria"));
 todosConteudos.add(new Conteudo("Química", "Substâncias e misturas"));
 todosConteudos.add(new Conteudo("Química", "Separação de misturas"));
 todosConteudos.add(new Conteudo("Química", "Estrutura atômica"));


 todosConteudos.add(new Conteudo("Química", "Tabela periódica"));
 todosConteudos.add(new Conteudo("Química", "Ligações químicas"));
 todosConteudos.add(new Conteudo("Química", "Distribuição eletrônica"));
 todosConteudos.add(new Conteudo("Química", "Funções inorgânicas"));
 todosConteudos.add(new Conteudo("Química", "Reações químicas"));
 todosConteudos.add(new Conteudo("Química", "Balanceamento químico"));
 todosConteudos.add(new Conteudo("Química", "Estequiometria"));
 todosConteudos.add(new Conteudo("Química", "Soluções"));

 
 todosConteudos.add(new Conteudo("Química", "Termoquímica"));
 todosConteudos.add(new Conteudo("Química", "Cinética química"));
 todosConteudos.add(new Conteudo("Química", "Equilíbrio químico"));
 todosConteudos.add(new Conteudo("Química", "Eletroquímica"));
 todosConteudos.add(new Conteudo("Química", "Radioatividade"));
 todosConteudos.add(new Conteudo("Química", "Química orgânica"));
 todosConteudos.add(new Conteudo("Química", "Isomeria"));
 todosConteudos.add(new Conteudo("Química", "Reações orgânicas"));

 todosConteudos.add(new Conteudo("Biologia", "Introdução à Biologia"));
 todosConteudos.add(new Conteudo("Biologia", "Características dos seres vivos"));
 todosConteudos.add(new Conteudo("Biologia", "Bioquímica celular"));
 todosConteudos.add(new Conteudo("Biologia", "Citologia"));
 todosConteudos.add(new Conteudo("Biologia", "Organelas celulares"));

 todosConteudos.add(new Conteudo("Biologia", "Membrana plasmática"));
 todosConteudos.add(new Conteudo("Biologia", "Divisão celular"));
 todosConteudos.add(new Conteudo("Biologia", "Mitose e meiose"));
 todosConteudos.add(new Conteudo("Biologia", "Genética"));
 todosConteudos.add(new Conteudo("Biologia", "Leis de Mendel"));
 todosConteudos.add(new Conteudo("Biologia", "Evolução biológica"));
 todosConteudos.add(new Conteudo("Biologia", "Ecologia"));
 todosConteudos.add(new Conteudo("Biologia", "Cadeias e teias alimentares"));
 todosConteudos.add(new Conteudo("Biologia", "Fisiologia humana"));

 todosConteudos.add(new Conteudo("Biologia", "Biotecnologia"));
 todosConteudos.add(new Conteudo("Biologia", "Genética molecular"));
 todosConteudos.add(new Conteudo("Biologia", "Síntese de proteínas"));
 todosConteudos.add(new Conteudo("Biologia", "Embriologia"));
 todosConteudos.add(new Conteudo("Biologia", "Botânica"));
 todosConteudos.add(new Conteudo("Biologia", "Zoologia"));
 todosConteudos.add(new Conteudo("Biologia", "Microbiologia"));
 todosConteudos.add(new Conteudo("Biologia", "Imunologia"));
 todosConteudos.add(new Conteudo("Biologia", "Impactos ambientais"));


 

 todosConteudos.add(new Conteudo("Português", "Classes gramaticais"));
 todosConteudos.add(new Conteudo("Português", "Ortografia"));
 todosConteudos.add(new Conteudo("Português", "Acentuação"));
 todosConteudos.add(new Conteudo("Português", "Pontuação"));
 todosConteudos.add(new Conteudo("Português", "Interpretação de texto"));


 todosConteudos.add(new Conteudo("Português", "Morfologia"));
 todosConteudos.add(new Conteudo("Português", "Sintaxe"));
 todosConteudos.add(new Conteudo("Português", "Concordância verbal"));
 todosConteudos.add(new Conteudo("Português", "Concordância nominal"));
 todosConteudos.add(new Conteudo("Português", "Regência verbal e nominal"));
 todosConteudos.add(new Conteudo("Português", "Crase"));
 todosConteudos.add(new Conteudo("Português", "Colocação pronominal"));
 todosConteudos.add(new Conteudo("Português", "Figuras de linguagem"));

 
 todosConteudos.add(new Conteudo("Português", "Orações coordenadas e subordinadas"));
 todosConteudos.add(new Conteudo("Português", "Análise sintática"));
 todosConteudos.add(new Conteudo("Português", "Funções da linguagem"));
 todosConteudos.add(new Conteudo("Português", "Variação linguística"));
 todosConteudos.add(new Conteudo("Português", "Gêneros textuais"));
 todosConteudos.add(new Conteudo("Português", "Tipologia textual"));
 todosConteudos.add(new Conteudo("Português", "Intertextualidade"));
 todosConteudos.add(new Conteudo("Português", "Coesão e coerência"));

 todosConteudos.add(new Conteudo("Literatura", "Introdução à Literatura"));
 todosConteudos.add(new Conteudo("Literatura", "Gêneros literários"));
 todosConteudos.add(new Conteudo("Literatura", "Elementos da narrativa"));
 todosConteudos.add(new Conteudo("Literatura", "Trovadorismo"));
 todosConteudos.add(new Conteudo("Literatura", "Humanismo"));
 todosConteudos.add(new Conteudo("Literatura", "Classicismo"));

 todosConteudos.add(new Conteudo("Literatura", "Barroco"));
 todosConteudos.add(new Conteudo("Literatura", "Arcadismo"));
 todosConteudos.add(new Conteudo("Literatura", "Romantismo"));
 todosConteudos.add(new Conteudo("Literatura", "Realismo"));
 todosConteudos.add(new Conteudo("Literatura", "Naturalismo"));
 todosConteudos.add(new Conteudo("Literatura", "Parnasianismo"));
 todosConteudos.add(new Conteudo("Literatura", "Simbolismo"));

 todosConteudos.add(new Conteudo("Literatura", "Pré-Modernismo"));
 todosConteudos.add(new Conteudo("Literatura", "Modernismo"));
 todosConteudos.add(new Conteudo("Literatura", "Modernismo - Primeira fase"));
 todosConteudos.add(new Conteudo("Literatura", "Modernismo - Segunda fase"));
 todosConteudos.add(new Conteudo("Literatura", "Modernismo - Terceira fase"));
 todosConteudos.add(new Conteudo("Literatura", "Literatura contemporânea"));
 todosConteudos.add(new Conteudo("Literatura", "Literatura brasileira e identidade nacional"));

 todosConteudos.add(new Conteudo("Geografia", "Cartografia"));
 todosConteudos.add(new Conteudo("Geografia", "Coordenadas geográficas"));
 todosConteudos.add(new Conteudo("Geografia", "Fusos horários"));
 todosConteudos.add(new Conteudo("Geografia", "Escalas cartográficas"));
 todosConteudos.add(new Conteudo("Geografia", "Relevo"));
 todosConteudos.add(new Conteudo("Geografia", "Clima e tempo"));

 todosConteudos.add(new Conteudo("Geografia", "Vegetação"));
 todosConteudos.add(new Conteudo("Geografia", "Hidrografia"));
 todosConteudos.add(new Conteudo("Geografia", "Biomas brasileiros"));
 todosConteudos.add(new Conteudo("Geografia", "População e demografia"));
 todosConteudos.add(new Conteudo("Geografia", "Urbanização"));
 todosConteudos.add(new Conteudo("Geografia", "Industrialização"));
 todosConteudos.add(new Conteudo("Geografia", "Agropecuária"));
 todosConteudos.add(new Conteudo("Geografia", "Globalização"));

 todosConteudos.add(new Conteudo("Geografia", "Geopolítica"));
 todosConteudos.add(new Conteudo("Geografia", "Nova ordem mundial"));
 todosConteudos.add(new Conteudo("Geografia", "Blocos econômicos"));
 todosConteudos.add(new Conteudo("Geografia", "Geografia econômica"));
 todosConteudos.add(new Conteudo("Geografia", "Questões ambientais"));
 todosConteudos.add(new Conteudo("Geografia", "Fontes de energia"));
 todosConteudos.add(new Conteudo("Geografia", "Migrações internacionais"));
 todosConteudos.add(new Conteudo("Geografia", "Conflitos territoriais"));

 todosConteudos.add(new Conteudo("História", "Introdução à História"));
 todosConteudos.add(new Conteudo("História", "Pré-História"));
 todosConteudos.add(new Conteudo("História", "Antiguidade Oriental"));
 todosConteudos.add(new Conteudo("História", "Grécia Antiga"));
 todosConteudos.add(new Conteudo("História", "Roma Antiga"));

 todosConteudos.add(new Conteudo("História", "Idade Média"));
 todosConteudos.add(new Conteudo("História", "Feudalismo"));
 todosConteudos.add(new Conteudo("História", "Renascimento Cultural"));
 todosConteudos.add(new Conteudo("História", "Reforma Protestante"));
 todosConteudos.add(new Conteudo("História", "Absolutismo"));
 todosConteudos.add(new Conteudo("História", "Colonização do Brasil"));
 todosConteudos.add(new Conteudo("História", "Brasil Império"));
 todosConteudos.add(new Conteudo("História", "Revolução Industrial"));
 todosConteudos.add(new Conteudo("História", "Revolução Francesa"));

 
 todosConteudos.add(new Conteudo("História", "Independência do Brasil"));
 todosConteudos.add(new Conteudo("História", "República Velha"));
 todosConteudos.add(new Conteudo("História", "Era Vargas"));
 todosConteudos.add(new Conteudo("História", "Ditadura Militar no Brasil"));
 todosConteudos.add(new Conteudo("História", "Primeira Guerra Mundial"));
 todosConteudos.add(new Conteudo("História", "Segunda Guerra Mundial"));
 todosConteudos.add(new Conteudo("História", "Guerra Fria"));
 todosConteudos.add(new Conteudo("História", "Imperialismo e Neocolonialismo"));
 todosConteudos.add(new Conteudo("História", "Descolonização da África e Ásia"));
 todosConteudos.add(new Conteudo("História", "Movimentos sociais no Brasil"));
    }

    public ArrayList<Conteudo> listarConteudos(Materia materias) {

        ArrayList<Conteudo> selecionados = new ArrayList<>();

        for (Conteudo conteudo : todosConteudos) {

            String nomeMateria = conteudo.getMateria();

            if (nomeMateria.equals("Matemática") && materias.isMatematica()) {
                selecionados.add(conteudo);
            }

            if (nomeMateria.equals("Física") && materias.isFisica()) {
                selecionados.add(conteudo);
            }

            if (nomeMateria.equals("Química") && materias.isQuimica()) {
                selecionados.add(conteudo);
            }

            if (nomeMateria.equals("Biologia") && materias.isBiologia()) {
                selecionados.add(conteudo);
            }

            if (nomeMateria.equals("Português") && materias.isPortugues()) {
                selecionados.add(conteudo);
            }

            if (nomeMateria.equals("Literatura") && materias.isLiteratura()) {
                selecionados.add(conteudo);
            }

            if (nomeMateria.equals("Geografia") && materias.isGeografia()) {
                selecionados.add(conteudo);
            }

            if (nomeMateria.equals("História") && materias.isHistoria()) {
                selecionados.add(conteudo);
            }
        }

        return selecionados;
    }
}