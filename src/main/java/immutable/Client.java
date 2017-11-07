package immutable;

import lombok.AllArgsConstructor;
import lombok.ToString;

import static lombok.AccessLevel.PRIVATE;

@ToString
@AllArgsConstructor(access = PRIVATE)
public final class Client {
    private final String name;
    private final int bonus;
    private final int debt;
    private final int age;

    public Client addBonus(int delta) {
        return new Client(name, bonus + delta, debt,age);
    }


    public static Builder builder() {
        return new Builder();
    }
    public static class Builder{
        private String name;
        private int bonus;
        private int debt;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public Builder debt(int debt) {
            this.debt = debt;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Client build() {
            validate();
            Client client = new Client(name, bonus, debt, age);
            clean();
            return client;
        }

        private void clean() {
            name= null;
        }

        private void validate() {
            if (name == null) {
                throw new RuntimeException("name can't be null");
            }
        }
    }














}
