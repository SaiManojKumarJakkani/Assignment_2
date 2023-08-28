package model;

public class Intro {
    private String firstName;
    private String lastName;
    private String additionalName;
    private String pronouns;
    private String headline;
    private String currentPosition;
    private String industry;
    private String education;
    private String[] location;

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdditionalName(String additionalName) {
        this.additionalName = additionalName;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }


    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdditionalName() {
        return additionalName;
    }

    public String getPronouns() {
        return pronouns;
    }

    public String getHeadline() {
        return headline;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public String getIndustry() {
        return industry;
    }

    public String getEducation() {
        return education;
    }

    public String[] getLocation() {
        return location;
    }

}
