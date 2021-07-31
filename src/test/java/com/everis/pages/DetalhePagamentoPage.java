package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import com.everis.util.Hooks;





public class DetalhePagamentoPage extends BasePage {

	@FindBy(css="button.button-medium")
	protected WebElement confirmarPagamento;

	public DetalhePagamentoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}


	public void confirmaPagamento(){
		confirmarPagamento.click();
	}
		
}






	



