/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomaker;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String complemento;
    private String tipoDoEndereco;
    private int numero;
    
    public Endereco(){
        
    }
    
    public Endereco(String rua, String bairro, String cidade, String estado, String pais, String complemento, String tipoDoEndereco,int numero){
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.complemento = complemento;
        this.tipoDoEndereco = tipoDoEndereco;
        this.numero = numero;
    }
    
    public void Cadastrar(String rua, String bairro, String cidade, String estado, String pais, String complemento, String tipoDoEndereco,int numero){
        this.setRua(rua);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setPais(pais);
        this.setComplemento(complemento);
        this.setTipoDoEndereco(tipoDoEndereco);
        this.setNumero(numero);
    }
    

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
        
    public String getTipoDoEndereco() {
        return tipoDoEndereco;
    }

    public void setTipoDoEndereco(String tipoDoEndereco) {
        this.tipoDoEndereco = tipoDoEndereco;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
