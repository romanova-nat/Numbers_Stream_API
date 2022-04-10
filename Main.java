package ru.netoligy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // положительные
        List<Integer> positiveNumber = new ArrayList<>();
        for (int i : intList) {
            if (i > 0) {
                positiveNumber.add(i);
            }
        }

        // четные
        List<Integer> evenNumber = new ArrayList<>();
        for (int i : positiveNumber) {
            if (i % 2 == 0) {
                evenNumber.add(i);
            }
        }

        // сортировать по возрастанию
        evenNumber.sort(Comparator.naturalOrder());
        System.out.println(evenNumber);

        StreamMain.printStrem();
    }
}
