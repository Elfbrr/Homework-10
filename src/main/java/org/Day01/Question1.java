package org.Day01;

public class Question1 {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        if (x++ < ++y){
            System.out.println("Hello");
        }else {
            System.out.println("Welcome");
        }
        System.out.println("Log " + x + ":" + y); // Output ===> A) Hello Log 2 : 2
    }
}
