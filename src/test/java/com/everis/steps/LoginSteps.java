package com.everis.steps;
import com.everis.pages.LoginPage;

import io.cucumber.java.pt.E;

public class LoginSteps {
    

    @E("^reliza o login$")
	public void logar() {
		LoginPage LoginPage = new LoginPage();
		LoginPage.logar();
    }
      
}

