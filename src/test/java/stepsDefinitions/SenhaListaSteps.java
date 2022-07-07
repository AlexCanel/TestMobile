package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.NotasPage;
import pageObjects.SenhaPage;
import pageObjects.TelaInicalPage;

public class SenhaListaSteps {
	
	TelaInicalPage telaInicialPage = new TelaInicalPage (driver);
	NotasPage notasPage = new NotasPage (driver);
	SenhaPage senhaPage = new SenhaPage  (driver);
	
	
	@Quando("eu clicar no cadeado")
	public void euClicarNoCadeado() throws InterruptedException {
		notasPage.botaoSenha();
	}

	@Quando("clicar em {string}")
	public void clicarEm(String senha) throws InterruptedException {
	    senhaPage.campoSenha(senha);
	}

	@Quando("clicar em confirmar")
	public void clicarEmConfirmar() throws InterruptedException {
	    senhaPage.botaoConfirmarSenha();
	}

	@Entao("as tarefas estarao com senha")
	public void asTarefasEstaraoComSenha() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
