package model.ModelPerson;

import java.time.LocalDate;

public class Cliente extends Pessoa{

    private String email;

    public Cliente(String email) {
        this.email = email;
    }

    public Cliente(int codigo, String nome, String cpf, LocalDate dataNascimento, String email) {
        super(codigo, nome, cpf, dataNascimento);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "email='" + email + '\'' +
                '}';
    }
}
