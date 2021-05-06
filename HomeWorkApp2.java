package geekbrais.JavaLevel2.task2;

public class HomeWorkApp2 {
    public static final int NEED_ROW = 4;
    public static final int NEED_COLUMN = 4;

    public static void main(String[] args) {
        String[][] array1 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            sumArrayValues(array1);
        } catch (MyArraySizeException | MyArrayDataException e) {
        }

    }


    public static void sumArrayValues(String[][] array) {
        int numberOfRow = 0;
        int NumberOfColumn = 0;

        if (array.length != NEED_ROW || array[0].length != NEED_COLUMN || array[1].length != NEED_COLUMN || array[2].length != NEED_COLUMN || array[3].length != NEED_COLUMN) {
            throw new MyArraySizeException(NEED_ROW, NEED_COLUMN, array.length, array[0].length, array[1].length, array[2].length, array[3].length);
        } else try {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    numberOfRow = i;
                    NumberOfColumn = j;
                    int x = Integer.parseInt(array[i][j]);
                    sum = sum + x;
                }
            }
            System.out.println("Сумма всех чисел массива равна: " + sum);


        } catch (NumberFormatException e) {
            throw new MyArrayDataException(numberOfRow, NumberOfColumn, array[numberOfRow][NumberOfColumn]);
        }
    }
}

