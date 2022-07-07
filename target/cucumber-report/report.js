$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MudarPosicao.feature");
formatter.feature({
  "name": "mudando a posicao de uma nota",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@mudarposicao"
    }
  ]
});
formatter.scenario({
  "name": "mudando posicao",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@mudarposicao"
    }
  ]
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
  "name": "clicar e manter em uma nota em seguida arrastar",
  "keyword": "E "
});
formatter.match({
  "location": "MudarPosicaoSteps.clicarEManterEmUmaNotaEmSeguidaArrastar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sera modificada a posicao das notas",
  "keyword": "Entao "
});
formatter.match({
  "location": "MudarPosicaoSteps.seraModificadaAPosicaoDasNotas()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});