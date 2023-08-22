public class Main {
    public static void main(String[] args) throws Exception {
        Pizza pizzaDiavola = PizzaFactory.getInstance().createPizza(PizzaType.DIAVOLA);
        Pizza pizzaHawaiianWithChorizo = new PizzaChorizoToppingDecorator(PizzaFactory.getInstance().createPizza(PizzaType.HAWAIIAN));

        PizzaFactory.getInstance().attachObserver(new Client(PizzaFactory.getInstance()));
        PizzaFactory.getInstance().bake(pizzaDiavola);
    }
}