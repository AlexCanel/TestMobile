package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.NotasPage;

public class ExclusaoNotasSteps {
	
	NotasPage notasPage = new NotasPage (driver);
	
	@Quando("clicar na lixeira")
	public void clicarNaLixeira() throws InterruptedException {
	    notasPage.excluirNota();
	}

	@Quando("confirmar a exclusao")
	public void confirmarAExclusao() throws InterruptedException {
		notasPage.excluirNota();
	}

	@Entao("o item sera excluido")
	public void oItemSeraExcluido() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
