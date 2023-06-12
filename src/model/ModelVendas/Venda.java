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

    public Venda(){}

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

    public String exibirDadosVendaAdmin() {
        return  "\nCódigo Venda: " + getCodigo() +
                "\nFuncionario: " + getFuncionario() +
                "\nNome Cliente: " + getCliente().getNome() +
                "\nData: " + getData() +
                "\nValor dos produtos: " + getValorProdutos() +
                "\nDesconto: " + getDesconto() +
                "\nValor total da Compra: " + getValorTotal();
    }
    public String exibirDadosVenda() {
        return  "\nCódigo Venda: " + getCodigo() +
                "\nNome Cliente: " + getCliente().getNome() +
                "\nData: " + getData() +
                "\nValor dos produtos: " + getValorProdutos() +
                "\nDesconto: " + getDesconto() +
                "\nValor total da Compra: " + getValorTotal();
    }
}
