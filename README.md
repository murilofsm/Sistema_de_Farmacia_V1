# AS_JAVA_v1

Atividade Supervisionada – (AS)
Disciplina: Fundamentos de Orientação a Objetos
Utilizando a linguagem de programação JAVA ou C# e os conceitos de Orientação a Objetos. Desenvolva um
sistema para venda de produtos em farmácias e drogarias, de acordo com o Diagrama de classes abaixo.
![image](https://github.com/murilofsm/AS_JAVA_v1/assets/96501309/e4caf209-008c-4c51-a4e0-be5857bfb09a)

As farmácias e drogarias vendem uma variedade de produtos, dentre eles: cosméticos, perfumes, produtos de higiene pessoal,
além dos medicamentos. No entanto, os medicamentos, apresentam informações e procedimentos específicos. Tais como: número
de registro na ANVISA, retenção de receita médica de medicamentos de uso controlado, além da manipulação e aplicação de
medicação injetável.<br/>
Diante disso, O sistema deverá ter a capacidade de gerenciar a comercialização de produtos em Farmácias e Drogarias. Para isso,
deve implementar as seguintes regras:<br/>
1. Toda venda deverá conter um cliente previamente cadastrado, um funcionário, uma lista de produtos adquiridos, a data
da compra e os respectivos valores: valor total dos produtos, valor de desconto e valor total da venda.<br/>
2. Para toda a venda, o desconto será aplicado automaticamente pelo sistema, o cálculo de desconto seguirá as seguintes
regras:<br/>
a. Produtos em geral, 5 % de desconto.<br/>
b. Medicamentos em geral, 10 % de desconto.<br/>
c. Medicamentos de uso controla, 3 % de desconto.<br/>
d. Medicamentos injetáveis, Não aplicar desconto.<br/>
e. Além disso, para os clientes com mais de 60 anos, aplicar R$ 10,00 de desconto para as compras acima de
R$ 100,00<br/>
Atenção: Utilize polimorfismo para obter o percentual de desconto em cada tipo de produto. Utilize o herança entre as classe
conforme consta no diagrama de classes. Aplique os conceitos de Orientação a Objetos no desenvolvimento do sistema.<br/>
O sistema deverá fornecer as seguintes funcionalidades:
a) Cadastrar Cliente e Funcionário;<br/>
b) Cadastrar Produtos;<br/>
c) Realizar Venda;<br/>
d) Listar Clientes;<br/>
e) Listar Funcionários;<br/>
f) Listar Produtos (filtrar por tipo);<br/>
g) Listar Vendas (exibir: código venda, nome cliente, data, quantidade de produtos, valor produtos, desconto, valor total);<br/>
h) Exibir Detalhes da Venda (pesquisar pelo código da venda).<br/>
(exibir: código venda, nome cliente, data, valor produtos, desconto, valor total) na primeira linha.<br/>
Nas linhas subsequentes exibir a lista de produtos, um produto por linha.<br/>
(exibir: descrição do produto, quantidade, valor unitário, valor total)<br/>

