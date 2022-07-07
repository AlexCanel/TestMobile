package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.NotasPage;
import pageObjects.TelaInicalPage;

public class CriandoTaferasSteps {
	
	TelaInicalPage telaInicalPage = new TelaInicalPage (driver);
	NotasPage notasPage = new NotasPage (driver);
	
	@Quando("eu criar uma lista {string}")
	public void euCriarUmaLista(String string) {
		telaInicalPage.adicionarNota(string);
	}
	
	@Quando("eu criar uma tarefa {string}")
	public void euCriarUmaTarefa(String string) {
	    notasPage.criarNota(string);
	}


	@Quando("eu clicar em item concluido")
	public void euClicarEmItemConcluido() throws InterruptedException {
		notasPage.clicarChecado();
	}

	@Entao("as tarefas estarao checadas")
	public void asTarefasEstaraoChecadas() {
		assertEquals("true", driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/imgCheckbox")).getAttribute("checked"));
	}
	

}
