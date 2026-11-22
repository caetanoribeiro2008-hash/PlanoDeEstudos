/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package visao;
import controlador.ControladorTelas;
import controlador.ControladorConteudos;
import modelo.Materia;
import modelo.Conteudo;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import controlador.ControladorTelas;
import modelo.Conteudo;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



public class TelaConteudos extends javax.swing.JPanel {

    
    private ControladorTelas controlador;
    private ControladorConteudos controladorConteudos;
    private Materia materias;
    private ArrayList<Conteudo> conteudosDisponiveis;
    private java.util.Set<Integer> selecaoValida = new java.util.HashSet<>();
    private boolean atualizandoSelecao = false;
    
    public TelaConteudos() {
        initComponents();
    }
    
    
    public TelaConteudos(ControladorTelas controlador, Materia materias) {
        

      initComponents();

        this.controlador = controlador;
        this.materias = materias;

        controladorConteudos = new ControladorConteudos();

        // Configura a lista
        jListConteudos.setModel(new javax.swing.DefaultListModel<>());

        jListConteudos.setSelectionMode(
            javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION
        );

        carregarConteudos();
        
        for (java.awt.event.MouseListener ouvinte : jListConteudos.getMouseListeners()) {
            jListConteudos.removeMouseListener(ouvinte);
        }
        jListConteudos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int item = jListConteudos.locationToIndex(e.getPoint());
                if (item < 0) return;
                if (jListConteudos.isSelectedIndex(item)) {
                    jListConteudos.removeSelectionInterval(item, item);
                } else {
                    jListConteudos.addSelectionInterval(item, item);
                }
            }
        });
        
        carregarConteudos();

       
        for (java.awt.event.MouseListener ouvinte : jListConteudos.getMouseListeners()) {
            jListConteudos.removeMouseListener(ouvinte);
        }

        jListConteudos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int item = jListConteudos.locationToIndex(e.getPoint());
                if (item < 0) return;

                if (jListConteudos.isSelectedIndex(item)) {
                    jListConteudos.removeSelectionInterval(item, item);
                } else {
                    jListConteudos.addSelectionInterval(item, item);
                }
            }
        });

       
        configurarLimiteSelecao();
    }
     
    private void configurarLimiteSelecao() {

    jListConteudos.addListSelectionListener(e -> {

        if (e.getValueIsAdjusting() || atualizandoSelecao) {
            return;
        }

        int[] indicesSelecionados = jListConteudos.getSelectedIndices();

        java.util.Map<String, Integer> contagem = new java.util.HashMap<>();

        boolean limiteUltrapassado = false;

        for (int indice : indicesSelecionados) {

            Conteudo conteudo = conteudosDisponiveis.get(indice);
            String materia = conteudo.getMateria();

            int quantidade = contagem.getOrDefault(materia, 0) + 1;
            contagem.put(materia, quantidade);

            if (quantidade > 3) {
                limiteUltrapassado = true;
                break;
            }
        }

        if (limiteUltrapassado) {

            atualizandoSelecao = true;

            jListConteudos.clearSelection();

            for (int indice : selecaoValida) {
                jListConteudos.addSelectionInterval(indice, indice);
            }

            atualizandoSelecao = false;

            javax.swing.JOptionPane.showMessageDialog(
                this,
                "Você pode selecionar no máximo 3 conteúdos por matéria!"
            );

        } else {

            selecaoValida.clear();

            for (int indice : indicesSelecionados) {
                selecaoValida.add(indice);
            }
        }
    });
}
    private void carregarConteudos() {

    DefaultListModel<String> modeloLista = new DefaultListModel<>();

    conteudosDisponiveis = controladorConteudos.listarConteudos(materias);

    for (Conteudo conteudo : conteudosDisponiveis) {

        String nome = conteudo.getMateria() + " - " + conteudo.getNome();

        modeloLista.addElement(nome);
    }

    jListConteudos.setModel(modeloLista);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonNext2 = new javax.swing.JButton();
        jLabelMatematica = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListConteudos = new javax.swing.JList<>();
        jButtonVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jDesktopPane2.setOpaque(false);
        jDesktopPane2.setBackground(new java.awt.Color(236, 244, 255));

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jDesktopPane3.setOpaque(false);
        jDesktopPane3.setBackground(new java.awt.Color(236, 244, 255));

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(43, 17, 253));

        jPanel1.setBackground(new java.awt.Color(236, 244, 255));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de conteúdos!");

        jButtonNext2.setBackground(new java.awt.Color(43, 17, 253));
        jButtonNext2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jButtonNext2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNext2.setText("Continuar");
        jButtonNext2.setFocusPainted(false);
        jButtonNext2.addActionListener(this::jButtonNext2ActionPerformed);

        jLabelMatematica.setFont(new java.awt.Font("Book Antiqua", 0, 15)); // NOI18N
        jLabelMatematica.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMatematica.setText("Selecione quais conteúdos você tem mais dificuldade em entender! Até no máximo 3 de cada matéria.");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(480, 310));

        jListConteudos.setBackground(new java.awt.Color(0, 204, 204));
        jListConteudos.setFont(new java.awt.Font("Book Antiqua", 0, 15)); // NOI18N
        jListConteudos.setForeground(new java.awt.Color(255, 255, 255));
        jListConteudos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListConteudos.setFixedCellHeight(29);
        jScrollPane1.setViewportView(jListConteudos);

        jButtonVoltar.setBackground(new java.awt.Color(71, 255, 156));
        jButtonVoltar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(28, 31, 72));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setFocusPainted(false);
        jButtonVoltar.addActionListener(this::jButtonVoltarActionPerformed);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Para selecionar, aperte Control + botão primário do mouse");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNext2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMatematica, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMatematica)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVoltar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNext2)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNext2ActionPerformed
    int[] indices = jListConteudos.getSelectedIndices();

    if (indices.length == 0) {
        JOptionPane.showMessageDialog(this,
                "Selecione pelo menos um conteúdo!");
        return;
    }

    ArrayList<Conteudo> conteudosEscolhidos = new ArrayList<>();


    for (int indice : indices) {
        conteudosEscolhidos.add(conteudosDisponiveis.get(indice));
    }
    controlador.carregarTelaPrioridades(conteudosEscolhidos);
    }//GEN-LAST:event_jButtonNext2ActionPerformed


    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        controlador.voltar();
    }


    // A imagem aparece no fundo e nao atrapalha os textos e botoes.
    private final java.awt.Image fundoAura = new javax.swing.ImageIcon(
            getClass().getResource("/visao/imagens/fundo_aura.png")).getImage();

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        g.drawImage(fundoAura, 0, 0, getWidth(), getHeight(), this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNext2;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMatematica;
    private javax.swing.JList<String> jListConteudos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
