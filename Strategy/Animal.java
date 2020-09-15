package Strategy;

public class Animal {

    String name;
    String habitat;
    Fly fly;   //Composition, the instance is of type Fly

    Animal(){

    }

    Animal(String name, String habitat){

        super();
        this.name = name;
        this.habitat = habitat;
    }

    Animal(String name, String habitat, Fly fly){
        super();
        this.name = name;
        this.habitat = habitat;
        this.fly = fly;
    }


    public String getName() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", habitat='" + habitat + '\'' +
                ", fly=" + fly.fly() +
                '}';
    }
}
