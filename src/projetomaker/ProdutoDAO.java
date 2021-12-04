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
            produto.setCodProduto(rs.getString("codProduto"));
            produto.setDescricao(rs.getString("descricao"));
            produto.setPreco(Integer.parseInt(rs.getString("preco")));
            produto.setQtdEstoque(Integer.parseInt(rs.getString("qtdEstoque")));
            produto.setIdEmpresa(Integer.parseInt(rs.getString("idEmpresa")));
            produto.setEmpresa(rs.getString("empresa"));
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Produto não Encontrado!";
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

  public boolean excluir(Produto produto) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de exclusão na tabela Alunos 
        String consulta = "DELETE from Produto WHERE id="+produto.getId();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Produto não Excluído!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }
  public boolean alterar(Produto produto) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de alteração na tabela Cliente 
        String consulta = "UPDATE Produto SET id="
                + produto.getId() + ",nome='" + produto.getNome()+ "', descricao='" + produto.getDescricao()+ "', preco='" + produto.getPreco()+ "', qtdEstoque='" + produto.getQtdEstoque()+ "' WHERE id=" + produto.getId();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Produto não Alterado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }
    
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }
  
  
  public boolean reduzir(Produto produto) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de alteração na tabela Cliente 
                String consulta = "UPDATE Produto SET id="
                + produto.getId() + ",qtdEstoque='" + produto.getQtdEstoque() + "' WHERE id=" + produto.getId();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Estoque não reduzido!";
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
