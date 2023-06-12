package controllers.ControlProducts;

import model.ModelProducts.Medicamento;
import model.ModelProducts.MedicamentoControlado;
import model.ModelProducts.MedicamentoInjetavel;
import model.ModelProducts.Produto;
import util.Input;

import java.util.ArrayList;

public class ControleProdutos {
    public static ArrayList<Produto> listaTodosProdutos = new ArrayList<>();
    public static ArrayList<Produto> listaProdutosNormais = new ArrayList<>();
    public static ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();
    public static ArrayList<MedicamentoControlado> listaMedicamentosControlados = new ArrayList<>();
    public static ArrayList<MedicamentoInjetavel> listaMedicamentosInjetaveis = new ArrayList<>();

    public static void menuControleProduto(){
        boolean travaTela = true;

        do{
            System.out.println("======Menu Controle Pessoa======");
            System.out.println("| 1 - Cadastrar                |");
            System.out.println("| 2 - Buscar/listar            |");
            System.out.println("| 0 - Voltar                   |");
            System.out.println("================================");
            System.out.print("Resposta: ");
            int op = Input.nextInt();
            switch (op){
                case 1 -> CadastroProduto.menuEscolhaTipoProduto();
                case 2 -> ImprimirProdutos.menuImprimirProdutos();
                case 0 -> travaTela = false;
                default -> System.out.println("Opção incorreta, tente novamente.");
            }
        }while(travaTela);
    }

    public static Produto buscarProduto(int codigoProduto){
        for (int i = 0; i < listaTodosProdutos.size(); i++) {
            if(listaTodosProdutos.get(i).getCodigo() == (codigoProduto)){
                return listaTodosProdutos.get(i);
            }
        }
        return null;
    }

    protected static void setarDadosProduto(Produto produto){
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

    protected static void setarDadosMedicamento(Medicamento medicamento){
        setarDadosProduto(medicamento);
        System.out.print("Insira o número de registro da Anvisa: ");
        medicamento.setNumRegistro(Input.nextInt());
        System.out.print("Insira a composição: ");
        medicamento.setComposicao(Input.nextLine());
        System.out.print("Insira a dosagem: ");
        medicamento.setDosagem(Input.nextDouble());
    }
}
