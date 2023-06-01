package controllers.ControlPerson;

import model.ModelPerson.Cliente;
import model.ModelPerson.Funcionario;
import util.Input;

import java.util.ArrayList;

public class CadastrosPessoa {
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    public static void menuCadastroPessoa(){
        boolean travaTela = true;

        do{
            System.out.println("=====Menu Cadastro Pessoa=====");
            System.out.println("| 1 - Cadastrar Cliente       |");
            System.out.println("| 2 - Cadastrar Funcionário   |");
            System.out.println("| 0 - Voltar                  |");
            System.out.println("===============================");
            System.out.print("Resposta: ");
            int op = Input.nextInt();
            switch (op){
                case 1 -> cadastrarCliente();
                case 2 -> cadastrarFuncionario();
                case 0 -> travaTela = false;
                default -> System.out.println("Opção incorreta, tente novamente.");
            }
        }while(travaTela);
    }

    private static void cadastrarCliente(){
        Cliente cli = new Cliente();
        UtilPerson.setarDadosCliente(cli);
        listaClientes.add(cli);
    }

    private static void cadastrarFuncionario(){
        Funcionario fun = new Funcionario();
        UtilPerson.setarDadosFuncionario(fun);
        listaFuncionarios.add(fun);
    }
}
