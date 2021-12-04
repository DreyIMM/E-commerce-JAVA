package projetomaker;

import projetomaker.FornecedorDAO;
import projetomaker.Fornecedor;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author sicsu
 */
public class TelaDadosComprar extends javax.swing.JFrame {

    // Atributos da clsses para ficarem disponíveis para todos os métodos
    static int idComprador, idProduto, qtdEstoque;
    static String  nomeComprador, nomeProduto;
    static Float valorProduto, valorFinal;
    ProdutoDAO pdUnico = new ProdutoDAO();
    Produto pUnico = new Produto();
    // Construtor da janela alterado para receber o tipo de operação (1, 2 ou 3)
    // e o id do registro no banco, se id = 0 é uma inclusão
   
    // Foi instanciado na lista clientes, TelaDadosComprador, com isso, tenho acesso ao nomeComprador e o IdComprador
    public TelaDadosComprar(String nComprador, int idComprado){
        this.nomeComprador = nComprador;
        this.idComprador = idComprado;
    }
  
    public TelaDadosComprar(int idPro) {
      initComponents();
      this.idProduto = idPro;
      
      pUnico = pdUnico.buscarProdutoUnico(idProduto);
      
      this.valorProduto = pUnico.getPreco();
      this.qtdEstoque = pUnico.getQtdEstoque();
      this.nomeProduto = pUnico.getNome();
              
      tfIdCliente.setText(nomeComprador);
      tfProduto.setText(pUnico.getNome());
      tfEmpresa.setText(pUnico.getEmpresa());
      tfValor.setText(String.valueOf(pUnico.getPreco()));
      tfQuantidade.setText("");
      
     
      //tfIdCliente.setText(String.valueOf(id));
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
        tfProduto = new javax.swing.JTextField();
        tfEmpresa = new javax.swing.JTextField();
        tfValor = new javax.swing.JTextField();
        lb1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JTextField();
        tfIdCliente = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        btCancelar.setText("Voltar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lb2.setText("Produto");

        lb3.setText("Empresa");

        lb4.setText("Valor R$");

        tfProduto.setText("jTextField1");
        tfProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProdutoActionPerformed(evt);
            }
        });

        tfEmpresa.setText("jTextField2");
        tfEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmpresaActionPerformed(evt);
            }
        });

        tfValor.setText("jTextField3");

        lb1.setText("Cliente");

        jLabel8.setText("Quantidade");

        tfQuantidade.setText("jTextField1");

        tfIdCliente.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btCancelar)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lb4)
                    .addComponent(lb3)
                    .addComponent(lb2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEmpresa)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfProduto)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfValor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(lb1)
                .addGap(18, 18, 18)
                .addComponent(tfIdCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1)
                    .addComponent(tfIdCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(tfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(tfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb4)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmar)
                    .addComponent(btCancelar))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Método do botão de Confirmação
    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        int qtdEscolhida = Integer.parseInt(tfQuantidade.getText());
        if(qtdEscolhida > this.qtdEstoque){
            String mensagem = "Quantidade maior que o estoque !";
            JOptionPane.showMessageDialog(null, mensagem);
        }else{
            Carrinho c1 = new Carrinho();
            // Cria um objeto AlunoDAO para uso dos métodos de acesso
            // ao banco para os alunos
            CarrinhoDAO cd = new CarrinhoDAO();
            // Determina os valores dos atributos do objeto aluno, com os dados
            // preenchidos na tela
            // o id é gerado automaticamente pelo Access
            c1.setIdProduto(idProduto);
            valorFinal = (valorProduto * Float.parseFloat(tfQuantidade.getText()));
            
            c1.setValor(valorFinal);
            c1.setIdCliente(idComprador);
            c1.SetNomeProduto(nomeProduto);
            // Verifica se a operação de inserção obteve sucesso
            if (cd.inserir(c1)) {
              String mensagem = "Enviado para o carrinho !";
              pUnico.setQtdEstoque(pUnico.getQtdEstoque() - qtdEscolhida);
              pUnico.setId(idProduto);
              pdUnico.reduzir(pUnico);
              JOptionPane.showMessageDialog(null, mensagem);
            }

            this.dispose();
        }
        
        
        
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
      // TODO add your handling code here:
      this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProdutoActionPerformed

    private void tfEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmpresaActionPerformed

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
      java.util.logging.Logger.getLogger(TelaDadosComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaDadosComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaDadosComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaDadosComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        new TelaDadosComprar(0, 0).setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JTextField tfEmpresa;
    private javax.swing.JLabel tfIdCliente;
    private javax.swing.JTextField tfProduto;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
