public class ChessCheck {

    public static void main(String[] args) {
        // Данные из задания
        String queenPos = "e4";
        String[] pieces = {"e7", "h7"};

        System.out.println("Ферзь находится на: " + queenPos);
        System.out.println("---------------------------------");

        // Проходимся по каждой фигуре и проверяем условия
        for (String piecePos : pieces) {
            boolean isThreatened = checkThreat(queenPos, piecePos);
            String cellColor = getCellColor(piecePos);

            System.out.println("Фигура на " + piecePos + ":");
            System.out.println("  - Угрожаема: " + (isThreatened ? "Да" : "Нет"));
            System.out.println("  - Цвет клетки: " + cellColor);
            System.out.println("---------------------------------");
        }
    }

    /**
     * Проверяет, угрожает ли ферзь фигуре.
     * Ферзь бьет по вертикали, горизонтали и диагонали.
     */
    private static boolean checkThreat(String queen, String piece) {
        // Преобразуем буквы (a-h) в числа 0-7
        int qCol = queen.charAt(0) - 'a';
        int qRow = queen.charAt(1) - '1';

        int pCol = piece.charAt(0) - 'a';
        int pRow = piece.charAt(1) - '1';

        // Угроза по вертикали (один столбец)
        if (qCol == pCol) return true;

        // Угроза по горизонтали (одна строка)
        if (qRow == pRow) return true;

        // Угроза по диагонали (разница по X равна разнице по Y)
        if (Math.abs(qCol - pCol) == Math.abs(qRow - pRow)) return true;

        return false;
    }

    /**
     * Определяет цвет клетки.
     * Клетка a1 - черная. Если сумма координат четная - черная, если нечетная - белая.
     */
    private static String getCellColor(String pos) {
        int col = pos.charAt(0) - 'a'; // 0-7
        int row = pos.charAt(1) - '1'; // 0-7

        if ((col + row) % 2 == 0) {
            return "чёрный";
        } else {
            return "белый";
        }
    }
}