#language: pt
#encoding: utf-8


Funcionalidade: Realizar Compra no E-commerce

	Como um comprador
	Quero ver a lista de produtos disponiveis
	Para que eu possa escolher qual devo comprar
	E relizar uma compra

		
  Cenario: Adicionar produto ao carrinho
  	Dado que um usuario acessa o site "http://automationpractice.com"
  	E pesquisa pelo produto "Blouse"
  	Quando adiciona o produto "Blouse" ao carrinho
  	Entao o produto "Blouse" deve estar presente no carrinho

  Cenario: Aumentar a quantidade de produto através do detalhes do produto
  	Dado que um usuario acessa o site "http://automationpractice.com"
  	E pesquisa pelo produto "Dress"
	E acessa o produto "Printed Chiffon Dress"
	E aumenta a quantidade produto
  	Quando adiciona o produto "Printed Chiffon Dress" ao carrinho
  	 Entao o produto "Printed Chiffon Dress" deve possuir a quantidade 2
@test
 Cenario: Realizar compra
  	Dado que um usuario acessa o site "http://automationpractice.com"
  	E pesquisa pelo produto "Blouse"
	Quando adiciona o produto "Blouse" ao carrinho
	E acessa o checkout
	E reliza o login
	E confirma o endereco de entrega "rua dos morros, 0,Encatada, Alaska 00000,United States" 
	E escolhe a forma de transporte
  	Quando o pagamento for confirmado 
  	Entao deve apresentar a mensagem "Your order on My Store is complete." 