#language: pt
#enconding: UTF-8

@editarnotas
Funcionalidade: editando uma tarefa da lista
	
	
		Cenario: Criando a lista
			Quando eu criar uma lista "Alex"
			E eu criar uma tarefa "Correr"
			E eu criar uma tarefa "Pular"
			E eu criar uma tarefa "Andar"
			E eu clicar para editar o nota
			E colocar um novo nome na nota "Pedro"
			E eu clicar para editar a tarefa
			E colocar um novo nome na tarefa "Voar"
			Entao nota e tarefa estarao editadas

		

