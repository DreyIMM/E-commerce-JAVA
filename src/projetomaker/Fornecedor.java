package projetomaker;


public class Fornecedor extends Pessoa{
  

    private String nomeEmpresa, Responsavel, Ramo;
  
  
    // Métodos de Acesso
  
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }

    public String getRamo() {
        return Ramo;
    }

    public void setRamo(String Ramo) {
        this.Ramo = Ramo;
    }
  
    // Métodos Construtores

    public Fornecedor() {
    }

    public Fornecedor(String nome, String email, int telefone, String rua, String bairro, String cidade, String estado, String pais, String complemento, String tipoDoEndereco,int numero,String nomeEmpresa, String ramo, String responsavel) {
      super.CadastrarPessoa(nome, email, telefone);
      super.Endereco.Cadastrar(rua, bairro,  cidade,  estado,  pais,  complemento,  tipoDoEndereco, numero);
      this.Ramo = ramo;
      this.Responsavel = responsavel;
      this.nomeEmpresa = nomeEmpresa;
    }

   
}
