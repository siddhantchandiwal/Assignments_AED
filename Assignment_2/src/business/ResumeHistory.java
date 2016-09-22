/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
import java.util.ArrayList;
/**
 *
 * @author Siddhant
 */
    // Getters and Setters 
public class ResumeHistory {
    
    

    /*public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }*/
    private ArrayList<Resume> resumeHistory;
   // private boolean gender=false;
   //private boolean nationality=false;
   // private boolean graduated=false;

       
    public ResumeHistory(){
        resumeHistory=new ArrayList<Resume>();
    }

    public ArrayList<Resume> getResumeHistory() {
        return resumeHistory;
    }

    public void setResumeHistory(ArrayList<Resume> resumeHistory) {
        this.resumeHistory = resumeHistory;
    }
    
    public Resume addResume(){
        Resume rs=new Resume();
        resumeHistory.add(rs);
        return rs;
    }
    
    public void deleteResume(Resume r){
         resumeHistory.remove(r);
    } 
    
   /* public void setButtonGender(boolean gender){
        this.gender=gender;
    }
    
    public boolean getButtonGender(){
        return gender;
    } 
    
    public boolean getButtonGraduated() {
        return graduated;
    }

    public void setButtonGraduated(boolean graduated) {
        this.graduated = graduated;
    }
    
    public boolean getButtonNationality() {
        return nationality;
    }

    public void setButtonNationality(boolean nationality) {
        this.nationality = nationality;
    }*/
}
