public class PizzaChorizoToppingDecorator extends PizzaToppingDecorator{


    public PizzaChorizoToppingDecorator(Pizza decorativPizza) {
        super(decorativPizza);
    }

    @Override
    public void addTopping() {
        System.out.println("adding chorizo to pizza");
    }
}
