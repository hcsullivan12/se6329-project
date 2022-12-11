package edu.utd.se6329.cometbooks;

import java.util.ArrayList;
import java.util.Scanner;
import org.apache.commons.lang3.tuple.Pair;

//Singleton class pattern
public class Controller
{
    private Controller() {
        // TODO Auto-generated constructor stub
    }
    
    public void login(String username, String password, String netId) {
        Student s = new Student(username, password, netId);
        UTDGalaxy utdg = UTDGalaxy.getInstance();
        String dob = utdg.authenticateUser(netId, password);
        if(dob == null){
            //handle not authenticated
        } else {
            s.update(dob);
        }
        getEnrolledCourses(netId,s);
    }

    public void getEnrolledCourses(String netid, Student s){
        UTDCoursebook utdCoursebookInstance = UTDCoursebook.getInstance();
        ArrayList<Course> courseList = utdCoursebookInstance.getCourses(netid);
        System.out.println("Enrolled courses for the student are:");
        for(int i=0;i<courseList.size();i++){
            System.out.println(courseList.get(i));
        }
        getTextbook(netid, s);
    }

    public void getTextbook(String netid, Student s){
        Scanner sc = new Scanner(System.in);
        UTDCoursebook utdCoursebookInstance = UTDCoursebook.getInstance();
        ArrayList<Textbook> textbookList = utdCoursebookInstance.getTextbooks(netid);
        ArrayList<Textbook> finalTextbookList;
        System.out.println("Do you want to sell suggested books? (Y/N)");
        char ch = sc.next().charAt(0);
        if (ch == 'N' || ch == 'n') {
            ArrayList<Textbook> newTextbookList = new ArrayList<>();
            while(true) {
                System.out.println("Please enter name of the textbook");
                String textbookName = sc.nextLine();
                System.out.println("Please enter author of the textbook");
                String textbookAuthor = sc.nextLine();
                System.out.println("Please enter ISBN of the textbook");
                String textbookISBN = sc.nextLine();
                newTextbookList.add(new Textbook(textbookName, textbookAuthor, textbookISBN));
                System.out.println("Do you want to continue selling? (Y/N)");
                char flag = sc.next().charAt(0);
                if(flag == 'Y' || flag == 'y') break;
            }
            finalTextbookList = newTextbookList;
            addBooksForSale(newTextbookList, s);
        } else {
            finalTextbookList = textbookList;
            saleSuggestedBook(textbookList);
        }

        getMarketSalesPrice(finalTextbookList);


    }
    public void getMarketSalesPrice(ArrayList<Textbook> textbookList){
        ThirdPartySeller tpseller = ThirdPartySeller.getInstance();
        ArrayList<Pair<String, Double>> prices = tpseller.getMarketSalesPrices(textbookList);

        displayPrices(prices);
    }

    public void displayPrices(ArrayList<Pair<String, Double>> prices){
        for(int i=0;i<prices.size(); i++){
            System.out.println("Book : " + prices.get(i).getKey() + "Price : " + prices.get(i).getValue());
        }
    }
    public void saleSuggestedBook(ArrayList<Textbook> textbookList) {
        System.out.println("Suggested textbooks for the student are:");
        for(int i=0;i<textbookList.size();i++){
            System.out.println(textbookList.get(i));
        }
    }
    
    public void addBooksForSale(ArrayList<Textbook> textbookList, Student s) {
        s.setTextbookSold(textbookList);
        s.createRecord();
    }
    
    public void submitBookForSale(String bookCondition, String salesPrice) {
        
    }
    
    public void completeTransaction() {
        
    }

    public void sendMessage(String from, String to, String payload){
        Message message = new Message(from, to, payload);
    }

    public static Controller controllerInstance = null;

    public static Controller getInstance(){
        if(controllerInstance == null) controllerInstance = new Controller();
        return controllerInstance;
    }

}
