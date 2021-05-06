package geekbrais.JavaLevel2.task2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int column, int row, String field) {
        System.out.println("В " + column + " столбце " + row + " строке некорретное значение - " + field + ", должно быть подано число");
    }
}
