package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SenhaPage {

	public SenhaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editPassword")
	public MobileElement campoSenha;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btn")
	public MobileElement botaoConfirmarSenha;

	public void campoSenha(String senha) throws InterruptedException {
		campoSenha.sendKeys(senha);
	}

	public void botaoConfirmarSenha() throws InterruptedException {
		botaoConfirmarSenha.click();
	}

}
