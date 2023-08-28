package model;
enum Proficiency {
    ELEMENTARY,
    LIMITED_WORKING,
    PROFESSIONAL_WORKING,
    FULL_PROFESSIONAL,
    NATIVE_BILLINGUAL
}
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
