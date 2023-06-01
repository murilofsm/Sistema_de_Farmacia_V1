package controllers.ControlProducts;

import model.ModelProducts.Produto;
import util.Input;

public class UtilProducts {

    public static void setarDados(Produto produto){
        System.out.print("Insira o código: ");
        produto.setCodigo(Input.nextInt());
        System.out.print("Insira a descrição: ");
        produto.setDescricao(Input.nextLine());
        System.out.print("Insira a marca: ");
        produto.setMarca(Input.nextLine());
        System.out.print("Insira o lote: ");
        produto.setLote(Input.nextLine());
        System.out.print("Insira a data de fabricação: ");
        produto.setDataFabricacao(Input.nextLocalDate());
        System.out.print("Insira a data de vencimento: ");
        produto.setDataVencimento(Input.nextLocalDate());
        System.out.print("Insira o codigo de barras: ");
        produto.setCodigoBarras(Input.nextLine());
        System.out.print("Insira o valor: ");
        produto.setValor(Input.nextDouble());
    }
}
