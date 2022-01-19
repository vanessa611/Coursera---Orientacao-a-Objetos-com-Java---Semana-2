package pizzaria;

import java.util.ArrayList;

public class CarrinhoDeCompra {
	
	static ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	
	public CarrinhoDeCompra() {}
	
	public boolean adicionaCarrinho(Pizza pizza) {
		if(pizza.getQtdIngredientes() == 0)
			return false;
		
		else pizzas.add(pizza);
		return true;
	}

	public Integer getTotalPizzas() {
		return pizzas.size();
	}
	
	public Double getTotalValorPizzas() {
		Double valorTotalPizzas = 0.0;
		for(Pizza pizza : pizzas) {
			valorTotalPizzas += pizza.getPreco(pizza.getQtdIngredientes());
		}
	
		return valorTotalPizzas;
	}

	public static void zeraCarrinho() {
		CarrinhoDeCompra.pizzas.clear();
	}
}