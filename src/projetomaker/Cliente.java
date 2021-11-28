/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomaker;

public class Cliente extends Pessoa {
    
    public Cliente(){
        
    }
    
    public Cliente(String nome, String email, int telefone, String rua, String bairro, String cidade, String estado, String pais, String complemento, String tipoDoEndereco,int numero) {
      super.CadastrarPessoa(nome, email, telefone);
      super.Endereco.Cadastrar(rua, bairro,  cidade,  estado,  pais,  complemento,  tipoDoEndereco, numero);
    }
}
