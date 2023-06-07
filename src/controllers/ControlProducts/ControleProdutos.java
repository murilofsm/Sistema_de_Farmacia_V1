package controllers.ControlProducts;

import model.ModelProducts.Medicamento;
import model.ModelProducts.MedicamentoControlado;
import model.ModelProducts.MedicamentoInjetavel;
import model.ModelProducts.Produto;
import util.Input;

import java.util.ArrayList;

class ControleProdutos {
    protected static ArrayList<Produto> listaTodosProdutos = new ArrayList<>();
    protected static ArrayList<Produto> listaProdutosNormais = new ArrayList<>();
    protected static ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();
    protected static ArrayList<MedicamentoControlado> listaMedicamentosControlados = new ArrayList<>();
    protected static ArrayList<MedicamentoInjetavel> listaMedicamentosInjetaveis = new ArrayList<>();

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
    protected static void setarDadosMedicamentoControlado(MedicamentoControlado medicamentoControlado){
        setarDadosMedicamento(medicamentoControlado);
        System.out.print("Insira o CRM do médico: ");
        medicamentoControlado.setCrmMedico(Input.nextLine());
        System.out.print("Insira o CPF do Paciente: ");
        medicamentoControlado.setCpfPaciente(Input.nextLine());
    }
    protected static void setarDadosMedicamentoInjetavel(MedicamentoInjetavel medicamentoInjetavel){
        setarDadosMedicamento(medicamentoInjetavel);
        System.out.print("Insira o funcionario responsável: ");
        medicamentoInjetavel.setFuncionarioResponsavel(Input.nextLine());
        System.out.print("Insira o CPF do Paciente: ");
        medicamentoInjetavel.setCpfPaciente(Input.nextLine());
    }
}
