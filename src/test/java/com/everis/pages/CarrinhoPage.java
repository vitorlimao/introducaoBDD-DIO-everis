package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import com.everis.util.Hooks;

public class CarrinhoPage extends BasePage {

	
	@FindBy(css = ".standard-checkout")
	protected WebElement botaoCheckOut;

	public CarrinhoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}
	
	public boolean apresentouProdutoEsperadoNoCarrinho(String nomeProduto) {
		boolean apresentouProdutoEsperadoNoCarrinho = isElementDisplayed(By.xpath("//*[contains(@class,'cart_item')]//a[text()='" + nomeProduto + "']"));
		if (apresentouProdutoEsperadoNoCarrinho) {
			log("Apresentou o produto [" + nomeProduto + "] no carrinho conforme esperado.");
			return true;
		}
		logFail("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho.");
		return false;
	
	}

    public boolean oprodutoApresentouQuantidadeEsperada(String nomeProduto, String quantidadeProdutoEsperada) {
		WebElement quantidadeProdutonoCarrinho = driver.findElement(By.xpath("//*[text()='"+ nomeProduto +"']/ancestor::*[contains(@class,'cart_item')]//*[contains(@class,'cart_quantity_input')]"));
		String quantidadeEncontrada = quantidadeProdutonoCarrinho.getAttribute("value");
		boolean oprodutoApresentouQuantidadeEsperada = quantidadeProdutoEsperada.equals(quantidadeEncontrada);
		if (oprodutoApresentouQuantidadeEsperada){
			log("Apresentou o produto ["+ nomeProduto+ "] na quantidade esperada.");
			return true;

		}
		logFail(" Apresentou ["+ quantidadeEncontrada +"] do [" + nomeProduto + "] mas era para ter encontrado ["+ quantidadeProdutoEsperada +"]  no carrinho.");
		
		
		return false;
    }

    public void acessaCheckout() {
		botaoCheckOut.click();


    }

}