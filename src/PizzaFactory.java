import java.util.ArrayList;
import java.util.List;

public class PizzaFactory {
    private static PizzaFactory instance;

    private List<Client> clients = new ArrayList<>();
    private PizzaFactory(){}
    public static PizzaFactory getInstance(){
        if (instance == null) {
            instance =  new PizzaFactory();
        }
        return instance;
    }
    public Pizza createPizza(PizzaType type) throws Exception {
        Pizza pizza;
        switch(type) {
            case DIAVOLA:
                pizza = new DiavolaPizza();
                break;
            case HAWAIIAN:
                pizza = new HawaiianPizza();
                break;
                default:
                    throw new Exception("No such pizza!");
        }
        return pizza;


    }

    public void attachObserver(Client client){
        this.clients.add(client);
    }
}
