package ChainOfResponsibility;

public class SubtractNumbers implements Chain{


    private Chain nextInChain;


    @Override
    public void setNextChain(Chain nextChain) {

        this.nextInChain = nextChain;

    }

    @Override
    public void calculate(Numbers request) {

        if(request.getCalculationWanted().equals("Subract")){
            System.out.println(" the subtraction of the two number is " +
                    ( request.getNumber1() - request.getNumber2()));
        }
        else{
            nextInChain.calculate(request);
        }


    }
}
