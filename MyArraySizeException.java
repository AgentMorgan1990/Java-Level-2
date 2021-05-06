package geekbrais.JavaLevel2.task2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException(int needRow, int needColumn, int actualRow, int actualColumn1, int actualColumn2, int actualColumn3, int actualColumn4) {
        System.out.println("Нужен массив с " + needRow + " строками и " + needColumn + " колонками, а передан массив с " + actualRow + " строками и " + actualColumn1 +
                " колоноками в первой строке, " + actualColumn2 + " колоноками во второй строке, " + actualColumn3 + " колоноками в третьей строке, " + actualColumn4 + " колоноками в четвертой строке.");
    }
}
