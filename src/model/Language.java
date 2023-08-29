package model;

public class Language {
    private String name;
    private Proficiency proficiency;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setProficiency(Proficiency proficiency) {
        this.proficiency = proficiency;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Proficiency getProficiency() {
        return proficiency;
    }
}
