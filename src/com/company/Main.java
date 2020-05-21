package com.company;

public class Main {

    public static void main(String[] args) {

        int hour = 10;
        if (hour < 11) {
            System.out.println("Good morning!"); }
        else{
            System.out.println("Good day!");
        }
        // same
        System.out.println(hour > 11 ? "Good day!" : "Good morning!");

        int a = 1;
        int b = 10;
       int cou = 0;
        int day;
        while (cou < 10) {
            day = a + (int) (Math.random() * b);
            if (day > 7) {
                continue;
                } else {
                switch (day)
                {
                    case 1: System.out.println("Monday");
                        break;
                    case 2: System.out.println("Tuesday");
                        break;
                    case 3: System.out.println("Wednesday");
                        break;
                    case 4: System.out.println("Thursday");
                        break;
                    case 5: System.out.println("Friday");
                        break;
                    case 6: System.out.println("Saturday");
                        break;
                    case 7: System.out.println("Sunday");
                }

            }
            cou++;
        }
        String[] ch = {"J", "a", "v", "a", " ", "S", "w", "i", "t", "c", "h", " ", "S", "t", "a", "t", "e", "m", "e", "n", "t", "s"};
        for(String cha : ch) {
System.out.print(cha);
        }
    }
}
