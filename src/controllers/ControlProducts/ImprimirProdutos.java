package controllers.ControlProducts;

import util.Input;
public class ImprimirProdutos {

    public static void menuImprimirProdutos(){

        boolean travaTela = true;

        do{
            System.out.println("=============Menu Impressão==============");
            System.out.println("| 1 - Imprimir Produtos Normais         |");
            System.out.println("| 2 - Imprimir Medicamentos             |");
            System.out.println("| 3 - Imprimir Medicamentos Controlados |");
            System.out.println("| 4 - Imprimir Medicamentos Injetáveis  |");
            System.out.println("| 5 - Imprimir Tudo                     |");// sei lá se ta certo, vou verificar com o prof
            System.out.println("| 0 - Voltar                            |");
            System.out.println("========================================");
            System.out.print("Resposta: ");
            int op = Input.nextInt();
            switch (op){
                case 1 ->  imprimirProdutosNormais();
                case 2 ->  imprimirMedicamentos();
                case 3 ->  imprimirMedicamentosControlados();
                case 4 ->  imprimirMedicamentosInjetaveis();
                case 5 ->  imprimirTodos();
                case 0 -> travaTela = false;
                default -> System.out.println("Opção incorreta, tente novamente.");
            }
        }while(travaTela);

    }

    private static void imprimirProdutosNormais(){
        for(int i=0; i < ControleProdutos.listaProdutosNormais.size(); i++){
            System.out.println(ControleProdutos.listaProdutosNormais.get(i).exibirDadosProduto());
        }
    }
    private static void imprimirMedicamentos(){
        for(int i=0; i < ControleProdutos.listaMedicamentos.size(); i++){
            System.out.println(ControleProdutos.listaMedicamentos.get(i).exibirDadosProduto());
        }
    }
    private static void imprimirMedicamentosControlados(){
        for(int i=0; i < ControleProdutos.listaMedicamentosControlados.size(); i++){
            System.out.println(ControleProdutos.listaMedicamentosControlados.get(i).exibirDadosProduto());
        }
    }
    private static void imprimirMedicamentosInjetaveis(){
        for(int i=0; i < ControleProdutos.listaMedicamentosInjetaveis.size(); i++){
            System.out.println(ControleProdutos.listaMedicamentosInjetaveis.get(i).exibirDadosProduto());
        }
    }

    private static void imprimirTodos() {
        imprimirProdutosNormais();
        imprimirMedicamentos();
        imprimirMedicamentosInjetaveis();
        imprimirMedicamentosControlados();
    }

}
