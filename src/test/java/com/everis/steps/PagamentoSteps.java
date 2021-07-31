package com.everis.steps;



import com.everis.pages.DetalhePagamentoPage;
import com.everis.pages.PagamentoPage;

import io.cucumber.java.pt.Quando;


public class PagamentoSteps {
	

	@Quando("^o pagamento for confirmado$")
	
	public void confimarPagamento(){
		PagamentoPage PagamentoPage = new PagamentoPage();
		DetalhePagamentoPage DetalhePagamentoPage = new DetalhePagamentoPage();
		PagamentoPage.escolherPagamento();
		DetalhePagamentoPage.confirmaPagamento();
	}
	
}