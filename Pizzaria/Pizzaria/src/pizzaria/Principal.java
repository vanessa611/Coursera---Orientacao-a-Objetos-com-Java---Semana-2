package pizzaria;

public class Principal {

	public static void main(String[] args) {
		
		CarrinhoDeCompra carrinhoCompras = new CarrinhoDeCompra();
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Orégano");
		
		carrinhoCompras.adicionaCarrinho(p1);
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Tomate");
		p2.adicionaIngrediente("Pepperoni");
		p2.adicionaIngrediente("Azeitona");
		
		carrinhoCompras.adicionaCarrinho(p2);
		
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Queijo");
		p3.adicionaIngrediente("Orégano");
		p3.adicionaIngrediente("Pepperoni");
		p3.adicionaIngrediente("Azeitona");
		p3.adicionaIngrediente("Catupiry");
		p3.adicionaIngrediente("Manjericão");
		
		carrinhoCompras.adicionaCarrinho(p3);
		
		System.out.println("Carrinho de Compras: ");
		if(carrinhoCompras.getTotalPizzas() > 0) {
			System.out.println("Total de Pizzas Adicionadas ao Carrinho: " + carrinhoCompras.getTotalPizzas());
			System.out.println("Valor Total das Pizzas: R$ " + String.format("%.2f", carrinhoCompras.getTotalValorPizzas()) + "\n");
			System.out.println("Total de Ingredientes Utilizados:");
			Pizza.getIngredientes();
		} else {
			System.out.println("Carrinho vazio!");
		}

	}
	
}