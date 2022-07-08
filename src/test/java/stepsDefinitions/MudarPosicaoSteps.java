package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;

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
		Thread.sleep(5000);
		assertEquals("Correr",
				driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index ='2']//android.widget.TextView")).getText());
	}

}
