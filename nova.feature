#language: pt
Funcionalidade: Cadastro de contas

Como um usuario 
Gostaria de cadastrar contas
Para que eu possa distribuir meu dinheiro de uma forma mais organizada

Cenario: Deve inserir uma conta com sucesso
Dado que estou acessando a aplicacao
Quando informo o usuario "pedrinskate1@gmail.com"
E a senha "pedrinskate2"
E seleciono entrar
Entao visualizo a pagina inicial
Quando seleciono Contas
E seleciono Adicionar
E informo a conta "Conta Profissional"
E seleciono Salvar
Entao a conta e inserida com sucesso