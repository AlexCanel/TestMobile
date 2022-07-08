#language: pt
#enconding: UTF-8

@organizarlista
Funcionalidade: organizando uma lista de tarefa
	
	Contexto:
		Quando eu criar uma lista "Alex"
			E eu criar uma tarefa "Correr"
			E eu criar uma tarefa "Pular"
			E eu criar uma tarefa "Andar"
	
	Cenario: organizando a lista
			Quando clicar em categorias
			E clicar em adicionar categoria
	 		E criar uma categoria "Nomes"
	 		E clicar em voltar
	 		E clicar em categorias
	 		E selecionar uma categoria
			Entao sua nota estara em uma categoria
		


