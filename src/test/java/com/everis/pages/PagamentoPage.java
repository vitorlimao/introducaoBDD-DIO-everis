package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import com.everis.util.Hooks;





public class PagamentoPage extends BasePage {

	@FindBy(css=".cheque")
	protected WebElement escolherFormaPagamento;

	public PagamentoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}


	public void escolherPagamento(){
		escolherFormaPagamento.click();
	}
		
}






	



