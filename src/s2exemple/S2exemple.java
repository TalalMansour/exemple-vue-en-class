/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2exemple;

import java.io.FileNotFoundException;
import java.io.IOException;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;
/**
 *
 * @author Talal Mansour
 */
public class S2exemple {
    public static void main(String[] args) {
       try{ 
       String json = FileReader.loadFileIntoString("student.json", "UTF-8");
       //System.out.printinf(json);
       JSONObject mainObj = JSONObject.fromObject(json);
       int id = mainObj.getInt("student_id");
       String fName = mainObj.getString("first_name");
       String lName = mainObj.getString("last_name");
       String dBrth = mainObj.getString("date_birth");
       boolean active = mainObj.getBoolean("active");
       double gpa = mainObj.getDouble("GPA");
       
       JSONArray jsonArr = mainObj.getJSONArray("results");
       JSONObject singleResult; 
       String course_id;
       String course_title;
       double mark;
       
       //les sorties dans un array des object
       JSONArray listCours = new JSONArray();
       JSONObject  singleCours = new JSONObject();
       for (int i = 0 ;i< jsonArr.size();i++){ 
           singleResult = jsonArr.getJSONObject(i);
           course_id = singleResult.getString("course_id");
           course_title = singleResult.getString("course_title");
           mark = singleResult.getDouble("mark");
           singleCours.accumulate("titre",course_id );
           singleCours.accumulate("resultat",mark );
           listCours.add(singleCours);

           System.out.print( "\n "+  singleCours + " " +"\n");     
           System.out.print( "\n "+  listCours + " " +"\n");     
           
           singleCours.clear();
           } 
           System.out.print( "\n "+  listCours + " " +"\n");     
       
       
       
       
       
       } catch (FileNotFoundException fe){
       } catch (IOException ie){
       }
       
    
    
    
    
    }
    
}
