$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SenhaLista.feature");
formatter.feature({
  "name": "Criando lista no basic note mobile",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@criandosenha"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu criar uma lista \"Alex\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriandoTaferasSteps.euCriarUmaLista(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "adicionando senha valida",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@criandosenha"
    },
    {
      "name": "@senhavalida"
    }
  ]
});
formatter.step({
  "name": "eu clicar no cadeado",
  "keyword": "Quando "
});
formatter.match({
  "location": "SenhaListaSteps.euClicarNoCadeado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em \"2222\"",
  "keyword": "E "
});
formatter.match({
  "location": "SenhaListaSteps.clicarEm(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em confirmar",
  "keyword": "E "
});
formatter.match({
  "location": "SenhaListaSteps.clicarEmConfirmar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em \"2222\"",
  "keyword": "E "
});
formatter.match({
  "location": "SenhaListaSteps.clicarEm(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em confirmar",
  "keyword": "E "
});
formatter.match({
  "location": "SenhaListaSteps.clicarEmConfirmar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em retorna ao inicio",
  "keyword": "E "
});
formatter.match({
  "location": "SenhaListaSteps.clicarEmRetornaAoInicio()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar na nota",
  "keyword": "E "
});
formatter.match({
  "location": "SenhaListaSteps.clicarNaNota()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sera pedido uma senha",
  "keyword": "Entao "
});
formatter.match({
  "location": "SenhaListaSteps.seraPedidoUmaSenha()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});