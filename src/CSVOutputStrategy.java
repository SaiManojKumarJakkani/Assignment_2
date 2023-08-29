
import model.*;
import java.io.*;
import java.util.Date;

// import com.opencsv.CSVWriter;
import java.util.List;

public class CSVOutputStrategy implements OutputStrategy {

    public void writeProfile(LinkedInProfile profile) {
        outputToCSV("LinkedInProfile", profile, "src/output_files/");
        System.out.println("Output saved to CSV file.");

    }
    private static void outputToCSV(String objectName, Object object,String url){
        Class<?> mainClass = object.getClass();
        java.lang.reflect.Field[] mainFields = mainClass.getDeclaredFields();
        for (java.lang.reflect.Field mainField : mainFields) {
            mainField.setAccessible(true); 
            String content="";
            Object mainFieldValue = null;
            if (mainField.getType()== List.class){
                try{
                    BufferedWriter writer = new BufferedWriter(new FileWriter(url+mainField.getName()+".csv"));
                    mainFieldValue=mainField.get(object);
                    List<?> list = (List<?>) mainFieldValue;
                    if(list==null || list.isEmpty()){
                    }
                    else{
                        for (int i = 0; i < list.size(); i++) {
                            if(i==0){content=content+CSVOutputStrategy.writeObjectToCSV("null",  list.get(i),true)+"\n";}
                            else if(i==list.size()-1){content=content+CSVOutputStrategy.writeObjectToCSV("null",  list.get(i),false);}
                            else{content=content+CSVOutputStrategy.writeObjectToCSV("null",  list.get(i),false)+"\n"; }
                        }
                    }
                    writer.write(content);
                    writer.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
            else{
                try{
                    BufferedWriter writer = new BufferedWriter(new FileWriter(url+mainField.getName()+".csv"));
                    mainFieldValue=mainField.get(object);
                    content=content+CSVOutputStrategy.writeObjectToCSV("null", mainFieldValue,true)+"\n";
                    writer.write(content);
                    writer.close();
                }
                catch(Exception e){System.out.println(e);}

            }
        }


    }
    private static String writeObjectToCSV(String objectName, Object object, boolean isHeader) {
        if (object != null) {
            Class<?> objectClass = object.getClass();
            String content="";
            String header="";
            try{
                java.lang.reflect.Field[] fields = objectClass.getDeclaredFields();
                if(isHeader){
                    for (java.lang.reflect.Field field : fields) {
                        field.setAccessible(true); 
                        header=header+field.getName()+",";
                    }
                    header=header.substring(0, header.length()-1);
                }
                for (java.lang.reflect.Field field : fields) {
                        field.setAccessible(true); 
                        Object fieldValue = null;
                        
                        try {
                            fieldValue = field.get(object);
                            Class<?> fieldType = field.getType();
                            if (fieldType.isArray()){
                                if (fieldType.getComponentType() == String.class){
                                String[] stringArrayValue = (String[]) fieldValue;
                                content=content+"\""+String.join(",",stringArrayValue)+"\"";}
                                else if (fieldType.getComponentType() == int.class ){

                                    int[] arrayValue = (int[]) fieldValue;
                                    StringBuilder sb = new StringBuilder();
                                    for (int i = 0; i < arrayValue.length; i++) {
                                        sb.append(arrayValue[i]);
                                        if (i < arrayValue.length - 1) {
                                            sb.append(",");
                                        }
                                    }
                                    String joinedString = sb.toString();
                                    content=content+"\""+joinedString+"\"";
                                }
                                else if (fieldType.getComponentType() == float.class){
                                    float[] arrayValue = (float[]) fieldValue;
                                    StringBuilder sb = new StringBuilder();
                                    for (int i = 0; i < arrayValue.length; i++) {
                                        sb.append(arrayValue[i]);
                                        if (i < arrayValue.length - 1) {
                                            sb.append(",");
                                        }
                                    }
                                    String joinedString = sb.toString();
                                    content=content+"\""+joinedString+"\"";
                                }
                            }
                            else if(field.getType() == String.class){
                                String stringValue = (String) fieldValue;
                                content=content+stringValue+",";
                            }else if(field.getType() == int.class){
                                int stringValue = (int) fieldValue;
                                content=content+stringValue+",";
                            } 
                            else if(field.getType() == float.class){
                                float stringValue = (float) fieldValue;
                                content=content+stringValue+",";
                            } 
                            else if(field.getType() == boolean.class){
                                boolean stringValue = (boolean) fieldValue;
                                if(stringValue){content=content+"true"+",";}
                                else{content=content+"false"+",";}
                            } 
                            else if (fieldType == Date.class) {
                                Date dateValue = (Date) fieldValue;
                                content=content+dateValue+",";
                            } 
                            else if (fieldType == Privacy.class) {
                                Privacy privacyValue = (Privacy) fieldValue;
                                content=content+privacyValue+",";
                            } 
                            else if (fieldType == Proficiency.class) {
                                Proficiency privacyValue = (Proficiency) fieldValue;
                                content=content+privacyValue+",";
                            } 
                          else if (fieldType == EmployeeType.class) {
                                EmployeeType privacyValue = (EmployeeType) fieldValue;
                                content=content+privacyValue+",";
                            } 
                        }
                        catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                }
            }
            catch(Exception e){
                System.out.println(e);
                System.exit(1);
            }
        
        if(isHeader){ return header+"\n"+content.substring(0, content.length()-1);}

        else{return content.substring(0, content.length()-1);}

        }
        else{
            return "";
        }
    }


}