package model.ModelVendas;

import model.ModelProducts.Produto;

public class ItemVenda {
    private Produto produto;
    private int quantidade;
    private double valorUnidade;
    private double valorTotal;

    public ItemVenda(Produto produto, int quantidade, double valorUnidade, double valorTotal) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnidade = valorUnidade;
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                ", valorUnidade=" + valorUnidade +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
