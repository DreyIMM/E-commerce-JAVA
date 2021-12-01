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


// Classe de controle da manipução das operações no 
// Banco de dados da classe Aluno
public class ProdutoDAO {
  // Método para realizar a busca na Tabela Alunos dos dados do registro
  // do aluno identificado pelo id

  //
  public Produto buscarProdutoUnico(int id) {
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Aluno para retornar os dados do registro
    Produto produto = new Produto();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela Alunos através do id
        String consulta = "select * from Produto where id="+String.valueOf(id).trim();
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta
        rs = stm.executeQuery();
        // Existindo resultado os valores dos campos são transferidos
        // para o objeto Aluno
        if (rs.next()) {
          if (Integer.parseInt(rs.getString("id")) > 0) {
            produto.setNome(rs.getString("nome"));
            produto.setEmpresa(rs.getString("empresa"));
            produto.setPreco(Float.parseFloat(rs.getString("preco")));
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Fornecedor não Encontrado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return null;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Retorna um objeto produto com os dados do registro da tabela
    return produto;
  }

  // Método para realizar a inclusão de um no registro na Tabela Produto (FUNCIONANDO)
    public boolean inserir(Produto produto) {
    // Cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de inclusão na tabela Fornecedor    
        String consulta = "INSERT into Produto (nome, codProduto, descricao, preco, qtdEstoque, idEmpresa, empresa) "
                + "VALUES('" + produto.getNome() + "','"
                + produto.getCodProduto() + "','" + produto.getDescricao() +"','"+ produto.getPreco() +"','"+ produto.getQtdEstoque() +"','" +produto.getIdEmpresa() +"','"+ produto.getEmpresa() + "')";                                                    
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      
      } catch (SQLException e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Fornecedor não Incluído!";
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

  public boolean excluir(Fornecedor fornecedor) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de exclusão na tabela Alunos 
        String consulta = "DELETE from Fornecedor WHERE id="+fornecedor.getId();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Fornecedor não Excluído!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

  
  
    // Método para realizar a busca na Tabela Alunos dos dados do registro
    // do aluno identificado pelo id
  
  
//  public int buscarProdutoUnico(int idProduto) {
//    boolean resp=false;
//    
//    // Cria um objeto de Conexão com o Banco de Dados
//    AcessoBD acesso = new AcessoBD();
//    // Cria um objeto Aluno para retornar os dados do registro
//    Fornecedor fornecedor = new Fornecedor();
//    // Cria um ResultSet para armazenar o resultado da pesquisa
//    ResultSet rs;
//    // Tenta realizar a conexão com o banco de Dados para realizar a operação
//    if (acesso.conectar()) {
//      // Tramento de exceções
//      try {
//        // Define a consulta na tabela Alunos através do id
//        String consulta = "select * from Fornecedor where matricula="
//                + String.valueOf(mat).trim();
//        // Cria um objeto para realizar a consulta
//        PreparedStatement stm = acesso.con.prepareStatement(consulta);
//        // Executa a consulta
//        rs = stm.executeQuery();
//        // Existindo resultado os valores dos campos são transferidos
//        // para o objeto Aluno
//        if (rs.next()) {
//          resp = true;
//        }
//      } catch (Exception e) {
//        // Informa caso a operação não tenha obtido sucesso
//
//        String mensagem = "Aluno não Encontrado!";
//        JOptionPane.showMessageDialog(null, mensagem);
//        resp = false;
//      }
//    }
//    // Desconecta com o Banco após realizar a operação
//    acesso.desconectar();
//    // Retorna um objeto Aluno com os dados do registro da tabela
//    return resp;
//  }
  
  
  
}
