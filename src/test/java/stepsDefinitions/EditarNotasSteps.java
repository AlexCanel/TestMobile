package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.NotasPage;

public class EditarNotasSteps {

	NotasPage notasPage = new NotasPage(driver);

	@Quando("eu clicar para editar o nota")
	public void euClicarParaEditarONota() throws InterruptedException {
		notasPage.botaoEditarNota();
	}

	@Quando("colocar um novo nome na nota {string}")
	public void colocarUmNovoNomeNaNota(String string) throws InterruptedException {
		notasPage.editarNota(string);
		notasPage.botaoConfirmarEditarNota.click();
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

	@Entao("nota esta editada")
	public void notaEstaEditada() {
		assertEquals("Pedro",
				driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/txtTitle")).getText());
	}

	@Entao("tarefa esta editada")
	public void tarefaEstaEditada() throws InterruptedException {
		Thread.sleep(5000);
		assertEquals("Voar",
				driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout//android.widget.TextView[@index ='1']")).getText());
	}

}
