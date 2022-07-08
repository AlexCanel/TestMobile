package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CategoriaPage {

	public CategoriaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnAddCategory")
	public MobileElement clicarAdicionarCategoria;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editText")
	public MobileElement nomeCategora;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtAdd")
	public MobileElement botaoAdicionarCategoria;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/categoryName")
	public MobileElement escolherCategoria;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnClose")
	public MobileElement fecharCategoria;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/layout")
	public MobileElement selecionarCategoria;

	public void clicarAdicionarCategoria() throws InterruptedException {
		clicarAdicionarCategoria.click();
	}

	public void nomeCategora(String tituloItenChackList) throws InterruptedException {
		nomeCategora.sendKeys(tituloItenChackList);
	}

	public void botaoAdicionarCategoria() throws InterruptedException {
		botaoAdicionarCategoria.click();
	}

	public void escolherCategoria() throws InterruptedException {
		escolherCategoria.click();
	}

	public void fecharCategoria() throws InterruptedException {
		fecharCategoria.click();
	}

	public void selecionarCategoria() throws InterruptedException {
		selecionarCategoria.click();
	}

	public void adicionandoCategoria(String tituloItenChackList) {
		clicarAdicionarCategoria.click();
		nomeCategora.sendKeys(tituloItenChackList);
		botaoAdicionarCategoria.click();
	}

}
