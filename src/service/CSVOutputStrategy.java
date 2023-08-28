package service;
import model.*;
import java.io.*;
// import com.opencsv.CSVWriter;
import java.util.List;

public class CSVOutputStrategy implements OutputStrategy {

    public void writeProfile(LinkedInProfile profile) {
        // writeObjectToCSV("LinkedInProfile", profile, "./output_files/");

    }
    // private static void writeObjectToCSV(String objectName, Object object, String location) {

    //     if (object != null) {
    //         Class<?> objectClass = object.getClass();
    //         try{
    //             java.lang.reflect.Field[] fields = objectClass.getDeclaredFields();
    //             for (java.lang.reflect.Field field : fields) {
    //             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
    //             writer.write(header[0]+","+header[1]);
    //             writer.newLine(); 
    //             for (String[] record : data) {
    //                 writer.write(record[0]+","+record[1]);
    //                 writer.newLine();
    //             }
    //             writer.close();
    //         }
    //         catch(Exception e){
    //             System.out.println(e);
    //             System.exit(1);
    //         }
            
    //         for (java.lang.reflect.Field field : fields) {
    //             field.setAccessible(true); // Make the private field accessible
    //             String fieldName = field.getName();
    //             String fieldValue = null;

    //             try {
    //                 // Extract field value
    //                 Object value = field.get(object);
    //                 if (value != null) {
    //                     fieldValue = value.toString();
    //                 }
    //             } catch (IllegalAccessException e) {
    //                 e.printStackTrace();
    //             }
        
    //         }

    //     }
    // }
}