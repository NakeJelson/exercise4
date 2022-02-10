package com.company;

import java.util.*;


public class Main {

    static HashMap<String, Double> cityTemp = new HashMap<String, Double>();
    static Scanner input = new Scanner(System.in);
    static ArrayList<Integer> temps = new ArrayList<Integer>();
    public static void main(String[] args) {
        display(collectInput(cityTemp));
    }

    static HashMap<String, Double> collectInput(HashMap<String, Double> cityTemp) {
        System.out.println("Please enter the name of a City: ");
        String cityName = input.next();
        while (!cityName.equals("END")) {
            cityTemp.put(cityName, doMath(temps));
            System.out.println("Please enter the name of a City: ");
            input.nextLine();
            cityName = input.next();
        }
        return cityTemp;
    }

    static double doMath(ArrayList<Integer> temps) {
        double tempAvg;
        for (int j = 0; j < 5; j++) {

            System.out.println("What are the temperatures for day " + (j+1) + "?: ");
            int temp = input.nextInt();
            temps.add(temp);
        }
        int tempTotal = temps.get(0) + temps.get(1) + temps.get(2) + temps.get(3) + temps.get(4);
        tempAvg = tempTotal / 5.0;
        temps.clear();
        return tempAvg;

    }

    static void display(HashMap<String, Double> cityTemp) {

        System.out.println(cityTemp);
    }
}
