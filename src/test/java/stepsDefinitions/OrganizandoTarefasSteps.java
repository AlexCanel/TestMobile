package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CategoriaPage;
import pageObjects.NotasPage;
import pageObjects.TelaInicalPage;

public class OrganizandoTarefasSteps {
	
	TelaInicalPage telaInicalPage = new TelaInicalPage (driver);
	CategoriaPage categoriaPage = new CategoriaPage (driver);
	NotasPage notasPage = new NotasPage (driver);
	
	@Quando("clicar em categorias")
	public void clicarEmCategorias() throws InterruptedException {
	    notasPage.botaoEscolherCategoria();
	}	
	
	@Quando("clicar em adicionar categoria")
	public void clicarEmAdicionarCategoria() throws InterruptedException {
	   categoriaPage.clicarAdicionarCategoria();
	}

	@Quando("criar uma categoria {string}")
	public void criarUmaCategoria(String string) throws InterruptedException {
		categoriaPage.nomeCategora(string);
		categoriaPage.botaoAdicionarCategoria();
	}
	
	@Quando("clicar em voltar")
	public void clicarEmVoltar() throws InterruptedException {
		categoriaPage.fecharCategoria();
	}
	
	@Quando("selecionar uma categoria")
	public void selecionarUmaCategoria() throws InterruptedException {
	    categoriaPage.selecionarCategoria();
	}


	@Entao("sua nota estara em uma categoria")
	public void suaNotaEstaraEmUmaCategoria() throws InterruptedException {
		Thread.sleep(5000);
		assertEquals("Nomes",
				driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/txtCategory")).getText());
	}

	
	
	
}
