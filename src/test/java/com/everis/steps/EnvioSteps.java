package com.everis.steps;


import com.everis.pages.EnvioPage;

import io.cucumber.java.pt.E;


public class EnvioSteps {
	

	@E("^escolhe a forma de transporte$")
	
	public void confirmaFormaEnvio(){
		EnvioPage EnvioPage = new EnvioPage();
		EnvioPage.confirmarFormaEnvio( );
	}
	
}