package edu.utd.se6329.cometbooks;

import java.util.ArrayList;

public class UTDCoursebook
{
    //netid ---> schedule mapper
    private Map<String, Schedule> scheduleMap;
    
    public UTDCoursebook() {
        scheduleMap = new HashMap<String, Schedule>();
    }
    
    public void addSchedule(String netid, Schedule s) {
        this.scheduleMap.put(netid, s);
    }
    
    public void removeSchedule(String netid) {
        this.scheduleMap.remove(netid);
    }

    public void updateCourse(String netid, Schedule s) {
        this.scheduleMap.remove(netid);
        this.scheduleMap.put(netid, s);
    }

    public Schedule getSchedule(String netid){
        return scheduleMap.get(netid);
    }

    public ArrayList<Course> getCourses(String netid){
        return scheduleMap.get(netid).getCourses();
    }

    public ArrayList<Textbook> getTextbooks(String netid){
        ArrayList<Course> courses = scheduleMap.get(netid).getCourses();
        ArrayList<Textbook> textbooks = new ArrayList<>();

        for(int i=0; i<courses.size(); i++){
            textbooks.addAll(courses.get(i).getTextbooks());
        }

        return textbooks;
    }
}