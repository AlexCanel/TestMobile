#language: pt
#enconding: UTF-8

@organizarlista
Funcionalidade: organizando uma lista de tarefa
	
	
	Cenario: organizando a lista
			Quando em opcao
			E clicar em adicionar categoria
	 		E criar uma categoria "Nomes"
	 		E clicar em voltar
			E eu criar uma lista "Alex"
			E eu criar uma tarefa "Correr"
			E eu criar uma tarefa "Pular"
			E eu criar uma tarefa "Andar"
			E clicar em categorias
			E e escolher uma categoria e clicar
			Entao sua nota estara em uma categoria
		


