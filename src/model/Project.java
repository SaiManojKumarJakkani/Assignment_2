
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Project {
    private String projectName;
    private String description;
    private Date startDate;
    private Date endDate;
    private String associatedWith;

    // Setters
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(String startDate) {
        String pattern = "yyyy-MM-dd"; 
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = dateFormat.parse(startDate);
            this.startDate = date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }

    public void setEndDate(String endDate) {
        String pattern = "yyyy-MM-dd"; 
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = dateFormat.parse(endDate);
            this.endDate = date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }

    public void setAssociatedWith(String associatedWith) {
        this.associatedWith = associatedWith;
    }

    // Getters
    public String getProjectName() {
        return projectName;
    }

    public String getDescription() {
        return description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getAssociatedWith() {
        return associatedWith;
    }
}
