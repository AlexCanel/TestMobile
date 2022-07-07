#language: pt
#enconding: UTF-8

@exclusaodenotas
Funcionalidade: excluindo uma nota
	
	
		Cenario: excluir nota 
			Quando eu criar uma lista "Alex"
			E eu criar uma tarefa "Correr"
			E eu criar uma tarefa "Pular"
			E eu criar uma tarefa "Andar"
			E eu clicar em item concluido
			E clicar na lixeira
			E confirmar a exclusao
			Entao o item sera excluido

