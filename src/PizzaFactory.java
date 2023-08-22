public class PizzaFactory {
    private static PizzaFactory instance;
    private PizzaFactory(){}
    public static PizzaFactory getInstance(){
        if (instance == null) {
            instance =  new PizzaFactory();
        }
        return instance;
    }
    public Pizza createPizza(){
        return null;
    }
}
