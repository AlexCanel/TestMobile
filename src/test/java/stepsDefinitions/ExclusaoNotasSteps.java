package stepsDefinitions;

import static org.junit.Assert.assertNotNull;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.NotasPage;

public class ExclusaoNotasSteps {
	
	NotasPage notasPage = new NotasPage (driver);
	

	@Quando("clicar em excluir")
	public void clicarEmExcluir() throws InterruptedException {
		notasPage.excluirNota();
	}

	@Entao("o item sera excluido")
	public void oItemSeraExcluido() {
		assertNotNull(driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@resource-id ='notizen.basic.notes.notas.note.notepad:id/layout']")));
	}

}
