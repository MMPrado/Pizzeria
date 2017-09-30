package mx.edu.utng.mmacias.pizzeria;

/**
 * Created by Dell Latitude on 24/09/2017.
 */

public interface PizzaIngredientsFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Hawaiana[] createHawaiana();
    public Chicken createChicken();
    public ColdMeats createColdMeat();
    public Special[] createSpecial();
}
