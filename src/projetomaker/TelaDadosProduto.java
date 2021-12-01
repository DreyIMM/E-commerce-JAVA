package projetomaker;

import projetomaker.ClienteDAO;
import projetomaker.Cliente;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author sicsu
 */
public class TelaDadosProduto extends javax.swing.JFrame {

  // Atributos da clsses para ficarem disponíveis para todos os métodos
    int operacao;
    static int id;
    static String nomeEmpresa;
  
  // Construtor da janela alterado para receber o tipo de operação (1, 2 ou 3)
  // e o id do registro no banco, se id = 0 é uma inclusão
  public TelaDadosProduto(String empresa, int id){
     this.nomeEmpresa = empresa;
     this.id = id;
     
    }
  
  public TelaDadosProduto(int operacao, int id) {
    initComponents();
    // repassa os dados recebidos para os atributos da classe
    this.operacao = operacao;
 
    // Limpa os conteúdos das caixas de texto
    tfNome.setText("");
    tfCodProduto.setText("");
    tfDescricao.setText("");
    tfPreco.setText("");
    tfEstoque.setText("");
    tfEmpresa.setText(nomeEmpresa);
    tdIdEmpresa.setText(String.valueOf(id));
    
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
      // Preenche as caixas de texto com os dados do aluno
      tfNome.setText(c1.getNome());
      
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
        tfCodProduto.setText(c1.getEmail());
        tfDescricao.setText(String.valueOf(c1.getTelefone()));
        
       
     
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
        tfCodProduto = new javax.swing.JTextField();
        tfDescricao = new javax.swing.JTextField();
        lb1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfPreco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfEmpresa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tdIdEmpresa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfEstoque = new javax.swing.JTextField();

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

        lb3.setText("CodProduto");

        lb4.setText("Descricao");

        tfNome.setText("jTextField1");
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        tfCodProduto.setText("jTextField2");

        tfDescricao.setText("jTextField3");

        lb1.setText("Cadastro do Produto");

        jLabel8.setText("Preco");

        tfPreco.setText("jTextField1");

        jLabel9.setText("Empresa");

        tfEmpresa.setText("jTextField2");

        jLabel10.setText("ID-Empresa");

        tdIdEmpresa.setText("jTextField3");

        jLabel11.setText("Estoque ");

        tfEstoque.setText("jTextField4");
        tfEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lb1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btCancelar)
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tdIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(216, 216, 216))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb4)
                            .addComponent(lb3)
                            .addComponent(lb2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDescricao)
                                    .addComponent(tfCodProduto)
                                    .addComponent(tfNome))
                                .addGap(57, 57, 57))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(tfEstoque))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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
                    .addComponent(tfCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb4)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tdIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmar)
                    .addComponent(btCancelar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Método do botão de Confirmação
    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
      if (operacao == 1) { // Inclusão
        // Cria um objeto aluno para receber os dados da do preenchimento 
        // da tela
        Produto p1 = new Produto();
        // Cria um objeto AlunoDAO para uso dos métodos de acesso
        // ao banco para os alunos
        ProdutoDAO pd = new ProdutoDAO();
        // Determina os valores dos atributos do objeto aluno, com os dados
        // preenchidos na tela
        // o id é gerado automaticamente pelo Access
        p1.setNome(tfNome.getText());
        p1.setCodProduto(tfCodProduto.getText());
        p1.setDescricao(tfDescricao.getText());
        p1.setPreco(Float.parseFloat(tfPreco.getText()));
        p1.setQtdEstoque(Integer.parseInt(tfEstoque.getText()));
        p1.setIdEmpresa(Integer.parseInt(tdIdEmpresa.getText()));
        p1.setEmpresa(tfEmpresa.getText());
        
        // Verifica se a operação de inserção obteve sucesso
        if (pd.inserir(p1)) {
          String mensagem = "Produto Cadastrado Inserido!";
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
        c1.setTelefone(Integer.parseInt(tfDescricao.getText()));
        // Verifica se a operação de exclusão obteve sucesso
        if (cd.excluir(c1)) {
          String mensagem = "Fornecedor Excluído!";
          JOptionPane.showMessageDialog(null, mensagem);
        }
      }
      this.dispose();
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
      // TODO add your handling code here:
      this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEstoqueActionPerformed

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
      java.util.logging.Logger.getLogger(TelaDadosProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaDadosProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaDadosProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaDadosProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        new TelaDadosProduto(0, 0).setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JTextField tdIdEmpresa;
    private javax.swing.JTextField tfCodProduto;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfEmpresa;
    private javax.swing.JTextField tfEstoque;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables
}
