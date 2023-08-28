package model;
import java.util.*;

public class LinkedInProfile {
    private Intro intro;
    private ContactInfo contactInfo;
    private Activity activity;
    private List<Experience> experiences;
    private List<Education> educations;
    private List<LicencesCertificates> licencesCertificates;
    private List<Project> projects;
    private List<Skill> skills;
    private List<Course> courses;
    private List<Language> languages;

    public void setIntro(Intro intro) {
        this.intro = intro;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public void setLicencesCertificates(List<LicencesCertificates> licencesCertificates) {
        this.licencesCertificates = licencesCertificates;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    // Getters
    public Intro getIntro() {
        return intro;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public Activity getActivity() {
        return activity;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public List<LicencesCertificates> getLicencesCertificates() {
        return licencesCertificates;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Language> getLanguages() {
        return languages;
    }


    public void addExperiences(Experience experience) {
        this.experiences.add(experience);
    }

    public void addEducation(Education education) {
        this.educations.add(education);
    }

    public void addLicencesCertificates(LicencesCertificates licencesCertificates) {
        this.licencesCertificates.add(licencesCertificates);
    }

    public void addProjects(Project project) {
        this.projects.add(project);
    }

    public void addSkills(Skill skill) {
        this.skills.add(skill);
    }

    public void addCourses(Course course) {
        this.courses.add(course);
    }

    public void addLanguages(Language language) {
        this.languages.add(language);
    }
}
