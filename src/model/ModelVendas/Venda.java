package model.ModelVendas;

import model.ModelPerson.Cliente;
import model.ModelPerson.Funcionario;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venda {
    private int codigo;
    private Funcionario funcionario;
    private Cliente cliente;
    private LocalDate data;
    private double valorProdutos;
    private double desconto;
    private double valorTotal;
    private static ArrayList<ItemVenda> itens = new ArrayList<>();

    public Venda(int codigo, Funcionario funcionario, Cliente cliente, LocalDate data, double valorProdutos, double desconto, double valorTotal) {
        this.codigo = codigo;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.data = data;
        this.valorProdutos = valorProdutos;
        this.desconto = desconto;
        this.valorTotal = valorTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorProdutos() {
        return valorProdutos;
    }

    public void setValorProdutos(double valorProdutos) {
        this.valorProdutos = valorProdutos;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public static ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public static void setItens(ArrayList<ItemVenda> itens) {
        Venda.itens = itens;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "codigo=" + codigo +
                ", funcionario=" + funcionario +
                ", cliente=" + cliente +
                ", data=" + data +
                ", valorProdutos=" + valorProdutos +
                ", desconto=" + desconto +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
