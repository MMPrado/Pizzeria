package mx.edu.utng.mmacias.pizzeria;

/**
 * Created by Dell Latitude on 24/09/2017.
 */

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new NYPizzaIngredientFactory();

//se crean objetos particulares, se crea la pizz de acuerdo a su estilo
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("Pizza de Queso estilo NY");
        } else if (item.equals("veggie")) {
            pizza = new VeggiesPizza(ingredientsFactory);
            pizza.setName("Pizza vegetariana estilo NY");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("Pizza de peperoni estilo NY");
        } else if (item.equals("hawaiana")) {
            pizza = new HawaianaPizza(ingredientsFactory);
            pizza.setName("Pizza hawaiana estilo NY");
        } else if (item.equals("pollo")) {
            pizza = new ChickenPizza(ingredientsFactory);
            pizza.setName("Pizza de pollo estilo NY");
        } else if (item.equals("salchicha")) {
            pizza = new ColdMeatPizza(ingredientsFactory);
            pizza.setName("Pizza de carnes frias estilo NY");
        } else if (item.equals("special")) {
            pizza = new SpecialPizza(ingredientsFactory);
            pizza.setName("Pizza especial estilo NY");
        }
        return pizza;
    }

}

