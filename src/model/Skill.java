package model;
public class Skill {
    private String name;
    private boolean followSkill;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setFollowSkill(boolean followSkill) {
        this.followSkill = followSkill;
    }

    // Getters
    public String getName() {
        return name;
    }

    public boolean isFollowSkill() {
        return followSkill;
    }
}
