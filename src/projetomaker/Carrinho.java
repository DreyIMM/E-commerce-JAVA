
package projetomaker;


public class Carrinho {
    private int idProduto, IdCliente;
    private float valor;

    
    
    
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public int GetIdCliente(){
        return IdCliente;
    }
    
    public void setIdCliente(int idCliente){
        this.IdCliente = idCliente;
    }
}
