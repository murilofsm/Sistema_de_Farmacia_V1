package controllers.ControlPerson;

import model.ModelPerson.Pessoa;
import model.ModelPerson.Cliente;
import model.ModelPerson.Funcionario;
import util.Input;

public class UtilPerson {

    private static void setarDadosPessoa(Pessoa p){
        System.out.println("Insira o código: ");
        p.setCodigo(Input.nextInt());
        System.out.println("Insira o nome: ");
        p.setNome(Input.nextLine());
        System.out.println("Insira o cpf: ");
        p.setCpf(Input.nextLine());
        System.out.println("Insira a data de nascimento: ");
        p.setDataNascimento(Input.nextLocalDate());
    }

    protected static void setarDadosCliente(Cliente cli){
        setarDadosPessoa(cli);
        System.out.println("Insira o email:");
        cli.setEmail(Input.nextLine());
    }
    protected static void setarDadosFuncionario(Funcionario fun){
        setarDadosPessoa(fun);
        System.out.println("Insira o ctps: ");
        fun.setCtps(Input.nextLine());
    }
}
