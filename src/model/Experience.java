package model;
enum EmployeeType {
    FULL_TIME,
    PART_TIME,
    CONTRACTOR,
    INTERN,
    FREELANCER
}
enum LocationType {
    ON_SITE,
    REMOTE,
    HYBRID,
}

public class Experience {
    private String title;
    private EmployeeType employeeType;
    private String companyName;
    private String location;
    private boolean currentJob;
    private String description;
    private String[] skills;

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCurrentJob(boolean currentJob) {
        this.currentJob = currentJob;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        return location;
    }

    public boolean isCurrentJob() {
        return currentJob;
    }

    public String getDescription() {
        return description;
    }

    public String[] getSkills() {
        return skills;
    }
}
