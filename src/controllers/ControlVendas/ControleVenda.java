package controllers.ControlVendas;

import controllers.ControlPerson.ControlePessoas;
import model.ModelVendas.ItemVenda;
import model.ModelVendas.Venda;
import util.Input;

import java.time.LocalDate;
import java.util.ArrayList;

public class ControleVenda {

    /*
    1 - codigo venda // fazer de uma maneira que gere automatico, pra não precisar ficar colocando
    2 - implementar uma funcionalizade para encontrar o funcionário obs( vou fazer por ctps)
    3 - mesma coisa mas com o cliente ( vou fazer por email)
    4 - data automatica // já feito
    5 - valor dos produtos, sem desconto
    6 - desconto, soma total dos descontos
    7 - valorTotal, soma total de todos os produtos com desconto
    8 - carrinho// já feito



     */


    protected static ArrayList<Venda> listaDeVendas = new ArrayList<>();

      public static void menuControleVendas(){
         boolean travaTela = true;
          do{
              System.out.println(" =========Menu Venda=========");
              System.out.println(" | 1 - Imprimir Vendas      |");
              System.out.println(" | 0 - Voltar                   |");
              System.out.println("=================================");
              System.out.print("Resposta: ");
              int op = Input.nextInt();
              switch (op){
                  case 1 -> imprimirVendas();
                  case 0 -> travaTela = false;
                  default -> System.out.println("Opção incorreta, tente novamente.");
              }

          }while(travaTela);
      }



    public static void iniciarVenda(ArrayList<ItemVenda> carrinhoDeProdutos){
        Venda venda = new Venda();
        String ctps;
        String email;
        venda.setCodigo(geradorCodigo());// automatizei o código para não dar problema de ficar repetido

        do{
            System.out.print("Insira o CTPS do Funcionário: ");
            ctps = Input.nextLine();
            if(ControlePessoas.autenticadorFuncionario(ctps) != null){
                venda.setFuncionario(ControlePessoas.autenticadorFuncionario(ctps));
            }
        }while(ControlePessoas.autenticadorFuncionario(ctps) != null);

        do{
            System.out.println("Insira o EMAIL do Cliente: ");
            email = Input.nextLine();
            if(ControlePessoas.autenticadorCliente(email) != null){
                venda.setCliente(ControlePessoas.autenticadorCliente(email));
            }
        }while(ControlePessoas.autenticadorFuncionario(ctps) != null);

        venda.setData(LocalDate.now());

        venda.setValorProdutos(somaValorProdutos(carrinhoDeProdutos));
        venda.setDesconto(0);
        venda.setValorTotal(somaValorProdutos(carrinhoDeProdutos));
        venda.setItens(carrinhoDeProdutos);


    }
    private static double desconto(ArrayList<ItemVenda> carrinhoDeProdutos){
        double soma = 0;
        for (int i = 0; i < carrinhoDeProdutos.size(); i++) {
            soma += carrinhoDeProdutos.get(i).getValorTotal();
        }
        return soma;
    }
    
    private static double somaValorProdutos(ArrayList<ItemVenda> carrinhoDeProdutos){
        double soma = 0;
        for (int i = 0; i < carrinhoDeProdutos.size(); i++) {
            soma += carrinhoDeProdutos.get(i).getValorTotal();
        }
        return soma;
    }


    private static int geradorCodigo(){
        int codVenda = 0;
        while(autenticadorCodigo(codVenda)) {
            codVenda++;
        }
        return codVenda;
    }

    private static boolean autenticadorCodigo(int cod){
        for (int i = 0; i < listaDeVendas.size(); i++) {
            if(listaDeVendas.get(i).getCodigo() == cod){
                return false;
            }
        }
        return true;
    }

    private static void imprimirVendas(){
        for (int i = 0; i < listaDeVendas.size(); i++) {
            System.out.println(listaDeVendas.get(i).exibirDadosVenda());
        }
    }

}
