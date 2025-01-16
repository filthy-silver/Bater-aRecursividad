package helper;

import java.io.IOException;
import java.util.Scanner;

public class Helper {
    public static Scanner sc = new Scanner(System.in);

    public static int getUserInt(){
        if(sc.hasNextInt()){
            return sc.nextInt();
        } else {
            sc.nextLine();
           return getUserInt();
        }
    }

    public static int getUserInt(String message){
        if(sc.hasNextInt()){
            return sc.nextInt();
        } else {
            System.out.println(message);
            sc.nextLine();
            return getUserInt(message);
        }
    }
    public static int getUserPosInt(String message){
        if(sc.hasNextInt()){
            int value = sc.nextInt();
            if(value > 0){
                return value;
            }
        }
        System.out.println(message);
        sc.nextLine();
        return getUserInt(message);
    }

    public static void clear() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    }
}
