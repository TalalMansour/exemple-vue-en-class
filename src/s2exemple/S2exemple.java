/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2exemple;

import java.io.FileNotFoundException;
import java.io.IOException;
import net.sf.json.JSONObject;
/**
 *
 * @author Talal Mansour
 */
public class S2exemple {
    public static void main(String[] args) {
       try{ 
       String json = FileReader.loadFileIntoString("student.json", "UTF-8");
       //System.out.printf(json);
       JSONObject mainObj = JSONObject.fromObject(json);
       int id = mainObj.getInt("student_id");
       String fName = mainObj.getString("first_name");
       String lName = mainObj.getString("last_name");
       String dBrth = mainObj.getString("dat_birth");
       boolean active = mainObj.getBoolean("active");
       double gpa = mainObj.getDouble("GPA");
       

// System.out.print( "\n "+ fName+ " " + id + "\n");
       
       
       
       
       
       
       } catch (FileNotFoundException fe){
       } catch (IOException ie){
       }
       
    
    
    
    
    }
    
}
