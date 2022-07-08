#language: pt
#enconding: UTF-8

@exclusaodenotas
Funcionalidade: excluindo uma nota
		
		Contexto: criando notas
			Quando eu criar uma lista "Alex"
			E eu criar uma tarefa "Correr"
			E eu criar uma tarefa "Pular"
			E eu criar uma tarefa "Andar"
	
		Cenario: excluir nota 
			E clicar em excluir
			E clicar em excluir
			Entao o item sera excluido

