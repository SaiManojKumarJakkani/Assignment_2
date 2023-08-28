package model;
public class Education {
    private String school;
    private String degree;
    private String fieldOfStudy;
    private float grade;
    private String[] skills;

    // Setters
    public void setSchool(String school) {
        this.school = school;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }


    // Getters
    public String getSchool() {
        return school;
    }

    public String getDegree() {
        return degree;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public float getGrade() {
        return grade;
    }

    public String[] getSkills() {
        return skills;
    }

}
