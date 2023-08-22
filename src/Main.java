public class Main {
    public static void main(String[] args) throws Exception {
        Pizza pizzaDiavola = PizzaFactory.getInstance().createPizza(PizzaType.DIAVOLA);
    }
}