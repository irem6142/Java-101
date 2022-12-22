/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irem
 */
public class software extends Employee {
    private String languages;
    
    public software(String name, String department, int salary,int ID,String languages) {
        super(name, department, salary,ID);
        this.languages=languages;
    }
    public void FormatAt(String Operating_System)
    {
        System.out.println(getName()+" "+Operating_System+" yüklüyor.");
    }

    @Override
    public void showInfo() {
        super.showInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Bildiği diller :"+ getLanguages());
    }

    /**
     * @return the languages
     */
    public String getLanguages() {
        return languages;
    }

    /**
     * @param languages the languages to set
     */
    public void setLanguages(String languages) {
        this.languages = languages;
    }
    
    
}
