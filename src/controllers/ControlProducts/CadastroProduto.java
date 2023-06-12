package controllers.ControlProducts;

import model.ModelProducts.Medicamento;
import model.ModelProducts.MedicamentoControlado;
import model.ModelProducts.MedicamentoInjetavel;
import model.ModelProducts.Produto;
import util.Input;
public class CadastroProduto {

    protected static void menuEscolhaTipoProduto(){
        boolean travaTela = true;

        do{
            System.out.println(" =========Escolha o tipo=========");
            System.out.println(" | 1 - Produto normal           |");
            System.out.println(" | 2 - Medicamento              |");
            System.out.println(" | 3 - Medicamento Controlavel  |");
            System.out.println(" | 4 - Medicamento Injetavel    |");
            System.out.println(" | 0 - Voltar                   |");
            System.out.println("=================================");
            System.out.print("Resposta: ");
            int op = Input.nextInt();
            switch (op){
                case 1 -> cadastrarProdutoNormal();
                case 2 -> cadastrarMedicamento();
                case 3 -> cadastrarMedicamentoControlado();
                case 4 -> cadastrarMedicamentoInjetavel();
                case 0 -> travaTela = false;
                default -> System.out.println("Opção incorreta, tente novamente.");
            }

        }while(travaTela);
    }
    private static void cadastrarProdutoNormal(){
        Produto produto = new Produto();
        ControleProdutos.setarDadosProduto(produto);
        ControleProdutos.listaProdutosNormais.add(produto);
    }
    private static void cadastrarMedicamento(){
        Medicamento med = new Medicamento();
        ControleProdutos.setarDadosMedicamento(med);
        ControleProdutos.listaMedicamentos.add(med);
    }
    private static void cadastrarMedicamentoControlado(){
        MedicamentoControlado medCon = new MedicamentoControlado();
        ControleProdutos.setarDadosMedicamento(medCon);
        ControleProdutos.listaMedicamentosControlados.add(medCon);
    }
    private static void cadastrarMedicamentoInjetavel(){
        MedicamentoInjetavel medInj = new MedicamentoInjetavel();
        ControleProdutos.setarDadosMedicamento(medInj);
        ControleProdutos.listaMedicamentosInjetaveis.add(medInj);
    }
}
