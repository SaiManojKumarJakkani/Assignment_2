package model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LicencesCertificates {
    private String name;
    private String organization;
    private Date issueDate;
    private Date expirationDate;
    private String[] skills;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void setIssueDate(String issueDate) {
        String pattern = "yyyy-MM-dd"; 
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = dateFormat.parse(issueDate);
            this.issueDate = date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }

    public void setExpirationDate(String expirationDate) {
        String pattern = "yyyy-MM-dd"; 
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = dateFormat.parse(expirationDate);
            this.expirationDate = date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getOrganization() {
        return organization;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String[] getSkills() {
        return skills;
    }
}
