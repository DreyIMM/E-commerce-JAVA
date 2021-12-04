package projetomaker;

import projetomaker.ClienteDAO;
import projetomaker.Cliente;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author sicsu
 */
public class TelaDadosCliente extends javax.swing.JFrame {

  // Atributos da clsses para ficarem disponíveis para todos os métodos
  int operacao;
  int id;

  // Construtor da janela alterado para receber o tipo de operação (1, 2 ou 3)
  // e o id do registro no banco, se id = 0 é uma inclusão
  public TelaDadosCliente(int operation, int idc) {
    initComponents();
    // repassa os dados recebidos para os atributos da classe
    this.operacao = operation;
    this.id = idc;
    // Limpa os conteúdos das caixas de texto
    tfNome.setText("");
    tfEmail.setText("");
    tfTelefone.setText("");
    tfRua.setText("");
    tfNumero.setText("");
    tfBairro.setText("");
    tfCidade.setText("");
    tfTipoDoEndereco.setText("");
    // Altera a fonte do Label de Título da janela
    lb1.setFont(new Font("Times Roman", Font.PLAIN, 14));
    if (operacao == 1) {
      // Determina o título da janela para uma inclusão
      lb1.setText("Inclusão");
    }
    if (operacao == 2) {
      // Determina o título da janela para uma alteração
      lb1.setText("Alteração");
      // Cria um objeto aluno para receber os dados da consulta
      Cliente c1 = new Cliente();
      // Cria um objeto AlunoDAO para uso dos métodos de acesso
      // ao banco para os alunos
      ClienteDAO cd = new ClienteDAO();
      // Realiza a busca no Banco os dados do registro do aluno
      // através do id
      c1 = cd.bucasCliente(id);
      // Preenche as caixas de texto com os dados do cliente
      tfNome.setText(c1.getNome());
      tfEmail.setText(c1.getEmail());
      tfTelefone.setText(String.valueOf(c1.getTelefone()));
      tfRua.setText(c1.Endereco.getRua());
      tfBairro.setText(c1.Endereco.getBairro());
      tfCidade.setText(c1.Endereco.getCidade());
      tfTipoDoEndereco.setText(c1.Endereco.getTipoDoEndereco());
      tfNumero.setText(String.valueOf(c1.Endereco.getNumero()));
    }
    if (operacao == 3) {
      // Determina o título da janela para uma exclusão
      lb1.setText("Exclusão");
      // Cria um objeto aluno para receber os dados da consulta
       Cliente c1 = new Cliente();
      // Cria um objeto AlunoDAO para uso dos métodos de acesso
      // ao banco para os alunos
       ClienteDAO cd = new ClienteDAO();
      // Realiza a busca no Banco os dados do registro do aluno
      // através do id
        c1 = cd.bucasCliente(id);
      // Preenche as caixas de texto com os dados do aluno
        tfNome.setText(c1.getNome());
        tfEmail.setText(c1.getEmail());
        tfTelefone.setText(String.valueOf(c1.getTelefone()));
               
     
    }
  }

  /**
   * O conteúdo a seguir foi gerado pelo NetBeans na criação da tela e não pode
   * ser alterado.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btConfirmar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        lb1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfTipoDoEndereco = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lb2.setText("Nome");

        lb3.setText("Email");

        lb4.setText("Telefone");

        tfNome.setText("jTextField1");
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        tfEmail.setText("jTextField2");

        tfTelefone.setText("jTextField3");

        lb1.setText("Cadastro de fornecedores");

        jLabel1.setText("                                                Endereço");

        jLabel2.setText("Rua");

        jLabel3.setText("Bairro");

        jLabel4.setText("Cidade");

        jLabel6.setText("Numero");

        jLabel7.setText("Tipo do endereço");

        tfRua.setText("jTextField1");
        tfRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRuaActionPerformed(evt);
            }
        });

        tfNumero.setText("jTextField2");
        tfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroActionPerformed(evt);
            }
        });

        tfBairro.setText("jTextField3");
        tfBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBairroActionPerformed(evt);
            }
        });

        tfCidade.setText("jTextField4");

        tfTipoDoEndereco.setText("jTextField5");
        tfTipoDoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTipoDoEnderecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb4)
                    .addComponent(lb3)
                    .addComponent(lb2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTelefone)
                    .addComponent(tfEmail)
                    .addComponent(tfNome))
                .addGap(57, 57, 57))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lb1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(btConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCancelar)
                                .addGap(60, 60, 60))
                            .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTipoDoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb4)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTipoDoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmar)
                    .addComponent(btCancelar))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Método do botão de Confirmação
    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
      if (operacao == 1) { // Inclusão
        // Cria um objeto aluno para receber os dados da do preenchimento 
        // da tela
        Cliente c1 = new Cliente();
        // Cria um objeto AlunoDAO para uso dos métodos de acesso
        // ao banco para os alunos
        ClienteDAO cd = new ClienteDAO();
        // Determina os valores dos atributos do objeto aluno, com os dados
        // preenchidos na tela
        // o id é gerado automaticamente pelo Access
        c1.setNome(tfNome.getText());
        c1.setEmail(tfEmail.getText());
        c1.setTelefone(Integer.parseInt(tfTelefone.getText()));
        
        
        c1.Endereco.setRua(tfRua.getText());
        c1.Endereco.setNumero(Integer.parseInt(tfNumero.getText()));
        c1.Endereco.setBairro(tfBairro.getText());
        c1.Endereco.setCidade(tfCidade.getText());
        c1.Endereco.setTipoDoEndereco(tfTipoDoEndereco.getText());
        
        // Verifica se a operação de inserção obteve sucesso
        if (cd.inserir(c1)) {
          String mensagem = "Cliente Inserido!";
          JOptionPane.showMessageDialog(null, mensagem);
        }
      }else if (operacao == 2) { // Alteração
        // Cria um objeto aluno para receber os dados da do preenchimento 
        // da tela
        Cliente c1 = new Cliente();
        // Cria um objeto AlunoDAO para uso dos métodos de acesso
        // ao banco para os alunos
        ClienteDAO cd = new ClienteDAO();
        // Determina os valores dos atributos do objeto aluno, com os dados
        // preenchidos na tela
        // o id irá ser usado para determinar o registro a ser alterado
       
        c1.setId(id);
        c1.setNome(tfNome.getText());
        c1.setEmail(tfEmail.getText());
        c1.setTelefone(Integer.parseInt(tfTelefone.getText().toString()));
        c1.Endereco.setRua(tfRua.getText());
        c1.Endereco.setNumero(Integer.parseInt(tfNumero.getText().toString()));
        c1.Endereco.setBairro(tfBairro.getText());
        c1.Endereco.setCidade(tfCidade.getText());
        c1.Endereco.setTipoDoEndereco(tfTipoDoEndereco.getText());
       
        // Verifica se a operação de alteração obteve sucesso
        if (cd.alterar(c1)) {
          String mensagem = "Cliente Alterado!";
          JOptionPane.showMessageDialog(null, mensagem);
        }
      } else if (operacao == 3) { // Exclusão
        // Cria um objeto aluno para receber os dados da do preenchimento 
        // da tela
        Cliente c1 = new Cliente();
        // Cria um objeto AlunoDAO para uso dos métodos de acesso
        // ao banco para os alunos
        ClienteDAO cd = new ClienteDAO();
        // Determina os valores dos atributos do objeto aluno, com os dados
        // preenchidos na tela
        // o id irá ser usado para determinar o registro a ser alterado
        c1.setId(id);
        c1.setNome(tfNome.getText());
        c1.setTelefone(Integer.parseInt(tfTelefone.getText()));
        // Verifica se a operação de exclusão obteve sucesso
        if (cd.excluir(c1)) {
          String mensagem = "Cliente Excluído!";
          JOptionPane.showMessageDialog(null, mensagem);
        }
      }
      this.dispose();
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
      // TODO add your handling code here:
      this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfTipoDoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTipoDoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTipoDoEnderecoActionPerformed

    private void tfRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRuaActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroActionPerformed

    private void tfBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBairroActionPerformed

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
      java.util.logging.Logger.getLogger(TelaDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      // A chamada deste método foi alterada para atender 
      // a nova assinatura do método construtor da classe da janela
      // foram usados os valores 0 e 0 apenas compatibilizar
      // a janela será criada a partir da janela principal
      // este método é responsável pela execução da própria classe
      // em nosso projeto a tela será instanciada pela tela principal
      public void run() {
        new TelaDadosCliente(0, 0).setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfTipoDoEndereco;
    // End of variables declaration//GEN-END:variables
}
