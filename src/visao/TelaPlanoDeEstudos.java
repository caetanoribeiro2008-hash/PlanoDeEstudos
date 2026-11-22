
package visao;

import controlador.ControladorTelas;
import controlador.GeradorPlanoEstudos;
import java.util.ArrayList;
import modelo.ConteudoPrioridade;
import modelo.Disponibilidade;
import modelo.SessaoEstudo;


public class TelaPlanoDeEstudos extends javax.swing.JPanel {

    private ControladorTelas controlador;
    private ArrayList<ConteudoPrioridade> listaPrioridades;
    private Disponibilidade disponibilidade;
    
    
    private void gerarCronograma() {

        GeradorPlanoEstudos gerador = new GeradorPlanoEstudos();

        ArrayList<SessaoEstudo> plano =
                gerador.gerarPlano(listaPrioridades, disponibilidade);

        String[] colunas = {
            "Dia da semana",
            "Conteúdo",
            "Prioridade",
            "Duração"
        };

        javax.swing.table.DefaultTableModel modelo =
                new javax.swing.table.DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (SessaoEstudo sessao : plano) {

            ConteudoPrioridade cp = sessao.getConteudoPrioridade();

            String textoDuracao = sessao.getDuracao() == 1
                    ? "1 hora"
                    : sessao.getDuracao() + " horas";

            Object[] linha = {
                sessao.getDia(),
                cp.getConteudo().getMateria() + " - "
                        + cp.getConteudo().getNome(),
                cp.getNomePrioridade(),
                textoDuracao
            };

            modelo.addRow(linha);
        }
        
        System.out.println("Horas disponíveis: "
        + disponibilidade.getTotalHoras());

        System.out.println("Sessões geradas: "
                + plano.size());

        jTable2.setModel(modelo);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(140);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(365);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(90);
    }

    
public TelaPlanoDeEstudos(
        ControladorTelas controlador,
        ArrayList<ConteudoPrioridade> listaPrioridades,
        Disponibilidade disponibilidade) {

    initComponents();

    this.controlador = controlador;
    this.listaPrioridades = listaPrioridades;
    this.disponibilidade = disponibilidade;

    gerarCronograma();
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(43, 17, 253));

        jPanel1.setBackground(new java.awt.Color(236, 244, 255));
        jPanel1.setOpaque(false);

        jScrollPane1.setBackground(new java.awt.Color(0, 204, 204));
        jScrollPane1.setForeground(new java.awt.Color(0, 153, 153));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setPreferredSize(new java.awt.Dimension(735, 440));

        jTable2.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jTable2.setForeground(new java.awt.Color(28, 31, 72));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setRowHeight(27);
        jScrollPane1.setViewportView(jTable2);

        jButtonVoltar.setBackground(new java.awt.Color(71, 255, 156));
        jButtonVoltar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(28, 31, 72));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setFocusPainted(false);
        jButtonVoltar.addActionListener(this::jButtonVoltarActionPerformed);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sua tabela de estudos acaba de ficar pronta!!");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DICA: você pode fazer novos cronogramas quando quiser!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        controlador.voltar();
    }


   
    private final java.awt.Image fundoAura = new javax.swing.ImageIcon(
            getClass().getResource("/visao/imagens/fundo_aura.png")).getImage();

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        g.drawImage(fundoAura, 0, 0, getWidth(), getHeight(), this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
