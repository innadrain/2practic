public class ArrayCounter {

    public static void main(String[] args) {
        // Массив из примера в задании
        int[] measurements = {1, 2, -3, -4};

        // Переменные для счётчиков
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        // Проходимся по каждому элементу массива
        for (int number : measurements) {
            if (number > 0) {
                positiveCount++; // Если число больше нуля
            } else if (number < 0) {
                negativeCount++; // Если число меньше нуля
            } else {
                zeroCount++;     // Если число равно нулю
            }
        }
        // Выводим результат в формате: положительные, отрицательные, нули
        System.out.println(positiveCount + ", " + negativeCount + ", " + zeroCount);
    }
}