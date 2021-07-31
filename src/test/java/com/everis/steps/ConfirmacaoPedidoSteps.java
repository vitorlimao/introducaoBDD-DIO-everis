package com.everis.steps;


import com.everis.pages.ConfirmaPedidoPage;

import org.junit.Assert;

import io.cucumber.java.pt.Entao;



public class ConfirmacaoPedidoSteps {
	

	@Entao("^deve apresentar a mensagem \"(.*)\"$")
	
	public void confirmaPedido(String mensagemEsperada){
		ConfirmaPedidoPage ConfirmaPedidoPage = new ConfirmaPedidoPage();
		Assert.assertTrue("Pedido não confirmado.",ConfirmaPedidoPage.confirmaPedido(mensagemEsperada));
	}
	
}