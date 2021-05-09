package geekbrais.JavaLevel2.task3;

import java.util.ArrayList;
import java.util.HashSet;


public class HomeworkApp3 {
    public static void main(String[] args) {

        PhoneDirectory phone1 = new PhoneDirectory();
        phone1.add("Петров", "8_916_111_11_11");
        phone1.add("Иванов", "8_916_111_11_12");
        phone1.add("Иванов", "8_916_111_11_13");

        phone1.get("Иванов");


        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("B");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("y");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("y");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("y");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("y");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("y");
        HashSet<String> hashSet = new HashSet<>(arrayList);
        System.out.println(hashSet);

        ArrayList<String> arrayList2 = (ArrayList<String>) arrayList.clone();

        for (String name : hashSet) {
            System.out.print("Количество слов " + name + " : ");
            int count = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList2.contains(name)) {
                    count++;
                    arrayList2.remove(name);
                }
            }
            System.out.println(count);
        }
    }
}


