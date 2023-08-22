public class DiavolaPizza extends Pizza{
    public DiavolaPizza(){
        System.out.println("Starting Diavola.");
    }
    @Override
    public void addTopping() {
        System.out.println("added salami!");
    }
}
