/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

/**
 *
 * @author ZIDANE
 */
public class Bola {
    public int JariJari;
    public double phi=3.14;
    
    public int getJariJari(){
    return JariJari;
    }
    
    public double getphi(){
        return phi;
        
    }
    public void setJariJari(int newJariJari){
        JariJari=newJariJari;
    }
    public void setphi(double newphi){
        phi=newphi;
    }
    public void setShowdiameter(){
        int diameter;
        diameter = 2*JariJari;
    }
    public void setShowLuaspermukaan(){
        double luas;
        luas = 4*Math.PI*JariJari;
        System.out.println("Luas Permukaan = "+luas+"cm");
    }
    public void setShowVolume(){
        double Volume;
        Volume = (4*Math.PI*JariJari*JariJari)/3;
        System.out.println("Volume = "+Volume+"cm");
        
    }
}
