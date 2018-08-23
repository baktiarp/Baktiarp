/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

/**
 *
 * @author USER
 */
public class Tes {
    public static void main(String[] args){
      EncapKeluarga biodata = new  EncapKeluarga();
    biodata.setnamaAyah("Superman");
    biodata.setnamaIbu("Wonder Woman");
    biodata.setnamaSendiri("Baktiar Pribangun");
    biodata.setnamaSaudara("Cristiano Ronaldo");
    biodata.setalamat("Jln.Danau Poso G2E.08");
    biodata.sethobi("Berolahraga");
    biodata.setcitacita("Menikah muda");
    biodata.setumur(16);
     
    
    System.out.println("Nama Ayah    : " + biodata.getnamaAyah());
    System.out.println("Nama Ibu     : " + biodata.getnamaIbu());
    System.out.println("Nama Sendiri : " + biodata.getnamaSendiri());
    System.out.println("Nama Saudara : " + biodata.getnamaSendiri());
    System.out.println("Alamat       : " + biodata.getalamat());
    System.out.println("Hobi         : " + biodata.gethobi());
    System.out.println("Cit-acita    : " + biodata.getcitacita());
    System.out.println("Umur         : " + biodata.getumur());
     }
}

