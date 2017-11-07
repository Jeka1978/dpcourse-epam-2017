package mySpring;

public class EpamServiceImpl  {
    public void doWork() {
        System.out.println("Working...");
    }

    @Benchmark
    public void drinkBeer() {
        System.out.println("Оболонь Forever!!!");
    }
}
