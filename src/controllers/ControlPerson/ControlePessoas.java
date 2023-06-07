package controllers.ControlPerson;

import model.ModelPerson.Cliente;
import model.ModelPerson.Funcionario;
import model.ModelPerson.Pessoa;
import util.Input;

import java.util.ArrayList;

public class ControlePessoas {
    protected static ArrayList<Cliente> listaClientes = new ArrayList<>();
    protected static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    // arquivo utilizado para controle e funções uteis além de armazenar as listas, já que não estamos utilizando banco
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
    protected static void imprimirListaCliente(){
        for (Cliente listaCliente : listaClientes) {
            System.out.println(listaCliente.exibirDadosCliente());
        }
    }
    protected static void imprimirListaFuncionario(){
        for(Funcionario listaFuncionario : listaFuncionarios){
            System.out.println(listaFuncionario.exibirDadosFuncionario());
        }
    }
}
