package model.ModelProducts;

import java.time.LocalDate;

public class MedicamentoControlado extends Medicamento{
    private String crmMedico;
    private String cpfPaciente;
    public MedicamentoControlado(){

    }

    public MedicamentoControlado(int numRegistro, String composicao, double dosagem, String crmMedico, String cpfPaciente) {
        super(numRegistro, composicao, dosagem);
        this.crmMedico = crmMedico;
        this.cpfPaciente = cpfPaciente;
    }

    public MedicamentoControlado(int codigo, String descricao, String marca, String lote, LocalDate dataFabricacao, LocalDate dataVencimento, String codigoBarras, double valor, int numRegistro, String composicao, double dosagem, String crmMedico, String cpfPaciente) {
        super(codigo, descricao, marca, lote, dataFabricacao, dataVencimento, codigoBarras, valor, numRegistro, composicao, dosagem);
        this.crmMedico = crmMedico;
        this.cpfPaciente = cpfPaciente;
    }

    public String getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(String crmMedico) {
        this.crmMedico = crmMedico;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    @Override
    public String toString() {
        return "MedicamentoControlado{" +
                "crmMedico='" + crmMedico + '\'' +
                ", cpfPaciente='" + cpfPaciente + '\'' +
                '}';
    }
}
