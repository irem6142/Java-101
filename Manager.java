/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irem
 */
public class Manager extends Employee {
    private int SorumluKisiSayisi;
    public Manager(String name, String department, int salary,int ID,int SorumluKisiSayisi ) {
        super(name, department, salary,ID);
        this.SorumluKisiSayisi=SorumluKisiSayisi;
    }

    @Override
    public void showInfo() {
        super.showInfo();//To change body of generated methods, choose Tools | Templates.
        System.out.println("Yneticilerin sorumlu olduğu kişi sayısı :"+SorumluKisiSayisi);
    }
    
    public void zam_Yap(int zam){
        System.out.println("Çalışanlara "+zam +" yaptı.");
    }
    
}
