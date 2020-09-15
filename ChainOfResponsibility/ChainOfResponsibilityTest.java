package ChainOfResponsibility;

public class ChainOfResponsibilityTest {

    public static void main(String args[]){

        Chain chain1 = new AddNumbers();
        Chain chain2 = new SubtractNumbers();
        Chain chain3 = new MultiplyNumbers();
        Chain chain4 = new DivideNumbers();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);

        Numbers request = new Numbers(4,2, "exponent");
        chain1.calculate(request);

    }
}
