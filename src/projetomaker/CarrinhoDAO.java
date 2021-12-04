 package projetomaker;
// Bibliotecas necessárias
import projetomaker.AcessoBD;
import projetomaker.Fornecedor;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author sicsu
 */
// Classe de controle da manipução das operações no 
// Banco de dados da classe Aluno
public class CarrinhoDAO {
  // Método para realizar a busca na Tabela Alunos dos dados do registro
  // do aluno identificado pelo id

  public Carrinho buscarCarrinho(int id) {
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Aluno para retornar os dados do registro
    Carrinho carrinho = new Carrinho();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela Alunos através do id
       String consulta = "select * from Carrinho"
                + String.valueOf(id).trim();
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta
        rs = stm.executeQuery();
        // Existindo resultado os valores dos campos são transferidos
        // para o objeto Aluno
        if (rs.next()) {
          if (Integer.parseInt(rs.getString("id")) > 0) {
            carrinho.SetNomeProduto(rs.getString("nome"));
            
                
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Produto não encontrado no carrinho";
        JOptionPane.showMessageDialog(null, mensagem);
        return null;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Retorna um objeto fornecedor com os dados do registro da tabela
    return carrinho;
  }

  // Método para realizar a inclusão de um no registro na Tabela Alunos
  public boolean inserir(Carrinho carrinho) {
    // Cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
     
   
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de inclusão na tabela Fornecedor    
        String consulta = "INSERT into Carrinho (nomeProduto, idCliente ,idProduto, valor) "
                + "VALUES('" +carrinho.getNomeProduto()+ "','"+carrinho.getIdCliente() + "','" + carrinho.getIdProduto() + "','"
                + carrinho.getValor() + "')";                                                    
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      
      } catch (SQLException e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Produto não inserido no carrinho!";
        JOptionPane.showMessageDialog(null, mensagem);
        // Informa que a operação NÃO obteve sucesso
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

  public boolean excluir(Carrinho carrinho) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de exclusão na tabela Alunos 
        String consulta = "DELETE from Carrinho WHERE idCliente="+ carrinho.getIdCliente();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Compra não Finalizada!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }
   
  
}
