public class DepositGrowth {

    public static void main(String[] args) {
        // Начальные условия из задания
        int balance = 500;          // Начало (500)
        int monthlyDeposit = 200;   // Взнос (200)
        int months = 3;             // Количество месяцев (3)

        System.out.println("Месяц \t Баланс");
        System.out.println("-------------------");

        // Цикл от 1 до 3 (включительно)
        for (int month = 1; month <= months; month++) {
            // Последовательно обновляем баланс: прибавляем взнос к текущему балансу
            balance = balance + monthlyDeposit;

            // Выводим строку таблицы
            System.out.println(month + "\t " + balance);
        }
    }
}