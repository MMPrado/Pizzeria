package mx.edu.utng.mmacias.pizzeria;

/**
 * Created by Dell Latitude on 24/09/2017.
 */

public class SpecialPizza extends Pizza {

    PizzaIngredientsFactory ingredientFactory;

    //constructor: se encarga de solicitar el tipo de fablica
    public SpecialPizza(PizzaIngredientsFactory ingredientsFactory){
        this.ingredientFactory = ingredientsFactory;
    }


    @Override
    void prepare() {
        System.out.println(" Preparando... "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        special = ingredientFactory.createSpecial();

    }
}
