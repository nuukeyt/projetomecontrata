# language: pt
como usuario
Eu quero cadastrar contas
Para poder distribuir meu dinheiro de uma maneira mais organizada


Cenario: Deve inserir uma conta com sucesso

Dado que estou acessando a aplicação
Quando informo o usuario "pedrinskate1@gmail.com"
E a senha "pedrinskate2"
E seleciono entrar
Então eu viasualizo a pagina principal
Quando seleciono contas
E seleciono adicionar
E informo a conta "Conta Comum"
E seleciono Salvar
Então a conta é insirida com sucesso