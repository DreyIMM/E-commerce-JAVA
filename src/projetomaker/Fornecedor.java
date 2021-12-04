package projetomaker;


public class Fornecedor extends Pessoa{
  

    private String nomeEmpresa, responsavel, ramo;
  
  
    // Métodos de Acesso
  
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String Responsavel) {
        this.responsavel = Responsavel;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String Ramo) {
        this.ramo = Ramo;
    }
  
    // Métodos Construtores

    public Fornecedor() {
    }

    public Fornecedor(String nome, String email, int telefone, String rua, String bairro, String cidade, String estado, String pais, String complemento, String tipoDoEndereco,int numero,String nomeEmpresa, String ramo, String responsavel) {
      super.CadastrarPessoa(nome, email, telefone);
      super.Endereco.Cadastrar(rua, bairro,  cidade,  estado,  pais,  complemento,  tipoDoEndereco, numero);
      this.ramo = ramo;
      this.responsavel = responsavel;
      this.nomeEmpresa = nomeEmpresa;
    }

   
}
