package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


	
	@Before 
	public void acessarBlocoNotas() throws Exception {
		acessarBloco();
	}
	

	@After
	public void tearDown() {
		driver.quit();	
	}

}


