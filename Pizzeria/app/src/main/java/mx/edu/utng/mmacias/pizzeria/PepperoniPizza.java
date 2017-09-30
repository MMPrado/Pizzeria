package mx.edu.utng.mmacias.pizzeria;

/**
 * Created by Dell Latitude on 24/09/2017.
 */

public class PepperoniPizza extends Pizza {

    PizzaIngredientsFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientsFactory ingredientsFactory){
        this.ingredientFactory = ingredientsFactory;
    }

    @Override //preparacion de ese tipo de pizza
    void prepare() {
        System.out.println(" Preparando... "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }

}
