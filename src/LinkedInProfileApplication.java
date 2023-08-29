import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import model.*;
// import service.*;


public class LinkedInProfileApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedInProfile profile = new LinkedInProfile();
        profile.setActivity(new ArrayList<Activity>());
        profile.setExperiences(new ArrayList<Experience>());
        profile.setEducations(new ArrayList<Education>());
        profile.setLicencesCertificates(new ArrayList<LicencesCertificates>());
        profile.setProjects(new ArrayList<Project>());
        profile.setSkills(new ArrayList<Skill>());
        profile.setCourses(new ArrayList<Course>());
        profile.setLanguages(new ArrayList<Language>());

        while(true){
            System.out.print("choose option to edit:\n 1)Intro\n 2)Contact Info\n 3)Activity\n 4)Experience\n 5)Education\n 6)Licenses & certifications\n 7)Projects\n 8)Skills\n 9)Courses\n 10)Languages\n 11)Logout\n");
            int option = Integer.parseInt(scanner.nextLine());
            if(option==1){
                Intro editIntro = new Intro();

                System.out.print("First Name: ");
                String fname = scanner.nextLine();
                editIntro.setFirstName(fname);

                System.out.print("Last Name: ");
                String lname = scanner.nextLine();
                editIntro.setLastName(lname);

                System.out.print("Additional Name: ");
                String aname = scanner.nextLine();
                editIntro.setAdditionalName(aname);

                System.out.print("Pronouns: ");
                String pro = scanner.nextLine();
                editIntro.setPronouns(pro);

                System.out.print("Headline: ");
                String headline = scanner.nextLine();
                editIntro.setHeadline(headline);

                System.out.print("Current Position: ");
                String currentPosition = scanner.nextLine();
                editIntro.setCurrentPosition(currentPosition);
            
                System.out.print("Industry: ");
                String industry = scanner.nextLine();
                editIntro.setIndustry(industry);
            
                System.out.print("Education: ");
                String education = scanner.nextLine();
                editIntro.setEducation(education);

                System.out.print("Location:\n ");
                String [] location =new String[2];
                System.out.print("Country: ");
                location[0] = scanner.nextLine();
                System.out.print("City: ");
                location[1] = scanner.nextLine();
                editIntro.setLocation(location);

                profile.setIntro(editIntro);
                
            }
            else if(option==2){
                ContactInfo editContactInfo = new ContactInfo();
                System.out.print("Phone: ");
                String number = scanner.nextLine();
                try{
                    if (number.length() != 10 || !number.matches("\\d+")) {
                        throw new IllegalArgumentException("Invalid phone number length");
                    }
                }
                catch(Exception e){
                    System.out.println("Please enter valid phone number\n");
                    continue;
                }
                editContactInfo.setPhone(number);

                System.out.print("Email: ");
                String email = scanner.nextLine();
                editContactInfo.setEmail(email);

                System.out.print("Twitter Url: ");
                String twitterURL = scanner.nextLine();
                editContactInfo.setTwitterUrl(twitterURL);

                System.out.print("Birthday(Format: year-mm-dd): ");
                String birthday = scanner.nextLine();
            
                editContactInfo.setBirthday(birthday);

                profile.setContactInfo(editContactInfo);
                System.out.println(profile.getContactInfo().toString());
            }
            
            else if(option==3){
                System.out.println("All activity: ");
                for(Activity e:profile.getActivities()){
                    if(e.getActivityType().equals("post")){
                        System.out.println("You posted:");
                        System.out.println(e.getContent());
                        System.out.println("Privacy: "+e.getPrivacy());
                        System.out.println("Date: "+e.getDate());
                    }
                    else if(e.getActivityType().equals("comment")){
                        System.out.println("You commented:");
                        System.out.println(e.getContent());
                        System.out.println("on Post Id"+ e.getPostId());
                        System.out.println("Privacy: "+e.getPrivacy());
                        System.out.println("Date: "+e.getDate());
                    }
                }
                System.out.print("Create 1)Post or 2)Comment or 3)None: ");
                String opt = scanner.nextLine();
                if(Integer.parseInt(opt)==1|| Integer.parseInt(opt)==2){
                    Activity editActivity = new Activity();
                    Random random = new Random();
                    editActivity.setId(random.nextInt(100000 - 10000 + 1) + 10000);
                    if(Integer.parseInt(opt)==1){
                        editActivity.setActivityType("post");
                        editActivity.setPostId(-1);
                        System.out.print("What do you want to talk about?: ");
                        String content = scanner.nextLine();
                        editActivity.setContent(content);
                    }
                    else if (Integer.parseInt(opt)==2){
                        editActivity.setActivityType("comment");
                        System.out.print("Enter post number to comment on: ");
                        String postId = scanner.nextLine();
                        editActivity.setPostId(Integer.parseInt(postId));
                        System.out.print("What do you want to comment?: ");
                        String content = scanner.nextLine();
                        editActivity.setContent(content);
                    }
                    System.out.print("Privacy restrictions: ");
                    for (Privacy privacy : Privacy.values()) {
                        System.out.print(privacy);
                        System.out.print(", ");
                    }
                    System.out.println();
                    System.out.print("Enter your privacy level from above list: ");
                    String org = scanner.nextLine();
                    try{Privacy privacyEnum = Privacy.valueOf(org);
                    editActivity.setPrivacy(privacyEnum);}
                    catch (IllegalArgumentException e) {
                        System.out.println("Invalid privacy value: " + org);
                        continue;
                    }
                    editActivity.setDate();
                    profile.addActivities(editActivity);
                }

            }
            
            else if(option==4){
                System.out.println("Experinces: ");
                for(Experience e:profile.getExperiences()){
                    System.out.println("title: "+e.getTitle());
                    System.out.println("Employee Type: "+e.getEmployeeType());
                    System.out.println("Location: "+e.getLocation());
                    System.out.print("Current Job: ");
                    if(e.isCurrentJob()){System.out.println("yes");}
                    else{System.out.println("no");}
                    System.out.println("Description: "+e.getDescription());
                    System.out.println("Skills: "+String.join(", ", e.getSkills()));
                }
                System.out.print("Add Experince(y/n): ");
                String opt = scanner.nextLine();
                if(opt.equals("y")){
                    Experience editExperience = new Experience();

                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    editExperience.setTitle(title);

                    System.out.print("Employee Type: ");

                    for (EmployeeType employeeType : EmployeeType.values()) {
                        System.out.print(employeeType);
                        System.out.print(", ");
                    }
                    System.out.println();
                    System.out.print("Enter your Employee Type from above list: ");
                    String org = scanner.nextLine();
                    try{EmployeeType employeeTypeEnum = EmployeeType.valueOf(org);
                    editExperience.setEmployeeType(employeeTypeEnum);}
                    catch (IllegalArgumentException e) {
                        System.out.println("Invalid Employe type value: " + org);
                        continue;
                    }

                    System.out.print("Company Name: ");
                    String cname = scanner.nextLine();
                    editExperience.setCompanyName(cname);

                    System.out.print("Location: ");
                    String lname = scanner.nextLine();
                    editExperience.setLocation(lname);

                    System.out.print("Current Job(yes/no): ");
                    String curr = scanner.nextLine();
                    if(curr=="yes"){ editExperience.setCurrentJob(true);}
                    else{ editExperience.setCurrentJob(false);}


                    System.out.print("Description: ");
                    String descrption = scanner.nextLine();
                    editExperience.setDescription(descrption);
                
                    System.out.print("Skills(comma separated): ");

                    String skills = scanner.nextLine();
                    editExperience.setSkills(skills.split(","));

                    profile.addExperiences(editExperience);

                }

            }
            
            else if(option==5){
                System.out.println("Education: ");
                for(Education e:profile.getEducations()){
                    System.out.println("School Name: "+e.getSchool());
                    System.out.println("Degree: "+e.getDegree());
                    System.out.println("Field Of Study: "+e.getFieldOfStudy());
                    System.out.println("Grade: "+e.getGrade());
                    System.out.println("Skills: "+String.join(", ", e.getSkills()));
                }
                System.out.print("Add Education(y/n): ");
                String opt = scanner.nextLine();
                if(opt.equals("y")){
                    Education editEducation = new Education();

                    System.out.print("School Name: ");
                    String title = scanner.nextLine();
                    editEducation.setSchool(title);

                    System.out.print("Degree: ");
                    String deg = scanner.nextLine();
                    editEducation.setDegree(deg);

                    System.out.print("Field Of Study: ");
                    String fieldOfStudy = scanner.nextLine();
                    editEducation.setFieldOfStudy(fieldOfStudy);

                    System.out.print("Grade: ");
                    String grade = scanner.nextLine();
                    editEducation.setGrade(Float.parseFloat(grade));
                
                    System.out.print("Skills(comma separated): ");
                    String skills = scanner.nextLine();
                    editEducation.setSkills(skills.split(","));

                    profile.addEducation(editEducation);

                }





            }
            
            else if(option==6){
                System.out.println("Licences & Certificates: ");
                for(LicencesCertificates e:profile.getLicencesCertificates()){
                    System.out.println("School Name: "+e.getName());
                    System.out.println("Degree: "+e.getOrganization());
                    System.out.println("Field Of Study: "+e.getIssueDate());
                    System.out.println("Grade: "+e.getExpirationDate());
                    System.out.println("Skills: "+String.join(", ", e.getSkills()));
                }
                System.out.print("Add Licences & Certificates(y/n): ");
                String opt = scanner.nextLine();
                if(opt.equals("y")){
                    LicencesCertificates editLicencesCertificates = new LicencesCertificates();

                    System.out.print(" Name: ");
                    String title = scanner.nextLine();
                    editLicencesCertificates.setName(title);

                    System.out.print("Organization: ");
                    String org = scanner.nextLine();
                    editLicencesCertificates.setOrganization(org);

                    System.out.print("Issue Date (yyyy-MM-dd): ");
                    String issueDate = scanner.nextLine();
                    editLicencesCertificates.setIssueDate(issueDate);

                    System.out.print("Expiration Date (yyyy-MM-dd): ");
                    String expirationDate = scanner.nextLine();
                    editLicencesCertificates.setExpirationDate(expirationDate);
                
                    System.out.print("Skills(comma separated): ");
                    String skills = scanner.nextLine();
                    editLicencesCertificates.setSkills(skills.split(","));

                    profile.addLicencesCertificates(editLicencesCertificates);

                }





            }
            
            else if(option==7){
                System.out.println("Projects: ");
                for(Project e:profile.getProjects()){
                    System.out.println("Project Name: "+e.getProjectName());
                    System.out.println("Description: "+e.getDescription());
                    System.out.println("Start Date: "+e.getStartDate());
                    System.out.println("End Date: "+e.getEndDate());
                    System.out.println("Associated With: "+e.getAssociatedWith());
                }
                System.out.print("Add Projects(y/n): ");
                String opt = scanner.nextLine();
                if(opt.equals("y")){
                    Project editProject = new Project();

                    System.out.print("Project Name: ");
                    String title = scanner.nextLine();
                    editProject.setProjectName(title);

                    System.out.print("Description: ");
                    String org = scanner.nextLine();
                    editProject.setDescription(org);

                    System.out.print("Start Date (yyyy-MM-dd): ");
                    String startDate = scanner.nextLine();
                    editProject.setStartDate(startDate);

                    System.out.print("End Date (yyyy-MM-dd): ");
                    String endDate = scanner.nextLine();
                    editProject.setEndDate(endDate);
                
                    System.out.print("Associated With: ");
                    String associatedWith = scanner.nextLine();
                    editProject.setAssociatedWith(associatedWith);

                    profile.addProjects(editProject);

                }





            }
            
            else if(option==8){
                System.out.println("Skills: ");
                for(Skill e:profile.getSkills()){
                    System.out.println("Skill Name: "+e.getName());
                    System.out.println("Follow Skill: "+e.isFollowSkill());
                }
                System.out.print("Add Skills(y/n): ");
                String opt = scanner.nextLine();
                if(opt.equals("y")){
                    Skill editSkill = new Skill();

                    System.out.print("Skill Name: ");
                    String title = scanner.nextLine();
                    editSkill.setName(title);

                    System.out.print("Follow Skill for updates?(yes/no) : ");
                    String org = scanner.nextLine();
                    if(org.equals("yes")){editSkill.setFollowSkill(true);}
                    else{editSkill.setFollowSkill(false);}

                    profile.addSkills(editSkill);
                }

            }
            
            else if(option==9){
                System.out.println("Courses: ");
                for(Course e:profile.getCourses()){
                    System.out.println("Course Name: "+e.getCourseName());
                    System.out.println("Course Number: "+e.getNumber());
                    System.out.println("Associated With: "+e.getAssociatedWith());
                }
                System.out.print("Add Ccourses(y/n): ");
                String opt = scanner.nextLine();
                if(opt.equals("y")){
                    Course editCourse = new Course();

                    System.out.print("Course Name: ");
                    String title = scanner.nextLine();
                    editCourse.setCourseName(title);

                    System.out.print("Course Number: ");
                    String org = scanner.nextLine();
                    editCourse.setNumber(Integer.parseInt(org));

                    System.out.print("Associated With: ");
                    String associatedWith = scanner.nextLine();
                    editCourse.setAssociatedWith(associatedWith);

                    profile.addCourses(editCourse);

                }





            }
            
            else if(option==10){
                System.out.println("Languages: ");
                for(Language e:profile.getLanguages()){
                    System.out.println("Language: "+e.getName());
                    System.out.println("Proficiency: "+e.getProficiency());
                }
                System.out.print("Add Languages(y/n): ");
                String opt = scanner.nextLine();
                if(opt.equals("y")){
                    Language editLanguage = new Language();

                    System.out.print("Language Name: ");
                    String title = scanner.nextLine();
                    editLanguage.setName(title);

                    System.out.print("Proficiency: ");
                    for (Proficiency proficiency : Proficiency.values()) {
                        System.out.print(proficiency);
                        System.out.print(", ");
                    }
                    System.out.println();
                    System.out.print("Enter your Proficiency level from above list: ");
                    String org = scanner.nextLine();
                    try{Proficiency proficiencyEnum = Proficiency.valueOf(org);
                    editLanguage.setProficiency(proficiencyEnum);}
                    catch (IllegalArgumentException e) {
                        System.out.println("Invalid enum value: " + org);
                        continue;
                    }
                    profile.addLanguages(editLanguage);
                }

            }
            else if(option==11){break;}
            else{
                System.out.println("Please enter valid option");
                continue;
            }
        }
        
        // LinkedInProfileApplication.writeObjectToCSV("LinkedInProfile", profile,"model/output_files/");
        System.out.print("Choose output format to save (csv/json): ");
        String outputFormat = scanner.nextLine();

        OutputStrategy outputStrategy;

        if (outputFormat.equalsIgnoreCase("csv")) {
            outputStrategy = new CSVOutputStrategy();
        } else if (outputFormat.equalsIgnoreCase("json")) {
            outputStrategy = new JSONOutputStrategy();
        } else {
            System.out.println("Invalid output format");
            return;
        }

        outputStrategy.writeProfile(profile);

        scanner.close();
    }

}
