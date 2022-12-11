package edu.utd.se6329.cometbooks;

import java.util.ArrayList;

public class Schedule
{
    private ArrayList<Course> courseList;
    
    public Schedule() {
        this.courseList = new ArrayList<Course>();
    }
    
    public void addCourse(Course course) {
        this.courseList.add(course);
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void removeCourse(Course course) {
        this.courseList.remove(course);
    }

    public void updateCourse() {
        
    }
    
    public ArrayList<Course> getCourses(){
        return courseList;
    }
}
