package controllers.ControlPerson;

import model.ModelPerson.Cliente;
import model.ModelPerson.Funcionario;
import util.Input;

public class ImprimirPessoas {

    protected static void menuImprimirPessoa(){

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
                case 2 -> imprimirListaCliente();
                case 3 -> buscarFuncionario();
                case 4 -> imprimirListaFuncionario();
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
    protected static void imprimirListaCliente(){
        for (int i = 0; i < ControlePessoas.listaClientes.size(); i++) {
            System.out.println(ControlePessoas.listaClientes.get(i).exibirDadosCliente());
        }
    }
    protected static void imprimirListaFuncionario(){
        for (int i = 0; i < ControlePessoas.listaFuncionarios.size(); i++) {
            System.out.println(ControlePessoas.listaFuncionarios.get(i).exibirDadosFuncionario());
        }
    }
}
