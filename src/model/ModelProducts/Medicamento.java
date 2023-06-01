package model.ModelProducts;

import java.time.LocalDate;

public class Medicamento extends Produto{

    private int numRegistro;
    private String composicao;
    private double dosagem;
    public Medicamento() {

    }

    public Medicamento(int numRegistro, String composicao, double dosagem) {
        this.numRegistro = numRegistro;
        this.composicao = composicao;
        this.dosagem = dosagem;
    }

    public Medicamento(int codigo, String descricao, String marca, String lote, LocalDate dataFabricacao, LocalDate dataVencimento, String codigoBarras, double valor, int numRegistro, String composicao, double dosagem) {
        super(codigo, descricao, marca, lote, dataFabricacao, dataVencimento, codigoBarras, valor);
        this.numRegistro = numRegistro;
        this.composicao = composicao;
        this.dosagem = dosagem;
    }



    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }

    public String exibirDadosMedicamento() {
        return exibirDadosMedicamento()+"\nNúmero registro Anvisa: "+getNumRegistro()+"\nComposição: "+getComposicao()+"\nDosagem: "+getDosagem();
    }
}
