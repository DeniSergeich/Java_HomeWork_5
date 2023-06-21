package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        String[] name = {"Иван", "Игорь", "Дарья", "Иван", "Игорь", "Иван"};
        String[] phone = {"89514754545", "89114587412", "89215478936", "89115431212","89535289231", "89214785656"};
        phoneBook = fillPhoneBook(phoneBook, name, phone);
        print(phoneBook);
    }
    public static HashMap<String, String> fillPhoneBook (HashMap<String,String> phoneBook, String[] name, String[] phone){
        for (int i = 0; i < name.length; i++) {
            phoneBook.merge(name[i], phone[i], (m1, m2) -> m1 + ", " + m2);
        }
        return phoneBook;
    }
    public static void print(HashMap<String,String> phoneBook){
        ArrayList<Map.Entry<String, String>> temp = new ArrayList<>(phoneBook.entrySet());
        temp.sort((o1, o2) -> o2.getValue().length() - o1.getValue().length());
        temp.forEach(n -> System.out.println(n));
    }
}