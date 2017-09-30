package mx.edu.utng.mmacias.pizzeria;

/**
 * Created by Dell Latitude on 24/09/2017.
 */

public class VeggiesPizza extends Pizza{

    PizzaIngredientsFactory ingredientFactory;

    public VeggiesPizza(PizzaIngredientsFactory ingredientFactory){
        this.ingredientFactory= ingredientFactory;
    }
    @Override
    void prepare() {
        System.out.println(" Preparando... "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();

    }

}
