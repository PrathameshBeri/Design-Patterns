package Strategy;

public interface Fly {

    String fly();
}


class CanFly implements Fly{

    public String fly(){

        return "Soaring High";
    }
}

class CantFly implements Fly{

    public String fly(){

        return "I cant fly";
    }
}