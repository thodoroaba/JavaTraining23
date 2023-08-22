public abstract class PizzaToppingDecorator extends Pizza{
    public Pizza decorativPizza;
    public PizzaToppingDecorator(Pizza decorativPizza){
        this.decorativPizza = decorativPizza;
        this.addTopping();
    }
    public abstract void addTopping();
}
