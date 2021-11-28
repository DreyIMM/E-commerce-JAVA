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
public class ClienteDAO {
  // Método para realizar a busca na Tabela Alunos dos dados do registro
  // do aluno identificado pelo id

  public Cliente bucasCliente(int id) {
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Aluno para retornar os dados do registro
    Cliente cliente = new Cliente();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela Alunos através do id
       String consulta = "select * from Cliente where id="
                + String.valueOf(id).trim();
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta
        rs = stm.executeQuery();
        // Existindo resultado os valores dos campos são transferidos
        // para o objeto Aluno
        if (rs.next()) {
          if (Integer.parseInt(rs.getString("id")) > 0) {
            cliente.setId(Integer.parseInt(rs.getString("id")));
            cliente.setNome(rs.getString("nome"));
            cliente.setEmail(rs.getString("email"));
            cliente.setTelefone(Integer.parseInt(rs.getString("telefone")));
                
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Cliente não Encontrado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return null;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Retorna um objeto fornecedor com os dados do registro da tabela
    return cliente;
  }

  // Método para realizar a inclusão de um no registro na Tabela Alunos
  public boolean inserir(Cliente cliente) {
    // Cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
     
   
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de inclusão na tabela Fornecedor    
        String consulta = "INSERT into Cliente (nome, email, telefone, rua, numero, bairro, cidade, tipoEndereco) "
                + "VALUES('" + cliente.getNome() + "','"
                + cliente.getEmail() + "','" + cliente.getTelefone() + "','" + cliente.Endereco.getRua()+ "','" + cliente.Endereco.getNumero() + "','" + cliente.Endereco.getBairro()+ "','" + cliente.Endereco.getCidade() + "','" + cliente.Endereco.getTipoDoEndereco()+  "')";                                                    
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      
      } catch (SQLException e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Cliente não Incluído!";
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

  public boolean excluir(Cliente cliente) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de exclusão na tabela Alunos 
        String consulta = "DELETE from Cliente WHERE id="+cliente.getId();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Cliente não Excluído!";
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
