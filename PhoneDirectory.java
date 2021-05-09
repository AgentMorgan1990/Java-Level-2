package geekbrais.JavaLevel2.task3;

import java.util.ArrayList;


public class PhoneDirectory {
    ArrayList<Record> contactList = new ArrayList();


    void add(String surname, String phoneNumber) {
        Record record = new Record(surname, phoneNumber);
        contactList.add(record);
    }

    void get(String requestedSurname) {
        boolean checkMatchesSurname = false;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getSurname().equals(requestedSurname)) {
                System.out.println("По запрашиваемой фамилии " + contactList.get(i).getSurname() + " следующий номер телефона: " + contactList.get(i).getPhoneNumber());
                checkMatchesSurname = true;
            }
        }
        if (checkMatchesSurname==false){
            System.out.println("Такой фамилии нет в справочнике");
        }
    }
}



