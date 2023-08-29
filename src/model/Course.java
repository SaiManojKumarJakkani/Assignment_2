package model;
public class Course {
    private String courseName;
    private int number;
    private String associatedWith;

    // Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAssociatedWith(String associatedWith) {
        this.associatedWith = associatedWith;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public int getNumber() {
        return number;
    }

    public String getAssociatedWith() {
        return associatedWith;
    }
}
