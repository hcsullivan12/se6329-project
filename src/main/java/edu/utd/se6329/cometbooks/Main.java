package edu.utd.se6329.cometbooks;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Controller controllerInstance = Controller.getInstance();
        Scanner sc = new Scanner(System.in);

        System.out.println("###################################");
        System.out.println("     Welcome to Cometbooks!");
        System.out.println();

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.print("Enter Netid: ");
        String netid = sc.nextLine();
        System.out.println();

        //perform login
        controllerInstance.login(username, password, netid);

        //complete Transaction
        System.out.println("Was the transaction completed (Y/N)?");
        String prompt = sc.next().charAt(0);
        if(prompt == 'Y' || prompt == 'y'){
            Payment p = new Payment("seller","buyer","20221211",11.46);
        }

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