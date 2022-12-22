/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irem
 */
public class Idman {
    
    private int mekik;
    private int squat;
    private int burpee;
    
    public Idman(int mekik,int squat,int burpee){
        this.mekik=mekik;
        this.squat=squat;
        this.burpee=burpee;
    }

    /**
     * @return the mekik
     */
    public int getMekik() {
        return mekik;
    }

    /**
     * @param mekik the mekik to set
     */
    public void setMekik(int mekik) {
        this.mekik = mekik;
    }

    /**
     * @return the squat
     */
    public int getSquat() {
        return squat;
    }

    /**
     * @param squat the squat to set
     */
    public void setSquat(int squat) {
        this.squat = squat;
    }

    /**
     * @return the şinav
     */
    public int getBurpee() {
        return burpee;
    }

    /**
     * @param şinav the şinav to set
     */
    public void setBurpee(int burpee) {
        this.burpee = burpee;
    }
    
    
    public void hareketYap(String hareketYap,int sayi)
    {
        if(hareketYap.equals("Mekik"))
        {
            mekikYap(sayi);
        }
        else if(hareketYap.equals("Burpee")){
           BurpeeYap(sayi);
        }
        else if(hareketYap.equals("Squat")){
            SquatYap(sayi);
        }
        
    }
    
    public void mekikYap(int sayi){
        if(mekik==0)
        {
            System.out.println("Hedefine ulaştın");
        }
        else if(mekik-sayi<0){
            System.out.println("Tebrikler hedefini geçtin");
            mekik=0;
        }else{
            mekik-=sayi;
            System.out.println("Kalan mekik sayisi :"+mekik);
        }
    }
    
    public void BurpeeYap(int sayi){
        if(burpee==0)
        {
            System.out.println("Hedefine ulaştın");
        }
        else if(burpee-sayi<0){
            System.out.println("Tebrikler hedefini geçtin");
            burpee=0;
        }else{
           burpee-=sayi;
            System.out.println("Kalan Şınav sayisi :"+burpee);
        }
    }
    public void SquatYap(int sayi){
        if(squat==0)
        {
            System.out.println("Hedefine ulaştın");
        }
        else if(squat-sayi<0){
            System.out.println("Tebrikler hedefini geçtin");
            squat=0;
        }else{
            squat-=sayi;
            System.out.println("Kalan squatsayisi :"+squat);
        }
    }
    
    public boolean IdmanBittiMi()
    {
        return (mekik==0) && (squat==0) && (burpee==0);
    }
    
}
