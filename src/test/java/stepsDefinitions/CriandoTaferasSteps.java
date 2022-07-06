package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.BlocoPage;

public class CriandoTaferasSteps {
	
	BlocoPage blocoPage = new BlocoPage(driver);
	
	@Quando("eu clicar em adicionar")
	public void euClicarEmAdicionar() throws InterruptedException {
		blocoPage.teclaAddNota();
	}

	@Quando("clicar em checklist")
	public void clicarEmChecklist() throws InterruptedException {
		blocoPage.teclaAddCheckList();
	}

	@Quando("digitar no nome da checklist {string}")
	public void digitarNoNomeDaChecklist(String string) throws InterruptedException {
		blocoPage.tituloCheckList(string);
	}

	@Quando("eu clicar em salvar nome da checklist")
	public void euClicarEmSalvarNomeDaChecklist() throws InterruptedException {
		blocoPage.confirmarTituloCheckList();
	}

	@Quando("eu clicar em adicionar uma tarefa da checklist")
	public void euClicarEmAdicionarUmaTarefaDaChecklist() throws InterruptedException {
		blocoPage.teclaAddItenCheckList();
	}

	@Quando("digitar o nome da tarefa {string}")
	public void digitarONomeDaTarefa(String string) throws InterruptedException {
		blocoPage.tituloItenCheckList(string);
	}

	@Quando("eu clicar em salvar nome tarefa")
	public void euClicarEmSalvarNomeTarefa() throws InterruptedException {
		blocoPage.confirmarTituloItenCheckList();
	}


	@Quando("eu clicar em item concluido")
	public void euClicarEmItemConcluido() throws InterruptedException {
		blocoPage.clicarChecado();
	}

	@Entao("as tarefas estarao checadas")
	public void asTarefasEstaraoChecadas() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


	

}
