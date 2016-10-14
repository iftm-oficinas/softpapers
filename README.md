#Softpapers - PHP APPLICATION

######Documentação OFICINAS I

######RESPONSÁVEIS PELO PROJETO
Bruna Danieli Ribeiro Gonçalves, Marlon Andrel Coelho Freitas.

######NOME DO SISTEMA A SER DESENVOLVIDO
Softpapers automação de papelarias.

######NECESSIDADE DA EMPRESA
Observando a maneira como são gerenciados os processos de uma papelaria, foi perceptível a dificuldade
de controlar estoques, vendas, finanças ou quaisquer atividades em geral. Visando aperfeiçoar as tarefas mais demoradas, com
mais agilidade e praticidade surge à ideia de um software contendo todas as operações de frente de loja e retaguarda, desde o
atendimento ao cliente, cadastro de produtos, fornecedores, etc. até a geração de relatórios de vendas, gastos e a integração
de boletos, notas fiscais, códigos de barras e afins.

######REQUISITOS DO NEGÓCIO
O software deverá possuir um único ambiente em Desktop, desenvolvido na plataforma JAVA utilizando o
padrão de arquitetura MVC (composta por classes Models, Views e Controllers onde para as classes Models serão utilizados os
Values Objects, Business Objects, Data Access Objects e arquivos de configuração do Hibernate e JPA). O software será 
encarregado do gerenciamento, controle e administração da papelaria e de suas funcionalidades, tais como vendas, compras,
controle financeiro e gestão do caixa, cadastro de funcionários, clientes, fornecedores e produtos, e pela emissão de
relatórios de clientes, faturamentos por clientes, lançamentos no caixa, análise de despesas, centros de custos, etc.

#####REQUISITOS FUNCIONAIS

######Acesso
Restringir e validar o acesso do usuário ao programa e disponibilizar pequenas descrições das funcionalidades, página inicial
do software.
- Realizar Acesso (será implementado).

#####Visão Geral
Apresenta um pequeno resumo da saúde de sua empresa, demonstrando o lucro decorrente em forma gráfica e suas últimas contas a
pagar e receber.
- Visualizar resumo do faturamento (talvez seja implementado).
- Visualizar resumo das contas a pagar (talvez seja implementado).
- Visualizar resumo das contas a receber (talvez seja implementado).

######Vendas
Em um só local todos os recursos necessários para você organizar e acompanhar todas as vendas da sua empresa. Simula um ponto
de venda, capaz de emitir e importar uma Nota Fiscal de venda, emitir boletos, realizar vendas, etc.
- Visualizar vendas (será implementado).
- Realizar nova venda (será implementado).
- Finalizar venda (será implementado).
- Alterar venda (será implementado).
- Excluir venda (será implementado).
- Imprimir boleto (talvez seja implementado).
- Gerar nota fiscal de venda (não será implementado).
- Visualizar histórico de vendas (não será implementado).

######Estoque
Objetivo de controlar e gerenciar os registros dos produtos e os pedidos de compras, assim como gerar Nota Fiscal de compra e
acompanhar seus lançamentos.
- Visualizar inventário (será implementado).
- Visualizar compras (será implementado).
- Realizar nova compra (será implementado).
- Finalizar Compra (será implementado).
- Alterar compra (será implementado).
- Excluir compra (será implementado).
- Gerar nota fiscal de compra (não será implementado).
- Visualizar lançamentos (talvez seja implementado).
- Visualizar histórico de compras (não será implementado).

######Financeiro
Gestão financeira do seu negócio em um único local, com o objetivo de controlar e gerenciar todos os registros das contas a
pagar, receber e o saldo, assim como listar todas as alterações.
- Visualizar extrato (talvez seja implementado).
- Visualizar contas a pagar (talvez seja implementado).
- Realizar novo pagamento (talvez seja implementado).
- Pagar pagamento (talvez seja implementado).
- Alterar pagamento (talvez seja implementado).
- Excluir pagamento (talvez seja implementado).
- Visualizar contas a receber (talvez seja implementado).
- Realizar novo recebimento (talvez seja implementado).
- Receber recebimento (talvez seja implementado).
- Alterar recebimento (talvez seja implementado).
- Excluir recebimento (talvez seja implementado).
- Visualizar histórico financeiro (não será implementado).

######Relatórios
Os relatórios do sistema. 
- Demonstrativo de Resultados (DRE) (não será implementado).
- Análise de despesas (não será implementado).
- Centro de custos (não será implementado).
- Vendas por vendedor (não será implementado).
- Vendas por cliente (não será implementado).
- Faturamento (não será implementado).
- Giro de estoque (não será implementado).
- Fluxo de caixa mensal (não será implementado).
- Fluxo de caixa anual (não será implementado).

######Painel de Controle
Objetivo de gerenciar todos os cadastros do sistema;
- Visualizar usuários (será implementado).
- Cadastrar novo usuário (será implementado).
- Alterar usuário (será implementado).
- Excluir usuário (será implementado).
- Visualizar clientes (será implementado).
- Cadastrar novo cliente (será implementado).
- Alterar cliente (será implementado).
- Excluir cliente (será implementado).
- Visualizar fornecedores (será implementado).
- Cadastrar novo fornecedor (será implementado).
- Alterar fornecedor (será implementado).
- Excluir fornecedor (será implementado).
- Visualizar categorias (será implementado).
- Cadastrar nova categoria (será implementado).
- Alterar categoria (será implementado).
- Excluir categoria (será implementado).
- Visualizar produtos (será implementado).
- Cadastrar novo produto (será implementado).
- Alterar produto (será implementado).
- Excluir produto (será implementado).

#####REQUISITOS NÃO FUNCIONAIS (não serão implementados)
- Sistema de fácil aprendizado.
- Possibilidade de personalização das telas por usuário e/ou grupos de usuários.
- Frente de loja totalmente intuitivo integrado as principais Impressoras de Cupom Fiscal do mercado.
- Possibilidade de uso de diversas condições de pagamento.
- Análise gerencial em tempo real.
- Tratamento dos impostos relacionados à venda.
- Nota Fiscal Eletrônica Integrado.
- Importação automática da Nota Fiscal Eletrônica de seu Fornecedor através do arquivo XML.
- Sistema multi loja, possibilitando uma gestão centralizada e online do negócio.
- Monitoramento integral sobre a sua rede de lojas e franqueados.
- Acompanhamento online das vendas realizadas pelas lojas.
- Controle de comissão e alcance das metas de vendedores e gerentes.
- Verificação de estoque de produtos de outras lojas no momento da venda.
- Pagamentos de crediário da loja diretamente pelo terminal de caixa.
- Preparado para a Nota Fiscal Paulista (SP).
- Gerenciamento do processo de TEF (Transferência Eletrônica de Fundos).

######VALOR AGREGADO
- Facilidade na gestão financeira: Veja em tempo real a saúde financeira da sua empresa, acompanhe diariamente toda situação
financeira e saiba quando suas contas estão próximas do vencimento.
- Poupe tempo nas vendas: Módulo de Frente de Caixa rápido e intuitivo. Com o Ponto De Venda você economiza tempo no atendimento
e aumenta suas vendas
- Estoque sob controle: Esqueça as planilhas confusas e abra espaço para uma gestão de estoque eficaz, integrada e sem dor de
cabeça. O controle de estoque é simples e rápido.
- Relatórios: Tome decisões inteligentes com base em números. Os relatórios do sistema auxiliam a tomar as melhores decisões
para seu negócio.
- Perfis de usuários: Libere acesso aos seus usuários e limite informações. São diversos perfis para facilitar seu controle
interno.
- Painel de controle: Visualize as principais informações de seu negócio de forma rápida. Com o painel de controle você tem 
sempre a mão informações importante para a tomada de decisão na sua empresa.

######CRONOGRAMA

#####Planejamento de atividades a serem executadas pelo grupo.

05/05 - Criar banco de dados (Mysql - Utilizando DER);

07/05 - Criar projeto JAVA-SE (estruturas de pastas, configuração do hibernate, classes VO e classe DAO genérica);

12/05 - Entregar documentação;

14/05 - Criar Views e integração entre elas;

26/05 - Criar DAOs para suas respectivas VOs;

28/05 - Entregar protótipo;

02/06 - Implementar módulo de Acesso;

04/06 - Implementar módulo de Painel de Controle;

09/06 - Implementar módulo de Estoque;

11/06 - Implementar módulo de Vendas;

16/06 - Implementar módulo de Financeiro;

18/06 - Implementar módulo de Visão Geral;

23/06 - Implementar módulo de Relatórios;

25/06 - Integrar todos os módulos e revisar projeto;

30/06 - Entregar o Projeto finalizado.