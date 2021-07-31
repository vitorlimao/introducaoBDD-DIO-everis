package com.everis.steps;

import org.junit.Assert;

import com.everis.pages.CarrinhoPage;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

public class CarrinhoSteps {
	
	@Entao("^o produto \"(.*)\" deve estar presente no carrinho$")
	public void apresentouProdutoEsperadoNoCarrinho(String nomeProduto) {
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		Assert.assertTrue("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho", 
				carrinhoPage.apresentouProdutoEsperadoNoCarrinho(nomeProduto));
	}

	@Entao("^o produto \"(.*)\" deve possuir a quantidade (.*)")
	public void oprodutoApresentouQuantidadeEsperada(String nomeProduto, String quantidadeProduto) {
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		Assert.assertTrue("O produto [" + nomeProduto + "] deveria ter a quantidade [" + quantidadeProduto + "]no carrinho", 
				carrinhoPage.oprodutoApresentouQuantidadeEsperada(nomeProduto, quantidadeProduto));
	
	}

	@E("^acessa o checkout$")

	public void acessaCheckout(){
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		carrinhoPage.acessaCheckout();
	}
	
}