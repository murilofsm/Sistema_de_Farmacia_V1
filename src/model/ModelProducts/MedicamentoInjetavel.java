package model.ModelProducts;

public class MedicamentoInjetavel extends Medicamento{

    public MedicamentoInjetavel(){

    }
    public double desconto(double valor){
        return valor * 0;
    }
    public String exibirDadosMedicamentoInjetavel() {
        return exibirDadosMedicamento();
    }
}
