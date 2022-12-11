package edu.utd.se6329.cometbooks;
import java.util.Scanner;

public class Main(){
    private String username;
    private String password;

    public static void main(String[] args){
        Controller controller_instance = Controller.getInstance();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username :");
        username = sc.nextLine();
        sc.flush();
        System.out.println("Enter password :");
        password = sc.nextLine();
        sc.flush();

        controller_instance.login(username, password);
    }
}