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
public class ResumeHistory {
    private ArrayList<Resume> resumeHistory;
    
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

    public void setImage(String filename) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
