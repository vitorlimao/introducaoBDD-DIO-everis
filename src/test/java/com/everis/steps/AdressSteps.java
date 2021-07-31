package com.everis.steps;


import com.everis.pages.AdressPage;


import io.cucumber.java.pt.E;


public class AdressSteps {
	

	@E("^confirma o endereco de entrega \"(.*)\"$")
	
	public void confirmaEndereco(String enderecoEsperado){
		AdressPage AdressPage = new AdressPage();
		AdressPage.confirmaEndereco( enderecoEsperado);
	}
	
}