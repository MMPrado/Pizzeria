package mx.edu.utng.mmacias.pizzeria;

/**
 * Created by Dell Latitude on 24/09/2017.
 */

public class TexasPizzaIngredientsFactory implements PizzaIngredientsFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }//plumtomato

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }//mozarella

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[]= { new BlackOlives(), new Eggplant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Hawaiana[] createHawaiana() {
        Hawaiana hawaiana[] = { new PineApple(), new Ham() };
        return hawaiana;
    }

    @Override
    public Chicken createChicken() {
        return new BitsChicken();
    }

    @Override
    public ColdMeats createColdMeat() {
        return new ColdMeatSausage();
    }

    @Override
    public Special[] createSpecial() {
        Special special[] = { new BeansEspecial(), new DoritosSpecial(),
                new GomitasSpecial(), new CerealSpecial() };
        return special;
    }

}

