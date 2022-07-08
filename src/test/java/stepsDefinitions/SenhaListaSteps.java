package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

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

	@Quando("clicar em retorna ao inicio")
	public void clicarEmRetornaAoInicio() throws InterruptedException {
		notasPage.voltarTelaInicial();
	}

	@Quando("clicar na nota")
	public void clicarNaNota() throws InterruptedException {
	    notasPage.clicarNota();
	}

	@Entao("sera pedido uma senha")
	public void seraPedidoUmaSenha() throws InterruptedException {
		Thread.sleep(5000);
		assertEquals("Password",
				driver.findElement(By.xpath("//android.widget.RelativeLayout//android.widget.LinearLayout[@index ='1']//android.widget.TextView")).getText());
	}

	
}
