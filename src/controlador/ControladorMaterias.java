
package controlador;

import modelo.Materia;
import javax.swing.JCheckBox;
import visao.TelaConteudos;

public class ControladorMaterias {

    JCheckBox jCheckBoxMatematica;
    JCheckBox jCheckBoxPortugues;
    JCheckBox jCheckBoxFisica;
    JCheckBox jCheckBoxBiologia;
    JCheckBox jCheckBoxLiteratura;
    JCheckBox jCheckBoxQuimica;
    JCheckBox jCheckBoxHistoria;
    JCheckBox jCheckBoxGeografia;

    private Materia materia = new Materia();

    public ControladorMaterias(
        JCheckBox jCheckBoxMatematica,
        JCheckBox jCheckBoxPortugues,
        JCheckBox jCheckBoxFisica,
        JCheckBox jCheckBoxBiologia,
        JCheckBox jCheckBoxLiteratura,
        JCheckBox jCheckBoxQuimica,
        JCheckBox jCheckBoxHistoria,
        JCheckBox jCheckBoxGeografia
    ) {
        this.jCheckBoxMatematica = jCheckBoxMatematica;
        this.jCheckBoxPortugues = jCheckBoxPortugues;
        this.jCheckBoxFisica = jCheckBoxFisica;
        this.jCheckBoxBiologia = jCheckBoxBiologia;
        this.jCheckBoxLiteratura = jCheckBoxLiteratura;
        this.jCheckBoxQuimica = jCheckBoxQuimica;
        this.jCheckBoxHistoria = jCheckBoxHistoria;
        this.jCheckBoxGeografia = jCheckBoxGeografia;
    }

    // Retorna o objeto Materia
    public Materia getMateria() {
        return materia;
    }

    // Atualiza as seleções dos checkboxes
    public void atualizarMaterias() {

        materia.setMatematica(jCheckBoxMatematica.isSelected());
        materia.setPortugues(jCheckBoxPortugues.isSelected());
        materia.setFisica(jCheckBoxFisica.isSelected());
        materia.setBiologia(jCheckBoxBiologia.isSelected());
        materia.setLiteratura(jCheckBoxLiteratura.isSelected());
        materia.setQuimica(jCheckBoxQuimica.isSelected());
        materia.setHistoria(jCheckBoxHistoria.isSelected());
        materia.setGeografia(jCheckBoxGeografia.isSelected());
    }
    
    public void matematicaTrue(boolean selecionada) {
    materia.setMatematica(selecionada);
}
    
}
