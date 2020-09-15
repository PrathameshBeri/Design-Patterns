package Strategy;

public class StrategyTest {

    public static void main(String args[]){

        Animal tiger = new Tiger("Toney", "Bengal", new CantFly());
        Animal toucan = new Toucan("Gerry", "Patagonia", new CanFly());


        System.out.println(tiger.toString());
        System.out.println(toucan.toString());

        tiger.fly = new CanFly(); //changing the behaviour of the encapsulated object

        System.out.println(tiger.toString());

    }
}
