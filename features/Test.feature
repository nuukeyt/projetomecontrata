#	language: pt
Funcionalidade: Testar o BDD

Cenario: devo alugar um filme com sucesso
Dado um filme com estoque de 2 unidades
E que o preco do aluguel seja 3 reais 
Quando alugar
Entao o preco do aluguel sera 3 reais
E a data de entregar sera no dia seguinte
E o estoque do filme sera 1 unidade

	
	
