package model.ModelProducts;

public class MedicamentoInjetavel extends Medicamento{

    public MedicamentoInjetavel(){

    }
    public double desconto(double valor){
        return (valor * 0.05);
    }
    public String exibirDadosMedicamentoInjetavel() {
        return exibirDadosMedicamento();
    }
}
