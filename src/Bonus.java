public class Bonus {
    public static void main(String[] args) {
        int balance = 70;
        int replenishment = 1050;
        if (replenishment <= 1000) {
            balance = balance + replenishment;
            System.out.println("Сумма поплнения " + replenishment + " руб.");
            System.out.println("Ваш баланс = " + balance + " руб.");
        } else {
            int bonus = replenishment / 100;
            balance = balance + replenishment + bonus;
            System.out.println("Сумма поплнения " + replenishment + " руб.");
            System.out.println("Начислено бонусов " + bonus);
            System.out.println("Ваш баланс = " + balance + " руб.");
        }
    }
}
