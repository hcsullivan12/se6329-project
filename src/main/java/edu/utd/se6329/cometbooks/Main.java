package edu.utd.se6329.cometbooks;
import java.util.Scanner;

public class Main {

    //here main acts as seller
    public static void main(String[] args){
        Controller controllerInstance = Controller.getInstance();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username :");
        String username = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter password :");
        String password = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Netid :");
        String netid = sc.nextLine();
        sc.nextLine();

        //perform login
        controllerInstance.login(username, password, netid);


        //handle the chat part
        System.out.println("What do you identify as (B/S)?");
        String identity = sc.nextLine();
        while(true){
            System.out.println("Type message :");
            String message = sc.nextLine();
            if(identity.charAt(0) == 'S') controllerInstance.sendMessage("seller" , "buyer", message);
            else controllerInstance.sendMessage("buyer" , "seller", message);
            System.out.println("Do you want to continue (Y/N)?");
            String ch = sc.nextLine();
            if(ch.charAt(0) =='N' || ch.charAt(0) =='n') break;
        }

    }
}