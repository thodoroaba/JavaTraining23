public class Client {
    private PizzaFactory publisher;
    public Client(PizzaFactory publisher){
        this.publisher=publisher;

    }


    public void notifyClient(Pizza pizza) {
        System.out.println("Pizza is baked");
    }
}
