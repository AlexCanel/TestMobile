package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.NotasPage;

public class EditarNotasSteps {
	
	NotasPage notasPage = new NotasPage (driver);
	
	@Quando("eu clicar para editar o nota")
	public void euClicarParaEditarONota() throws InterruptedException {
	    notasPage.botaoEditarNota();	
	}

	@Quando("colocar um novo nome na nota {string}")
	public void colocarUmNovoNomeNaNota(String string) throws InterruptedException {
	    notasPage.editarNota(string);
	    notasPage.botaoConfirmarEditarNota .click();
	}

	@Quando("eu clicar para editar a tarefa")
	public void euClicarParaEditarATarefa() throws InterruptedException {
	    notasPage.botaoEditarTarefa();
	}

	@Quando("colocar um novo nome na tarefa {string}")
	public void colocarUmNovoNomeNaTarefa(String string) throws InterruptedException {
		 notasPage.editarTarefa(string);
		 notasPage.botaoConfirmarEditarTarefa.click();
	}

	@Entao("nota e tarefa estarao editadas")
	public void notaETarefaEstaraoEditadas() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
