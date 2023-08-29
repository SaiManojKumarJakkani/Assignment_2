

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import model.*;
public class JSONOutputStrategy implements OutputStrategy {
    @Override
    public void writeProfile(LinkedInProfile profile) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            File jsonFile = new File("linkedin_profile.json");
            objectMapper.writeValue(jsonFile, profile);
            System.out.println("Output saved to JSON file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}