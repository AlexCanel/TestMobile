$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/OrganizandoTarefas.feature");
formatter.feature({
  "name": "organizando uma lista de tarefa",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@organizarlista"
    }
  ]
});
formatter.scenario({
  "name": "organizando a lista",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@organizarlista"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "em opcao",
  "keyword": "Quando "
});
formatter.match({
  "location": "OrganizandoTarefasSteps.emOpcao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em adicionar categoria",
  "keyword": "E "
});
formatter.match({
  "location": "OrganizandoTarefasSteps.clicarEmAdicionarCategoria()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "criar uma categoria \"Nomes\"",
  "keyword": "E "
});
formatter.match({
  "location": "OrganizandoTarefasSteps.criarUmaCategoria(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em voltar",
  "keyword": "E "
});
formatter.match({
  "location": "OrganizandoTarefasSteps.clicarEmVoltar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu criar uma lista \"Alex\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriandoTaferasSteps.euCriarUmaLista(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu criar uma tarefa \"Correr\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriandoTaferasSteps.euCriarUmaTarefa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu criar uma tarefa \"Pular\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriandoTaferasSteps.euCriarUmaTarefa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu criar uma tarefa \"Andar\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriandoTaferasSteps.euCriarUmaTarefa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em categorias",
  "keyword": "E "
});
formatter.match({
  "location": "OrganizandoTarefasSteps.clicarEmCategorias()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "e escolher uma categoria e clicar",
  "keyword": "E "
});
formatter.match({
  "location": "OrganizandoTarefasSteps.eEscolherUmaCategoriaEClicar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sua nota estara em uma categoria",
  "keyword": "Entao "
});
formatter.match({
  "location": "OrganizandoTarefasSteps.suaNotaEstaraEmUmaCategoria()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepsDefinitions.OrganizandoTarefasSteps.suaNotaEstaraEmUmaCategoria(OrganizandoTarefasSteps.java:51)\r\n\tat ✽.sua nota estara em uma categoria(file:src/test/resources/features/OrganizandoTarefas.feature:19)\r\n",
  "status": "pending"
});
formatter.after({
  "status": "passed"
});
});