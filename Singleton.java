import java.util.ArrayList;
import java.util.List;

public class Singleton {

    public static void main(String args[]){


        Printer print1 = Printer.getInstance();
        Printer print2 = Printer.getInstance();

        System.out.println(print1 == print2);

    }

}


class Printer{

   private static Printer logger;

    private Printer(){

    }

    public static Printer getInstance(){
        if(logger == null){
            logger = new Printer();
        }
        return logger;
    }

}