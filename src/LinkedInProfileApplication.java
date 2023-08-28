import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import model.*;
import service.*;

public class LinkedInProfileApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedInProfile profile = new LinkedInProfile();
        profile.setActivity(new Activity());

        profile.setExperiences(new ArrayList<Experience>());
        profile.setEducations(new ArrayList<Education>());
        profile.setLicencesCertificates(new ArrayList<LicencesCertificates>());
        profile.setProjects(new ArrayList<Project>());
        profile.setSkills(new ArrayList<Skill>());
        profile.setCourses(new ArrayList<Course>());
        profile.setLanguages(new ArrayList<Language>());

        while(true){
            System.out.print("choose option to edit:\n 1) Intro\n 2) Contact Info\n 3) Activity\n 4)Experience\n 5) Education\n 6) Licenses & certifications\n 7)Projects\n 8)Skills\n 9) Courses\n 10)Languages\n 11)Logout\n");
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
                int[] intArray = new int[10];    
                try{
                if (number.length() != 10) {
                    throw new IllegalArgumentException("Invalid phone number length");
                }
                for (int i = 0; i < 10; i++) {
                    intArray[i] = Character.getNumericValue(number.charAt(i));
                }
                }
                catch(Exception e){
                    System.out.println("Please enter valid phone number\n");
                }
                editContactInfo.setPhone(intArray);

                System.out.print("Email: ");
                String email = scanner.nextLine();
                editContactInfo.setEmail(email);

                System.out.print("Twitter Url: ");
                String twitterURL = scanner.nextLine();
                editContactInfo.setTwitterUrl(twitterURL);

                System.out.print("Birthday(Format dd/mm/year): ");
                String birthday = scanner.nextLine();
                String[] birthday1= birthday.split("/");
                int[] birth = new int[3];
                
                for(int i=0;i< birthday1.length; i++){
                    birth[i]=Integer.parseInt(birthday1[i]);
                }
                editContactInfo.setBirthday(birth);

                profile.setContactInfo(editContactInfo);
            }
            else if(option==3){
                System.out.println("All activity: ");
                System.out.println("Posts-> ");
                for(Post e:profile.getActivity().getPosts()){
                    System.out.println("Content: "+e.getContent());
                    System.out.println("Privacy restrictions: "+e.getPrivacy());
                    System.out.println("Posted on: "+e.getDate());
                }
                System.out.println("Comments-> ");
                for(Comment e:profile.getActivity().getComments()){
                    System.out.println("Content: "+e.getContent());
                    System.out.println("Posted on: "+e.getDate());
                }
                System.out.print("Create Post(y/n): ");
                String opt = scanner.nextLine();
                if(opt=="y"){
                    Post editPost = new Post();
                    Random random = new Random();
                    editPost.setId(random.nextInt(100000 - 10000 + 1) + 10000);


                    System.out.print("What do you want to talk about?: ");
                    String content = scanner.nextLine();
                    editPost.setContent(content);

                    System.out.print("Privacy restrictions: ");
                    // String priType = scanner.nextLine();
                    // editPost.setPrivacy(priType);

                    editPost.setDate();
                    profile.getActivity().setPost(editPost);
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
                String aname = scanner.nextLine();
                if(aname=="y"){
                    Experience editExperience = new Experience();

                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    editExperience.setTitle(title);

                    System.out.print("employeeType: ");
                    // String empType = scanner.nextLine();
                    // editExperience.setEmployeeType(empType);

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
                if(opt=="y"){
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
                if(opt=="y"){
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
                if(opt=="y"){
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
                if(opt=="y"){
                    Skill editSkill = new Skill();

                    System.out.print("Skill Name: ");
                    String title = scanner.nextLine();
                    editSkill.setName(title);

                    System.out.print("Follow Skill for updates?(yes/no) : ");
                    String org = scanner.nextLine();
                    if(org=="yes"){editSkill.setFollowSkill(true);}
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
                if(opt=="y"){
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
                if(opt=="y"){
                    Language editLanguage = new Language();

                    System.out.print("Language Name: ");
                    String title = scanner.nextLine();
                    editLanguage.setName(title);

                    System.out.print("Proficiency: ");
                    String org = scanner.nextLine();
                    editLanguage.setName(org);

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
