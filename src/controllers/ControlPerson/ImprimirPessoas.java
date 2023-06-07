package controllers.ControlPerson;

import model.ModelPerson.Cliente;
import model.ModelPerson.Funcionario;
import util.Input;

import java.util.ArrayList;

public class ImprimirPessoas {

    public static void menuImprimirPessoa(){

        boolean travaTela = true;

        do{
            System.out.println("============Menu Impressão=============");
            System.out.println("| 1 - Buscar Cliente                   |");//a fazer
            System.out.println("| 2 - Imprimir todos os Clientes       |");
            System.out.println("| 3 - Buscar Funcionário               |");//a fazer
            System.out.println("| 4 - Imprimir todos os Funcionários   |");
            System.out.println("| 0 - Voltar                           |");
            System.out.println("========================================");
            System.out.print("Resposta: ");
            int op = Input.nextInt();
            switch (op){
                case 1 -> buscarCliente();
                case 2 -> ControlePessoas.imprimirListaCliente();
                case 3 -> buscarFuncionario();
                case 4 -> ControlePessoas.imprimirListaFuncionario();
                case 0 -> travaTela = false;
                default -> System.out.println("Opção incorreta, tente novamente.");
            }
        }while(travaTela);

    }

    private static void buscarCliente(){
        System.out.println("Insira o código do cliente: ");
        int codigo = Input.nextInt();

        try{
            for(Cliente lista : ControlePessoas.listaClientes){
                if(lista.getCodigo() == codigo){
                    System.out.println(lista.exibirDadosCliente());
                }
            }
        }catch(Exception ex){
            System.out.println("Cliente não encontrado !");
        }
    }
    private static void buscarFuncionario(){
        System.out.println("Insira o código do funcionario: ");
        int codigo = Input.nextInt();

       try {
           for(Funcionario lista : ControlePessoas.listaFuncionarios){
               if(lista.getCodigo() == codigo){
                   System.out.println(lista.exibirDadosFuncionario());
               }
           }
       }catch(Exception ex){
           System.out.println("Funcionário não encontrado");
       }
    }
}
