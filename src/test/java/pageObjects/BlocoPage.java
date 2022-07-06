package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static utils.Utils.*;

public class BlocoPage {

	public BlocoPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnAddNote")
	public MobileElement teclaAddNota;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtChecklist")
	public MobileElement teclaAddCheckList;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editText")
	public MobileElement tituloCheckList;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnAdd")
	public MobileElement confirmarTituloCheckList;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnAddCheckbox")
	public MobileElement teclaAddItenCheckList;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editText")
	public MobileElement TituloItenCheckList;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtAdd")
	public MobileElement confirmarTituloItenCheckList;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/imgCheckbox")
	public MobileElement clicarChecado;

	public void teclaAddNota() throws InterruptedException {
		teclaAddNota.click();
	}

	public void teclaAddCheckList() throws InterruptedException {
		teclaAddCheckList.click();
	}

	public void tituloCheckList(String tituloLista) throws InterruptedException {
		tituloCheckList.sendKeys(tituloLista);
	}

	public void confirmarTituloCheckList() throws InterruptedException {
		confirmarTituloCheckList.click();
	}

	public void teclaAddItenCheckList() throws InterruptedException {
		teclaAddItenCheckList.click();
	}

	public void tituloItenCheckList(String tituloItenChackList) throws InterruptedException {
		TituloItenCheckList.sendKeys(tituloItenChackList);
	}

	public void confirmarTituloItenCheckList() throws InterruptedException {
		confirmarTituloItenCheckList.click();
	}

	public void clicarChecado() throws InterruptedException {
		clicarChecado.click();
	}

	public void tearDown() {
		driver.quit();
	}
}