package model;

public class ContactInfo {
    private String phone;
    private String email;
    private String twitterUrl;
    private String birthday;

    // Setters
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    // Getters
    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public String getBirthday() {
        return birthday;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contact Info:\n");
        
        if (phone != null) {
            sb.append("phone: ").append(phone).append("\n");
        }
        
        if (email != null) {
            sb.append("Email: ").append(email).append("\n");
        }
        
        if (twitterUrl != null) {
            sb.append("Twitter URL: ").append(twitterUrl).append("\n");
        }
        if (birthday != null) {
            sb.append("birthday: ").append(birthday).append("\n");
        }
    
        return sb.toString();
    }


}
