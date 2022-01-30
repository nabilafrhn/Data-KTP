/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp1;

import java.util.Scanner;

/**
 *
 * @author ASUS VIVOBOOK 14
 */
public class KTP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Nama, Alamat, NIK, Jenis_Kelamin, Golongan_Darah, TTL;

        System.out.println("====== KTP ======");
        System.out.println();

        System.out.print("Nama : ");
        Nama = input.nextLine();

        System.out.print("Alamat : ");
        Alamat = input.nextLine();

        System.out.print("Jenis Kelamin : ");
        Jenis_Kelamin = input.nextLine();

        System.out.print("NIK : ");
        NIK = input.nextLine();

        System.out.print("Golongan Darah : ");
        Golongan_Darah = input.nextLine();

        System.out.print("TTL : ");
        TTL = input.nextLine();
        
       

    }

}
