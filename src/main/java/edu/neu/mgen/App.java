package edu.neu.mgen;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * lab1
 */
public class App 
{
    public static void main( String[] args )
    {
        /* 
         *  lab1
         */

        // Part 1 - Array
        part1();
        System.out.println();

        // Part 2 - ArrayList
        part2();

    }

    public static void part1() {
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {5, 4, 3, 2, 1};
        int[] z = new int[5];

        for (int i = 0; i < x.length; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.println("Array x = { " + arrayToString(x) + " }");
        System.out.println("Array y = { " + arrayToString(y) + " }");
        System.out.println("Array z = x + y = { " + arrayToString(z) + " }");
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void part2() {
        List<String> names = new ArrayList<>();
        names.add("Allen");
        names.add("Bill");
        names.add("Carl");
        names.add("Donald");
        names.add("Edison");

        List<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            switchedNames.add(switchFirstAndLast(name));
        }

        System.out.println("Names = { " + listToString(names) + " }");
        System.out.println("Names (switched) = { " + listToString(switchedNames) + " }");
    }

    public static String switchFirstAndLast(String name) {
        if (name == null || name.length() <= 1) {
            return name;
        }

        char firstChar = Character.toUpperCase(name.charAt(name.length() - 1));
        char lastChar = Character.toLowerCase(name.charAt(0));
        String middle = name.substring(1, name.length() - 1);

        return firstChar + middle + lastChar;
    }

    public static String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}
