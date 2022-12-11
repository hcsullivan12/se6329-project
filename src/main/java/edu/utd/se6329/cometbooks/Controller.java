package edu.utd.se6329.cometbooks;

//Singleton class pattern
public class Controller
{
    private Controller() {
        // TODO Auto-generated constructor stub
    }
    
    public void login(String username, String password, String netId) {
        Student s = new Student(username, password, netId);
    }
    
    public void saleSuggestedBook(String textbook) {
        
    }
    
    public void addBooksForSale(String isbn) {
        
    }
    
    public void submitBookForSale(String bookCondition, String salesPrice) {
        
    }
    
    public void sendMessage(String message, User user) {
        
    }
    
    public void completeTransaction() {
        
    }

    public void sendMessage(String from, String to, String payload){
        Message message = new Message(from, to, payload);
    }

    public static Controller controller_instance = null

    public static Controller getInstance(){
        if(controller_instance == null) controller_instance = new Controller();
        return controller_instance;
    }

}
