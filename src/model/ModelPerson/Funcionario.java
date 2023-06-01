package model.ModelPerson;

import java.time.LocalDate;

public class Funcionario extends Pessoa {

    private String ctps;

    public Funcionario() {

    }

    public Funcionario(String ctps) {
        this.ctps = ctps;
    }

    public Funcionario(int codigo, String nome, String cpf, LocalDate dataNascimento, String ctps) {
        super(codigo, nome, cpf, dataNascimento);
        this.ctps = ctps;
    }


    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "ctps='" + ctps + '\'' +
                '}';
    }
}
