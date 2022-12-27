package org.Day10;

public class Question10 {
    public static void main(String[] args) {
        int var1 = 200;
        System.out.println(doCalc(var1));
        System.out.println (var1);

    }
    static int doCalc(int var1){
        var1 = var1 * 2;
        return var1;     //Output ===> A)400 200
    }
}
