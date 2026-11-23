package model;

import interfaces.Calculavel;

public class Venda implements Calculavel {

    private final int id;
    private Produto produto;
    private int quantidade;

    public Venda(int id, Produto produto, int quantidade) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double calcularTotal() {
        return produto.getPreco() * quantidade;
    }
}