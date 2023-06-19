package model.ModelProducts;


public class MedicamentoControlado extends Medicamento{

    public MedicamentoControlado(){

    }

    public double desconto(double valor){
        return valor * 0.03;
    }
    public String exibirDadosMedicamentoControlado() {
        return exibirDadosMedicamento();
    }
}
