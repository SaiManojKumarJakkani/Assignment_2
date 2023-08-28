package model;

public class ContactInfo {
    private int[] phone;
    private String email;
    private String twitterUrl;
    private int[] birthday;

    // Setters
    public void setPhone(int[] phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public void setBirthday(int[] birthday) {
        this.birthday = birthday;
    }

    // Getters
    public int[] getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public int[] getBirthday() {
        return birthday;
    }
}
