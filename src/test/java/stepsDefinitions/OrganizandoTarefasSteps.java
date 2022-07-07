package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CategoriaPage;
import pageObjects.NotasPage;
import pageObjects.TelaInicalPage;

public class OrganizandoTarefasSteps {
	
	TelaInicalPage telaInicalPage = new TelaInicalPage (driver);
	CategoriaPage categoriaPage = new CategoriaPage (driver);
	NotasPage notasPage = new NotasPage (driver);
	
	@Quando("em opcao")
	public void emOpcao() throws InterruptedException {
	   telaInicalPage.botaoOpcao();
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
	
	@Quando("clicar em categorias")
	public void clicarEmCategorias() throws InterruptedException {
	    notasPage.botaoEscolherCategoria();
	}

	@Quando("e escolher uma categoria e clicar")
	public void eEscolherUmaCategoriaEClicar() throws InterruptedException {
	    categoriaPage.selecionarCategoria();
	}

	@Entao("sua nota estara em uma categoria")
	public void suaNotaEstaraEmUmaCategoria() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
