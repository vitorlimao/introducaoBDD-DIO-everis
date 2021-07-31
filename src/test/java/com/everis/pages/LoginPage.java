package com.everis.pages;



import com.everis.util.Hooks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {



@FindBy(xpath= "//*[@id='email']")
protected WebElement loginElement;

@FindBy(xpath= "//*[@id='passwd']")
protected WebElement passwordElement;

@FindBy(css= "#SubmitLogin")
protected WebElement botaoLogar;

private String email;
private String senha;

    public LoginPage() {
		PageFactory.initElements(Hooks.getDriver(), this);       
	}


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void logar() {
        setEmail("abroba@123.com");
        setSenha("Vj6urZRpv56tx2P*!");

        loginElement.sendKeys(email);
        passwordElement.sendKeys(senha);
        botaoLogar.click();
    }
    

    

}
