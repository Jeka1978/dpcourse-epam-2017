package lombok_builder;

public class Main {
    public static void main(String[] args) {
        Customer vasya = Customer.builder()
                .name("Vasya")
                .beer("Tuborg",0)
                .beer("Leff",1)
                .age(12)
                .oneFish("karp")
                .build();
        System.out.println("vasya = " + vasya);
    }
}
