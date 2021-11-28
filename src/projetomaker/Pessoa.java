/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomaker;

public class Pessoa {
    int id;
    private String nome;
    private String email;
    private int telefone;
    
    //Declarando somente um endereço, pois incialmente não vejo necessidade de mais de um, POREM, o sistema suportará a inclusão de mais de um, (como pedido no enunciado)
    Endereco Endereco = new Endereco();
    
    public Pessoa(){
        
    }
    
 
    
    public Pessoa(String nome, String email, int telefone){
        this.nome = nome; 
        this.email = email;
        this.telefone = telefone;
        
    }
    
    public void CadastrarPessoa(String nome, String email, int telefone){
        this.setNome(nome); 
        this.setEmail(email);
        this.setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
      this.id = id;
    }
    
    
}
