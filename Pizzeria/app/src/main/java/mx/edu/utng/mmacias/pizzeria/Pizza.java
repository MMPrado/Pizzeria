package mx.edu.utng.mmacias.pizzeria;

/**
 * Created by Dell Latitude on 24/09/2017.
 */

public abstract class Pizza { //abstracta por que puede haver pizza d queso, vegetariana etc
    String name;

    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Hawaiana[] hawaiana;
    Chicken chicken;
    ColdMeats coldmeats;
    Special[] special;

    abstract void prepare(); //metodo abstracto

    void bake(){
        System.out.println(" Hornear por 25 minutos a 350 grados ");
    }

    void cut(){
        System.out.println(" Cortando la pizza en rebanadas diagonales");
    }

    void box(){
        System.out.println(" Colocando pizza en caja oficial de la tienda ");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append("------"+name+"-------");
        if(dough != null){
            result.append(dough+"\n");
        }
        if(sauce != null){
            result.append(sauce+"\n");
        }

        if(cheese != null){
            result.append(cheese+"\n");
        }

        if(hawaiana != null){
            for(int i=0;i<hawaiana.length; i++){
                result.append(hawaiana[i]);
                if(i<hawaiana.length-1){
                    result.append(", ");
                }
                result.append("\n");
            }
        }

        if(chicken != null){
            result.append(chicken+"\n");
        }

        if(coldmeats != null){
            result.append(coldmeats+"\n");
        }

        if(special != null){
            for(int i=0;i<special.length; i++){
                result.append(special[i]);
                if(i<special.length-1){
                    result.append(", ");
                }
                result.append("\n");
            }
        }

        if(veggies != null){
            for(int i=0;i<veggies.length; i++){
                result.append(veggies[i]);
                if(i<veggies.length-1){
                    result.append(", ");
                }
                result.append("\n");
            }
        }
        if(pepperoni != null){
            result.append(pepperoni+"\n");
        }
        return result.toString();
    }



}
