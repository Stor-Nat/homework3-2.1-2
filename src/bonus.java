public class bonus {
    public static void main(String[] args) {
        int balance = 70;
        int replenishment;
        int bonus;
        replenishment = 1050;
        if (replenishment <= 1000) {
            balance = balance + replenishment;
            System.out.println("Сумма поплнения " + replenishment + " руб.");
            System.out.println("Ваш баланс = " + balance + " руб.");
        } else {
            bonus = replenishment / 100;
            balance = balance + replenishment + bonus;
            System.out.println("Сумма поплнения " + replenishment + " руб.");
            System.out.println("Начислено бонусов " + bonus);
            System.out.println("Ваш баланс = " + balance + " руб.");
        }
    }
}