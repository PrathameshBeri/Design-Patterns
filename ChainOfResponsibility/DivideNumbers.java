package ChainOfResponsibility;

public class DivideNumbers implements Chain{

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {

        this.nextInChain = nextChain;

    }
    @Override
    public void calculate(Numbers request) {

        if(request.getCalculationWanted().equals("Divide")){
            System.out.println(" the division of the two number is " +
                    (request.getNumber1() / request.getNumber2()));
        }
        else{
            System.out.println("Only works for add, subtract, multiply, and divide");
        }

    }
}
