package com.everis.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;





public class ConfirmaPedidoPage extends BasePage {

	@FindBy(css=".alert-success")
	protected WebElement confirmaPedido;

	public ConfirmaPedidoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}


	public Boolean confirmaPedido(String mensagemEsperada){
		Boolean pedidoFoiConfirmado = confirmaPedido.getText().equals(mensagemEsperada);
		if (pedidoFoiConfirmado){
			log("Pedido confirmado com sucesso.");
			return true;
		}else{
			log("Pedido não confirmado.");
			return false;
		}

	}
}
		







	



