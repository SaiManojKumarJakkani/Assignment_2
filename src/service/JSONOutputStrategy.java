package service;

import model.*;
public class JSONOutputStrategy implements OutputStrategy {
    @Override
    public void writeProfile(LinkedInProfile profile) {
        // ObjectMapper objectMapper = new ObjectMapper();
        // try {
        //     objectMapper.writeValue(new File("profile.json"), profile);
        //     System.out.println("Profile data written to profile.json");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    }
}