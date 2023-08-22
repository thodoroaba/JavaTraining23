public class HawaiianPizza extends Pizza{
    public HawaiianPizza(){
        System.out.println("Starting Hawaiian.");
    }
    @Override
    public void addTopping() {
        System.out.println("added pineapple!");
    }
}
