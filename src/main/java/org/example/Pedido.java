package org.example;

public class Pedido {

    public int numeroPedido;
    public String nomeCliente;
    public String item;
    private float pagamento;
    private boolean statusPagamento;


    public void retirada(){

    }
    public void pagamento(){

    }
    //metodos getters e setter
    //o metodo get sempre retorna alguma coisa
    //o metodo set nunca retorna nada sempre pega uma variavel
    public void setNumeroPedido(int numeroPedido){
        this.numeroPedido = numeroPedido;
    }
    public int getNumeroPedido(){
        return this.numeroPedido;
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public void setItem(String item){
        this.item = item;
    }
    public String getItem(){
        return this.item;
    }

    public void setPagamento(float pagamento){
        this.pagamento = pagamento;
    }
    public float getPagamento(){
        return this.pagamento;
    }

    public void setStatusPagamento(boolean statusPagamento){
        this.statusPagamento = statusPagamento;
    }
    public boolean getStatusPagamento(){
        return this.statusPagamento;
    }


}
