package model.ModelProducts;

import java.time.LocalDate;

public class MedicamentoInjetavel extends Medicamento{
    private String funcionarioResponsavel;
    private String cpfPaciente;

    public MedicamentoInjetavel(){

    }
    public MedicamentoInjetavel(int numRegistro, String composicao, double dosagem, String funcionarioResponsavel, String cpfPaciente) {
        super(numRegistro, composicao, dosagem);
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.cpfPaciente = cpfPaciente;
    }

    public MedicamentoInjetavel(int codigo, String descricao, String marca, String lote, LocalDate dataFabricacao, LocalDate dataVencimento, String codigoBarras, double valor, int numRegistro, String composicao, double dosagem, String funcionarioResponsavel, String cpfPaciente) {
        super(codigo, descricao, marca, lote, dataFabricacao, dataVencimento, codigoBarras, valor, numRegistro, composicao, dosagem);
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.cpfPaciente = cpfPaciente;
    }

    public String getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(String funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String exibirDadosMedicamentoInjetavel() {
        return exibirDadosMedicamento()+"\nFuncionário responsável: "+getFuncionarioResponsavel()+"\nCPF do Paciente: "+getCpfPaciente();
    }
}
