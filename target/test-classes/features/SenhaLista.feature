#language: pt
#enconding: UTF-8

@criandosenha
Funcionalidade: Criando lista no basic note mobile
	
	@senhavalida
	Cenario: adicionando senha valida
		Quando eu criar uma lista "Alex"
		E eu clicar no cadeado
		E clicar em "2222"
		E clicar em confirmar
		E clicar em "2222"
		E clicar em confirmar
		Entao as tarefas estarao com senha
		


