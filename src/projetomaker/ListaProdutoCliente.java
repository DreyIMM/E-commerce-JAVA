package projetomaker;

// Bibliotecas de classes para uso da classe
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sicsu
 */
public class ListaProdutoCliente extends javax.swing.JFrame {

    // Criação de um objeto Acesso para uso em todos os métodos
    AcessoBD acesso = new AcessoBD();
    // Criação de um RecordSet para receber os registros das consultas
    ResultSet rs;
    int operacao;
    int id;
    
   public ListaProdutoCliente(){
       initComponents();
   }
    
    public ListaProdutoCliente(int id){
        this.id = id;
        initComponents();
    }
    

  /**
   * O conteúdo a seguir foi gerado pelo NetBeans na criação da tela e não pode
   * ser alterado.
   */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        btTelaComprar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        lista.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        btTelaComprar.setText("Comprar");
        btTelaComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTelaComprarActionPerformed(evt);
            }
        });

        btAlterar.setText("Carrinho");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        jLabel1.setText("Lista de produtos");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btTelaComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(202, 202, 202))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btTelaComprar)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   // Método do botão de inclusão
    private void btTelaComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTelaComprarActionPerformed
        // Executa a janela de comprar produto
        // 1o parâmetro = 1 chamara a uma função dentro de TelaDadosComprarDAO, onde acessa o banco de 
        
        if (lista.getSelectedIndex() != 0) {
            String id = lista.getSelectedValue().substring(0, 3);
            if (Integer.parseInt(id.trim()) <= 0) {
                String mensagem = "Opção inválida!";
                JOptionPane.showMessageDialog(null, mensagem);
            }
            String nomeEmpresa = lista.getSelectedValue().substring(0,20);
            TelaDadosComprar tcompras = new TelaDadosComprar(Integer.parseInt(id.trim()));
            tcompras.setVisible(true);
            // Configura os comonentes que serão liberados ou restringidos
        } // Verificação de segurança
        else {
            String mensagem = "Opção inválida!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
        
        
       
        
    }//GEN-LAST:event_btTelaComprarActionPerformed
    // Método do botão de Alteração
    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        // A primeira linha possui o título e não um registro válido
        // Verifica se a linha de título está selecionada, índice = 0
        // o trim() é necessário para eliminar os espaços na conversão
        TelaCarrinho tc = new TelaCarrinho();
        tc.setVisible(true);
    }//GEN-LAST:event_btAlterarActionPerformed

  private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    preencherLista();
  }//GEN-LAST:event_formWindowGainedFocus

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    this.dispose();
  }//GEN-LAST:event_jButton1ActionPerformed
    // Método auxiliar da Janela de controle para preenchimento do
    // componente JList
    // Retorna o status da operação 
    public boolean preencherLista() {
        // Tratamento de Exceções
        try {
            acesso.conectar();
            // Determina a consulta a ser realizada
            String consulta = "select * from Produto";
            // Cria um objeto e prepara para realização da consulta
            PreparedStatement stm = acesso.con.prepareStatement(consulta);
            // Executa a consulta ao Banco
            rs = stm.executeQuery();
            // Cria um ArrayList para receber os registros da consulta e
            // preencher a lista
            ArrayList<String> ar = new ArrayList();
            // Formata a linha de título do JList
            String linha = String.format("%3s|%-10s|%15s|%10s|%5s|%10s", 
                    "Id", "Nome", "Descricao", "Preco" , "Estoque", "Empresa");
            // Adiciona a linha ao ArrayList
            ar.add(linha);
            // Enquanto houver registros
            while (rs.next()) {
                // Formata a linha de registros da lista
                linha = String.format("%3s|%-15s|%-15s|%3s|%5s|%15s", rs.getString("id"),
                        rs.getString("nome"),rs.getString("descricao"),  
                        rs.getString("preco"), rs.getString("qtdEstoque"), rs.getString("empresa"));
                // Adiciona a linha ao ArrayList
                ar.add(linha);
            }
            // Vetor para preparação dos elementos da lista
            String vet[] = new String[ar.size()];
            // Carrega todos os elementos do ArrayList no vetor
            for (int i = 0; i < ar.size(); i++) {
                vet[i] = ar.get(i);
            }
            // Prepara o JList para exibir os dados com fonte plena,
            // Evita que os dados fiquem fora de ordem
            lista.setFont(new Font("Courier New", Font.PLAIN, 11));
            // Inclui os elemento do vetor no JList
            lista.setListData(vet);
            // Seleciona um elemento da lista (o primeiro) para 
            // evitar que o usuário utlize a alteração ou exclusão
            // sem nenhuma escolha
            lista.setSelectedIndex(1);
            // confirma a execução com sucesso
            return true;
            //lista.add(dlm);    
        } catch (Exception e) { // Tratamento de exceção
            String mensagem = "Exceção! Lista não preenchida!";
            System.out.println(e.getMessage());
            e.getStackTrace();
            JOptionPane.showMessageDialog(null, mensagem);
            // Retorna que a execução não obteve sucesso
            return false;
        } finally{
          acesso.desconectar();
        }

    }

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
            java.util.logging.Logger.getLogger(ListaProdutoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProdutoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProdutoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProdutoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btTelaComprar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> lista;
    // End of variables declaration//GEN-END:variables
}
