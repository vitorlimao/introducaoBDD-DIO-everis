package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;
import java.util.List;
import com.everis.util.Hooks;





public class AdressPage extends BasePage {

	@FindBy(css="button.button:nth-child(4)")
	protected WebElement confirmarEndereco;

	public AdressPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}



	public String pegarEnderecos(){
	List<WebElement> enderecos = driver.findElements(By.cssSelector("#address_delivery li")) ;
	
	String enderecoCompleto = "";
		
	
	for (int i=2; i<enderecos.size()-3;i++){
		String endereco= enderecos.get(i).getText();
		String virgula = "";
		if (i==4){
			 virgula =",";
		}
		enderecoCompleto = enderecoCompleto + virgula+ endereco;
	
	}
	;
	return enderecoCompleto;
	    
	}
	public void confirmaEndereco(String enderecoEsperado){
		String enderecoCompleto = pegarEnderecos();
		confirmarEndereco.submit();
		assertEquals(enderecoEsperado, enderecoCompleto); 
		
	}



}


	



