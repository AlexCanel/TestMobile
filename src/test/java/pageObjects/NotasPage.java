package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NotasPage {
	
	public NotasPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnAddCheckbox")
	public MobileElement teclaAddItenCheckList;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editText")
	public MobileElement TituloItenCheckList;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtAdd")
	public MobileElement confirmarTituloItenCheckList;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/imgCheckbox")
	public MobileElement clicarChecado;
	
	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnLock")
	public MobileElement botaoSenha;
	
	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtCategory")
	public MobileElement mostrarTodasCategoria;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnDelete")
	public MobileElement excluirNota;
		
	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnEdit")
	public MobileElement botaoEditarNota;
	
	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editText")
	public MobileElement editarNota;
	
	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnEdit")
	public MobileElement botaoConfirmarEditarNota;
	
	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnEditCheckbox")
	public MobileElement botaoEditarTarefa;
	
	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editText")
	public MobileElement editarTarefa;
	
	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnAdd")
	public MobileElement botaoConfirmarEditarTarefa;
	
	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtCategory")
	public MobileElement botaoEscolherCategoria;
	
	

	
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
	
	public void botaoSenha() throws InterruptedException {
		botaoSenha.click();
	}
	
	public void excluirNota() throws InterruptedException {
		excluirNota.click();
	}
	
	public void mostrarTodasCategoria() throws InterruptedException {
		mostrarTodasCategoria.click();
	}
	
	public void botaoEditarNota() throws InterruptedException {
		botaoEditarNota.click();
	}
	
	public void editarNota(String nomeNota) throws InterruptedException {
		editarNota.clear();
		editarNota.sendKeys(nomeNota);
	}
	
	public void botaoConfirmarEditarNota() throws InterruptedException {
		botaoConfirmarEditarNota.click();
	}
	
	public void botaoEditarTarefa() throws InterruptedException {
		botaoEditarTarefa.click();
	}
	
	public void editarTarefa(String nomeNota) throws InterruptedException {
		editarTarefa.clear();
		editarTarefa.sendKeys(nomeNota);
	}
	
	public void botaoConfirmarEditarTarefa() throws InterruptedException {
		botaoConfirmarEditarTarefa.click();
	}
	
	public void botaoEscolherCategoria() throws InterruptedException {
		botaoEscolherCategoria.click();
	}
	
	
	public void criarNota(String tituloItenChackList) {
		teclaAddItenCheckList.click();
		TituloItenCheckList.sendKeys(tituloItenChackList);
		confirmarTituloItenCheckList.click();
	}


}
