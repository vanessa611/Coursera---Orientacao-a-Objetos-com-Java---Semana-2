package pizzaria;

import java.util.HashMap;

public class Pizza {

	static HashMap<String, Integer> ingredientes = new HashMap<>();
	Integer qtdIngredientes = 0;
	
	public Pizza() {}

	public void adicionaIngrediente(String ingrediente){
		contabilizaIngrediente(ingrediente);
		qtdIngredientes++;
	}

	public static void contabilizaIngrediente(String ingrediente){
		if(ingredientes.get(ingrediente) != null)
			ingredientes.put(ingrediente, ingredientes.get(ingrediente) + 1);
		else
			ingredientes.put(ingrediente, 1);
	}

	public Integer getQtdIngredientes() {
		return qtdIngredientes;
	}
	
	public double getPreco(Integer totalIngredientes){
		Double preco = 0.0;
		if(totalIngredientes <= 2){
			preco = 15.0;
		}else if(totalIngredientes >= 3 && totalIngredientes <= 5){
			preco = 20.0;
		}else if(totalIngredientes > 5){
			preco = 23.0;
		}

		return preco;
	}
	
	public static void getIngredientes() {
		Pizza.ingredientes.forEach((k, v)->System.out.println("- " + k + ": " + v));
	}
	
	public static void zeraIngredientes() {
		Pizza.ingredientes.clear();
	}
}