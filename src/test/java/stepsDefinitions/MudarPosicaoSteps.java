package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.NotasPage;
import pageObjects.TelaInicalPage;

public class MudarPosicaoSteps {
	
	TelaInicalPage telaInicialPage = new TelaInicalPage (driver);
	NotasPage notasPage = new NotasPage (driver);
	
	
	
	@Quando("clicar e manter em uma nota em seguida arrastar")
	public void clicarEManterEmUmaNotaEmSeguidaArrastar() throws InterruptedException {
		notasPage.mudarPosicao();
	}

	@Entao("sera modificada a posicao das notas")
	public void seraModificadaAPosicaoDasNotas() throws InterruptedException {
		
	}


}
