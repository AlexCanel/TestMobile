package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TelaInicalPage {

	public TelaInicalPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnAddNote")
	public MobileElement teclaAddNotaChecklist;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtChecklist")
	public MobileElement teclaAddCheckList;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtNote")
	public MobileElement teclaAddNota;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editTitle")
	public MobileElement tituloNota;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editContent")
	public MobileElement corpoNota;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editText")
	public MobileElement tituloCheckList;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnAdd")
	public MobileElement confirmarTituloCheckListNota;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/imgCategory")
	public MobileElement botaoOpcao;

	public void teclaAddNotaChecklist() throws InterruptedException {
		teclaAddNotaChecklist.click();
	}

	public void teclaAddNota() throws InterruptedException {
		teclaAddNota.click();
	}

	public void tituloNota(String tituloNotaa) throws InterruptedException {
		tituloNota.sendKeys(tituloNotaa);
	}

	public void corpoNota(String corpoNotaa) throws InterruptedException {
		corpoNota.sendKeys(corpoNotaa);
	}

	public void teclaAddCheckList() throws InterruptedException {
		teclaAddCheckList.click();
	}

	public void tituloCheckList(String tituloLista) throws InterruptedException {
		tituloCheckList.sendKeys(tituloLista);
	}

	public void confirmarTituloCheckListNota() throws InterruptedException {
		confirmarTituloCheckListNota.click();
	}

	public void botaoOpcao() throws InterruptedException {
		botaoOpcao.click();
	}

	public void adicionarNota(String tituloLista) {
		teclaAddNotaChecklist.click();
		teclaAddCheckList.click();
		tituloCheckList.sendKeys(tituloLista);
		confirmarTituloCheckListNota.click();
	}

}
