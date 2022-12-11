package edu.utd.se6329.cometbooks;
import java.util.Scanner;

public class Main(){
    private String username;
    private String password;

    //here main acts as seller
    public static void main(String[] args){
        Controller controllerInstance = Controller.getInstance();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username :");
        username = sc.nextLine();
        sc.flush();
        System.out.println("Enter password :");
        password = sc.nextLine();
        sc.flush();
        System.out.println("Enter Netid :");
        netid = sc.nextLine();
        sc.flush();

        //perform login
        controllerInstance.login(username, password, netid);


        //handle the chat part
        System.out.println("What do you identify as (B/S)?");
        identity = sc.nextChar();
        while(true){
            System.out.println("Type message :");
            message = sc.nextLine();
            if(identity == 'S') controllerInstance.sendMessage("seller" , "buyer", message);
            else controllerInstance.sendMessage("buyer" , "seller", message);
            System.out.println("Do you want to continue (Y/N)?");
            ch = sc.nextChar();
            if(ch=='N' || ch=='n') break;
        }

    }
}