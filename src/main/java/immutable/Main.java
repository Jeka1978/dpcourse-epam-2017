package immutable;

public class Main {
    public static void main(String[] args) {
        Client nikita = Client.builder().name("Nikita").bonus(80).debt(90).build();
        System.out.println("Nikita = " + nikita);
    }
}
