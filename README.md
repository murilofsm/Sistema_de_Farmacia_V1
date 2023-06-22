# AS_JAVA_v1

Atividade Supervisionada – (AS)
Disciplina: Fundamentos de Orientação a Objetos
Utilizando a linguagem de programação JAVA ou C# e os conceitos de Orientação a Objetos. Desenvolva um
sistema para venda de produtos em farmácias e drogarias, de acordo com o Diagrama de classes abaixo.
![image](https://github.com/murilofsm/AS_JAVA_v1/assets/96501309/e4caf209-008c-4c51-a4e0-be5857bfb09a)

As farmácias e drogarias vendem uma variedade de produtos, dentre eles: cosméticos, perfumes, produtos de higiene pessoal,
além dos medicamentos. No entanto, os medicamentos, apresentam informações e procedimentos específicos. Tais como: número
de registro na ANVISA, retenção de receita médica de medicamentos de uso controlado, além da manipulação e aplicação de
medicação injetável.
Diante disso, O sistema deverá ter a capacidade de gerenciar a comercialização de produtos em Farmácias e Drogarias. Para isso,
deve implementar as seguintes regras:
1. Toda venda deverá conter um cliente previamente cadastrado, um funcionário, uma lista de produtos adquiridos, a data
da compra e os respectivos valores: valor total dos produtos, valor de desconto e valor total da venda.
2. Para toda a venda, o desconto será aplicado automaticamente pelo sistema, o cálculo de desconto seguirá as seguintes
regras:
a. Produtos em geral, 5 % de desconto.
b. Medicamentos em geral, 10 % de desconto.
c. Medicamentos de uso controla, 3 % de desconto.
d. Medicamentos injetáveis, Não aplicar desconto.
e. Além disso, para os clientes com mais de 60 anos, aplicar R$ 10,00 de desconto para as compras acima de
R$ 100,00
Atenção: Utilize polimorfismo para obter o percentual de desconto em cada tipo de produto. Utilize o herança entre as classe
conforme consta no diagrama de classes. Aplique os conceitos de Orientação a Objetos no desenvolvimento do sistema.
O sistema deverá fornecer as seguintes funcionalidades:
a) Cadastrar Cliente e Funcionário;
b) Cadastrar Produtos;
c) Realizar Venda;
d) Listar Clientes;
e) Listar Funcionários;
f) Listar Produtos (filtrar por tipo);
g) Listar Vendas (exibir: código venda, nome cliente, data, quantidade de produtos, valor produtos, desconto, valor total);
h) Exibir Detalhes da Venda (pesquisar pelo código da venda).
(exibir: código venda, nome cliente, data, valor produtos, desconto, valor total) na primeira linha.
Nas linhas subsequentes exibir a lista de produtos, um produto por linha.
(exibir: descrição do produto, quantidade, valor unitário, valor total)
