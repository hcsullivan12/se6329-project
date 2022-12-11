package edu.utd.se6329.cometbooks;

//Singleton class pattern
public class Controller
{
    private Controller() {
        // TODO Auto-generated constructor stub
    }
    
    public void login(String username, String password, String netId) {
        Student s = new Student(username, password, netId);
        UTDGalaxy utdg = getInstance();
        dob = utdg.authenticateUser(netId, password);
        if(dob == null){
            //handle not authenticated
        } else {
            s.update(dob);
        }
        handleGetEnrolledCourses(netId,s);
    }

    public void handleGetEnrolledCourses(String netid, Student s){
        UTDCoursebook utdCoursebookInstance = UTDCoursebook.getInstance();
        ArrayList<Courses> courseList = utdCoursebookInstance.getCourses(netid);
        System.out.println("Enrolled courses for the student are:");
        for(int i=0;i<courseList.size();i++){
            System.out.println(courseList.get(i));
        }
        handleGetTextbook(netid, s);
    }

    public void handleGetTextbook(String netid, Student s){
        UTDCoursebook utdCoursebookInstance = UTDCoursebook.getInstance();
        ArrayList<Textbook> textbookList = utdCoursebookInstance.getTextbooks(netid);
        System.out.println("Do you want to sell suggested books? (Y/N)");
        ch = sc.getChar();
        if (ch == 'N' || ch == 'n') {
            ArrayList<Textbook> newTextbookList = new ArrayList<>();
            while(1) {
                System.out.println("Please enter name of the textbook");
                textbookName = sc.nextLine();
                System.out.println("Please enter author of the textbook");
                textbookAuthor = sc.nextLine();
                System.out.println("Please enter ISBN of the textbook");
                textbookISBN = sc.nextLine();
                newTextbookList.add(new Textbook(textbookName, textbookAuthor, textbookISBN));
                System.out.println("Do you want to continue selling? (Y/N)");
                flag = sc.getChar();
                if(flag == 'Y' || flag == 'y') break;
            }
            addBooksForSale(newTextbookList, s);
        } else {
            System.out.println("Suggested textbooks for the student are:");
            for(int i=0;i<textbookList.size();i++){
                System.out.println(textbookList.get(i));
            }
        }
    }

    public void saleSuggestedBook(String textbook) {
        
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

    public static Controller controllerInstance = null

    public static Controller getInstance(){
        if(controllerInstance == null) controllerInstance = new Controller();
        return controllerInstance;
    }

}
