package controllers.ControlProducts;

import model.ModelProducts.Produto;
import util.Input;


public class CadastroProduto {

    public void menuEscolhaTipoProduto(){
        boolean travaTela = true;

        do{
            System.out.println(" Escolha o tipo");
            System.out.println(" 1 - Produto normal");
            System.out.println(" 2 - Medicamento");
            System.out.println(" 3 - Medicamento Controlavel");
            System.out.println(" 4 - Medicamento Injetavel");
            System.out.println(" 0 - Sair");
            System.out.print("Resp ->");
            int op = Input.nextInt();
            switch (op){
                case 1 -> cadastrarProdutoNormal();
            }

        }while(travaTela);
    }



    private static void cadastrarProdutoNormal(){
        Produto produto = new Produto();
        UtilProducts.setarDadosProduto(produto);

    }

}
