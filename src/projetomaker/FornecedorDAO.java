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
public class FornecedorDAO {
  // Método para realizar a busca na Tabela Alunos dos dados do registro
  // do aluno identificado pelo id

  public Fornecedor buscarFornecedor(int id) {
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Aluno para retornar os dados do registro
    Fornecedor fornecedor = new Fornecedor();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela Alunos através do id
        String consulta = "select * from Fornecedor where id="
                + String.valueOf(id).trim();
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta
        rs = stm.executeQuery();
        // Existindo resultado os valores dos campos são transferidos
        // para o objeto Aluno
        if (rs.next()) {
          if (Integer.parseInt(rs.getString("id")) > 0) {
            fornecedor.setId(Integer.parseInt(rs.getString("id")));
            fornecedor.setNome(rs.getString("nome"));
            fornecedor.setNomeEmpresa(rs.getString("empresa"));
            fornecedor.setResponsavel(rs.getString("responsavel"));
            fornecedor.setTelefone(Integer.parseInt(rs.getString("telefone")));
            fornecedor.setRamo(rs.getString("ramo"));
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
    // Retorna um objeto fornecedor com os dados do registro da tabela
    return fornecedor;
  }

  // Método para realizar a inclusão de um no registro na Tabela Alunos
  public boolean inserir(Fornecedor fornecedor) {
    // Cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de inclusão na tabela Fornecedor    
        String consulta = "INSERT into Fornecedor (nome, responsavel, telefone, ramo, empresa, rua, numero, bairro, cidade, tipoEndereco) "
                + "VALUES('" + fornecedor.getNome() + "','"
                + fornecedor.getResponsavel() + "','" + fornecedor.getTelefone() + "','" + fornecedor.getRamo() + "','" + fornecedor.getNomeEmpresa() + "','" + fornecedor.Endereco.getRua()+ "','" + fornecedor.Endereco.getNumero() + "','" + fornecedor.Endereco.getBairro()+ "','" + fornecedor.Endereco.getCidade() + "','" + fornecedor.Endereco.getTipoDoEndereco()+  "')";                                                    
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

  public boolean ListarFornecedor() {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Aluno armazenar os dados de cada registro da tabela
    Fornecedor fornecedor = new Fornecedor();
    // Cria um ResultaSet para armazenar os registros resultantes da consulta
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        String mensagem =
              "O resultado será exibido no ambiente de execução em modo texto!";
        JOptionPane.showMessageDialog(null, mensagem);
        // Define a consulta de busca dos registros na tabela Alunos 
        String consulta = "select * from fornecedor";
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta ao Banco e armazena o resultado no ResultSet
        rs = stm.executeQuery();
        // Formata o título do relatório
        
        
        String linha = String.format("%3s|%-15s|%10s|%10s",
                "id", "nome", "Responsavel", "Telefone", "Categoria", "Empresa");
        // Exibe o título do relatório
        System.out.println(linha);
        // Enquanto houver registros, o objeto Aluno recebe os dados 
        // de cada registro da tabela
        while (rs.next()) {
          if (Integer.parseInt(rs.getString("id")) > 0) {
              
              
            fornecedor.setId(Integer.parseInt(rs.getString("id")));
            fornecedor.setResponsavel(rs.getString("reponsavel"));
            fornecedor.setNomeEmpresa(rs.getString("empresa"));
            fornecedor.setNome(rs.getString("nome"));
            fornecedor.setRamo(rs.getString("ramo"));
            // Formata a linha de conteúdo do relatório
            linha = String.format("%3s|%-15s|%10s|%10s|%10s|%10s", rs.getString("id"),
                    rs.getString("responsavel"), rs.getString("empresa"),
                    rs.getString("telefone"), rs.getString("nome"), rs.getString("ramo"));
            // Exibe cada registro
            System.out.println(linha);
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        System.out.println("Lista não Gerada!");
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
//
//  public boolean buscarFornecedor(String mat) {
//    boolean resp=false;
//    mat = mat.trim();
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
