#language: pt
#enconding: UTF-8

@criandosenha
Funcionalidade: Criando lista no basic note mobile
	
	Contexto:
		Quando eu criar uma lista "Alex"
	
	@senhavalida
	Cenario: adicionando senha valida
		Quando eu clicar no cadeado
		E clicar em "2222"
		E clicar em confirmar
		E clicar em "2222"
		E clicar em confirmar
		E clicar em retorna ao inicio
		E clicar na nota
		Entao sera pedido uma senha
		


