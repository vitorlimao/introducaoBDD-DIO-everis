package com.everis.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.everis.util.Hooks;





public class EnvioPage extends BasePage {

	
	public EnvioPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	@FindBy(xpath = "//input[@id='delivery_option_546653_0']")
	protected WebElement selecionarFormaEnvio;

	@FindBy(css="#cgv")
	protected WebElement aceitaTermoServico;

	@FindBy(name = "processCarrier")
	protected WebElement confirmarFormaEnvio;

	


	 public void selecionarFormaEnvio(){
		selecionarFormaEnvio.click();
	 }
	public void aceitarTermoServico(){
		aceitaTermoServico.click();
	}

	public void confirmarFormaEnvio(){
		//selecionarFormaEnvio();
		aceitarTermoServico();

		confirmarFormaEnvio.click();
	}
}


	



