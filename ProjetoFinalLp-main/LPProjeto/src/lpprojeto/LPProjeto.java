/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lpprojeto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Thamires
 */
public class LPProjeto extends javax.swing.JFrame {
        Date dataNascimento = null;
        int idade;
    
        int calcularIdade(){
        Calendar dataNasc = Calendar.getInstance();
        dataNasc.setTime(dataNascimento);
        Calendar hoje = Calendar.getInstance();
        hoje.getTime();
        idade = hoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);
        dataNasc.add(Calendar.YEAR, idade);
        if(hoje.before(dataNasc)){
        idade--;       
        }
        return idade;
    }
    /**
     * Creates new form LPProjeto
     */
    public LPProjeto() {
        initComponents();
        painelcor.setVisible(true);
        cadastroresp.setVisible(false);
        lcadastroresp.setVisible(false);
        paineldados.setVisible(false);
        dadosresp.setVisible(false);
    }
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupobotao = new javax.swing.ButtonGroup();
        painelcor = new javax.swing.JPanel();
        painelcadastro = new javax.swing.JPanel();
        lcadastronome = new javax.swing.JLabel();
        cadastronome = new javax.swing.JTextField();
        lcadastronascimento = new javax.swing.JLabel();
        cadastronascimento = new javax.swing.JFormattedTextField();
        lcadastroserie = new javax.swing.JLabel();
        cadastroserie = new javax.swing.JTextField();
        TI = new javax.swing.JRadioButton();
        cadastrocurso = new javax.swing.JLabel();
        eletro = new javax.swing.JRadioButton();
        lcadastroresp = new javax.swing.JLabel();
        cadastroresp = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        saircadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        paineldados = new javax.swing.JPanel();
        ldadosnome = new javax.swing.JLabel();
        ldadosnascimento = new javax.swing.JLabel();
        dadosnascimento = new javax.swing.JLabel();
        ldadosserie = new javax.swing.JLabel();
        dadosserie = new javax.swing.JLabel();
        ldadoscurso = new javax.swing.JLabel();
        dadoscurso = new javax.swing.JLabel();
        ldadosresp = new javax.swing.JLabel();
        dadosresp = new javax.swing.JLabel();
        ldadosidade = new javax.swing.JLabel();
        dadosnome = new javax.swing.JLabel();
        dadosidade = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        sairdados = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(679, 512));

        painelcor.setBackground(new java.awt.Color(204, 204, 255));
        painelcor.setPreferredSize(new java.awt.Dimension(263, 362));

        javax.swing.GroupLayout painelcorLayout = new javax.swing.GroupLayout(painelcor);
        painelcor.setLayout(painelcorLayout);
        painelcorLayout.setHorizontalGroup(
            painelcorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelcorLayout.setVerticalGroup(
            painelcorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        painelcadastro.setBackground(new java.awt.Color(204, 204, 255));
        painelcadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lcadastronome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lcadastronome.setForeground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("lpprojeto/Bundle"); // NOI18N
        lcadastronome.setText(bundle.getString("LPProjeto.lcadastronome.text")); // NOI18N
        painelcadastro.add(lcadastronome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 45, -1));

        cadastronome.setBackground(new java.awt.Color(204, 204, 255));
        cadastronome.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        cadastronome.setText(bundle.getString("LPProjeto.cadastronome.text")); // NOI18N
        painelcadastro.add(cadastronome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 346, -1));

        lcadastronascimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lcadastronascimento.setForeground(new java.awt.Color(255, 255, 255));
        lcadastronascimento.setText(bundle.getString("LPProjeto.lcadastronascimento.text")); // NOI18N
        painelcadastro.add(lcadastronascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        cadastronascimento.setBackground(new java.awt.Color(204, 204, 255));
        try {
            cadastronascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cadastronascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cadastronascimentoFocusLost(evt);
            }
        });
        cadastronascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastronascimentoActionPerformed(evt);
            }
        });
        painelcadastro.add(cadastronascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 90, -1));

        lcadastroserie.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lcadastroserie.setForeground(new java.awt.Color(255, 255, 255));
        lcadastroserie.setText(bundle.getString("LPProjeto.lcadastroserie.text")); // NOI18N
        painelcadastro.add(lcadastroserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 39, -1));

        cadastroserie.setBackground(new java.awt.Color(204, 204, 255));
        cadastroserie.setText(bundle.getString("LPProjeto.cadastroserie.text")); // NOI18N
        cadastroserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroserieActionPerformed(evt);
            }
        });
        painelcadastro.add(cadastroserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 71, -1));

        grupobotao.add(TI);
        TI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TI.setForeground(new java.awt.Color(255, 255, 255));
        TI.setText(bundle.getString("LPProjeto.TI.text")); // NOI18N
        TI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIActionPerformed(evt);
            }
        });
        painelcadastro.add(TI, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        cadastrocurso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cadastrocurso.setForeground(new java.awt.Color(255, 255, 255));
        cadastrocurso.setText(bundle.getString("LPProjeto.cadastrocurso.text")); // NOI18N
        painelcadastro.add(cadastrocurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 70, -1));

        grupobotao.add(eletro);
        eletro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eletro.setForeground(new java.awt.Color(255, 255, 255));
        eletro.setText(bundle.getString("LPProjeto.eletro.text")); // NOI18N
        eletro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eletroActionPerformed(evt);
            }
        });
        painelcadastro.add(eletro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        lcadastroresp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lcadastroresp.setForeground(new java.awt.Color(255, 255, 255));
        lcadastroresp.setText(bundle.getString("LPProjeto.lcadastroresp.text")); // NOI18N
        painelcadastro.add(lcadastroresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 355, -1, -1));

        cadastroresp.setBackground(new java.awt.Color(204, 204, 255));
        cadastroresp.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        cadastroresp.setText(bundle.getString("LPProjeto.cadastroresp.text")); // NOI18N
        cadastroresp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrorespActionPerformed(evt);
            }
        });
        painelcadastro.add(cadastroresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 326, -1));

        cadastrar.setText(bundle.getString("LPProjeto.cadastrar.text")); // NOI18N
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        painelcadastro.add(cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        saircadastro.setText(bundle.getString("LPProjeto.saircadastro.text")); // NOI18N
        saircadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saircadastroActionPerformed(evt);
            }
        });
        painelcadastro.add(saircadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagemcadastro/Design sem nome (3).png"))); // NOI18N
        jLabel1.setText(bundle.getString("LPProjeto.jLabel1.text")); // NOI18N
        painelcadastro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 500));

        paineldados.setBackground(new java.awt.Color(204, 204, 255));
        paineldados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ldadosnome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ldadosnome.setForeground(new java.awt.Color(255, 255, 255));
        ldadosnome.setText(bundle.getString("LPProjeto.ldadosnome.text")); // NOI18N
        paineldados.add(ldadosnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 43, -1));

        ldadosnascimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ldadosnascimento.setForeground(new java.awt.Color(255, 255, 255));
        ldadosnascimento.setText(bundle.getString("LPProjeto.ldadosnascimento.text")); // NOI18N
        paineldados.add(ldadosnascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 139, -1));

        dadosnascimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dadosnascimento.setForeground(new java.awt.Color(204, 102, 255));
        dadosnascimento.setText(bundle.getString("LPProjeto.dadosnascimento.text")); // NOI18N
        paineldados.add(dadosnascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 115, 16));

        ldadosserie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ldadosserie.setForeground(new java.awt.Color(255, 255, 255));
        ldadosserie.setText(bundle.getString("LPProjeto.ldadosserie.text")); // NOI18N
        paineldados.add(ldadosserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 41, -1));

        dadosserie.setForeground(new java.awt.Color(204, 102, 255));
        dadosserie.setText(bundle.getString("LPProjeto.dadosserie.text")); // NOI18N
        paineldados.add(dadosserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 71, 20));

        ldadoscurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ldadoscurso.setForeground(new java.awt.Color(255, 255, 255));
        ldadoscurso.setText(bundle.getString("LPProjeto.ldadoscurso.text")); // NOI18N
        paineldados.add(ldadoscurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 41, -1));

        dadoscurso.setForeground(new java.awt.Color(204, 102, 255));
        dadoscurso.setText(bundle.getString("LPProjeto.dadoscurso.text")); // NOI18N
        paineldados.add(dadoscurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 149, 20));

        ldadosresp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ldadosresp.setForeground(new java.awt.Color(255, 255, 255));
        ldadosresp.setText(bundle.getString("LPProjeto.ldadosresp.text")); // NOI18N
        paineldados.add(ldadosresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 88, -1));

        dadosresp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dadosresp.setForeground(new java.awt.Color(204, 102, 255));
        dadosresp.setText(bundle.getString("LPProjeto.dadosresp.text")); // NOI18N
        paineldados.add(dadosresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 310, 20));

        ldadosidade.setForeground(new java.awt.Color(255, 255, 255));
        ldadosidade.setText(bundle.getString("LPProjeto.ldadosidade.text")); // NOI18N
        paineldados.add(ldadosidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 42, -1));

        dadosnome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dadosnome.setForeground(new java.awt.Color(204, 102, 255));
        dadosnome.setText(bundle.getString("LPProjeto.dadosnome.text")); // NOI18N
        paineldados.add(dadosnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 502, 20));

        dadosidade.setForeground(new java.awt.Color(204, 102, 255));
        dadosidade.setText(bundle.getString("LPProjeto.dadosidade.text")); // NOI18N
        paineldados.add(dadosidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 30, 16));

        voltar.setText(bundle.getString("LPProjeto.voltar.text")); // NOI18N
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        paineldados.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        sairdados.setText(bundle.getString("LPProjeto.sairdados.text")); // NOI18N
        sairdados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairdadosActionPerformed(evt);
            }
        });
        paineldados.add(sairdados, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagemdados/Dados do aluno.png"))); // NOI18N
        jLabel2.setText(bundle.getString("LPProjeto.jLabel2.text")); // NOI18N
        paineldados.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paineldados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(403, 403, 403))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paineldados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastronascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastronascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastronascimentoActionPerformed

    private void cadastroserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroserieActionPerformed

    private void TIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIActionPerformed

    private void eletroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eletroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eletroActionPerformed

    private void cadastrorespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrorespActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrorespActionPerformed

    private void saircadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saircadastroActionPerformed
        System.exit(0);  
    }//GEN-LAST:event_saircadastroActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        String nome=cadastronome.getText();
        String nascimento=cadastronascimento.getText();
        String serie=cadastroserie.getText();
        String curso="";
       
        if (eletro.isSelected()) {
            curso=eletro.getText();
        }
        if (TI.isSelected()) {
            curso=TI.getText();
        }
       String resp = cadastroresp.getText();
       if ((nome.isEmpty()) || (resp.isEmpty() && idade<18)  ||(curso.isEmpty() && idade>=18) || (curso.isEmpty() && idade<18) || (nome.isEmpty() && idade>=18)  || (serie.isEmpty() && idade<18) || (serie.isEmpty() && idade>=18) ||(nascimento.isEmpty()) || (serie.isEmpty())) {
            JOptionPane.showMessageDialog(null, "Para continuar é necessário que todos os campos estejam preenchidos!");
       return;
       }
       else{
       dadosnome.setText(nome);
        dadosnascimento.setText(nascimento);
        dadosserie.setText(serie);
        if(curso.isEmpty()){
        dadoscurso.setText(""); 
        }
        if(resp.isEmpty()){
        dadosresp.setText(""); 
        }
        if(TI.isSelected()){
           curso=TI.getText();
           dadoscurso.setText(curso);
         }
        if(eletro.isSelected()){
           curso=eletro.getText();
           dadoscurso.setText(curso);
        }
        
       String valoridade=String.valueOf(idade);
       dadosidade.setText(valoridade);
       dadosresp.setText(resp);
       painelcadastro.setVisible(false);
       paineldados.setVisible(true);
       painelcor.setVisible(true);
        }
        
    }//GEN-LAST:event_cadastrarActionPerformed

    private void cadastronascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cadastronascimentoFocusLost
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        formatoData.setLenient(false);;
        try {
            dataNascimento = formatoData.parse(cadastronascimento.getText());
            idade=calcularIdade();
            if (idade<18) {
                cadastroresp.setVisible(true);
                lcadastroresp.setVisible(true);
                ldadosresp.setVisible(true);
                dadosresp.setVisible(true);
            }
               else {
                cadastroresp.setVisible(false);
                lcadastroresp.setVisible(false);
                ldadosresp.setVisible(false);
                dadosresp.setVisible(false);
               
            }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "DATA INVÁLIDA");
           return;
        }
    }//GEN-LAST:event_cadastronascimentoFocusLost

    private void sairdadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairdadosActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairdadosActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        painelcadastro.setVisible(true);
        paineldados.setVisible(false);
        cadastronome.setText(" ");
        cadastronascimento.setText(null);
        cadastroserie.setText(" ");
        grupobotao.clearSelection();
        cadastroresp.setText(" ");
        cadastroresp.setVisible(false);
        lcadastroresp.setVisible(false);
        if(idade>18){
            cadastroresp.setVisible(false);
            cadastroresp.setVisible(false);
        }
    }//GEN-LAST:event_voltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LPProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LPProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LPProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LPProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LPProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton TI;
    private javax.swing.JButton cadastrar;
    private javax.swing.JLabel cadastrocurso;
    private javax.swing.JFormattedTextField cadastronascimento;
    private javax.swing.JTextField cadastronome;
    private javax.swing.JTextField cadastroresp;
    private javax.swing.JTextField cadastroserie;
    private javax.swing.JLabel dadoscurso;
    private javax.swing.JLabel dadosidade;
    private javax.swing.JLabel dadosnascimento;
    private javax.swing.JLabel dadosnome;
    private javax.swing.JLabel dadosresp;
    private javax.swing.JLabel dadosserie;
    private javax.swing.JRadioButton eletro;
    private javax.swing.ButtonGroup grupobotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lcadastronascimento;
    private javax.swing.JLabel lcadastronome;
    private javax.swing.JLabel lcadastroresp;
    private javax.swing.JLabel lcadastroserie;
    private javax.swing.JLabel ldadoscurso;
    private javax.swing.JLabel ldadosidade;
    private javax.swing.JLabel ldadosnascimento;
    private javax.swing.JLabel ldadosnome;
    private javax.swing.JLabel ldadosresp;
    private javax.swing.JLabel ldadosserie;
    private javax.swing.JPanel painelcadastro;
    private javax.swing.JPanel painelcor;
    private javax.swing.JPanel paineldados;
    private javax.swing.JButton saircadastro;
    private javax.swing.JButton sairdados;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
