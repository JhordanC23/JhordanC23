/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray2d.no2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class LatihanArray2DNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j, k, m, n, p, q;
        int matriks1[][] = new int[10][10];
        int matriks2[][] = new int[10][10];
        int hasil[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris matriks pertama: ");
        m = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks pertama: ");
        n = scan.nextInt();
        System.out.print("Masukkan jumlah baris matriks kedua: ");
        p = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks kedua: ");
        q = scan.nextInt();
        if (m != p || n != q) 
        {
            System.out.println("Matriks tidak dapat dijumlahkan satu sama lain ");
        } 
        else 
        {
        System.out.println("Masukkan elemen matriks pertama: ");
        for (i = 0; i < m; i++) 
        {
            for (j = 0; j < n; j++) 
            {
            matriks1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks kedua: ");
        for (i = 0; i < p; i++) 
        {
            for (j = 0; j < q; j++) 
            {
            matriks2[i][j] = scan.nextInt();
            }
        }
        for (i = 0; i < m; i++) 
        {
            for (j = 0; j < q; j++) 
            {
                hasil[i][j] =  matriks1[i][j] + matriks2[i][j];
  
            }
        }
        
        System.out.println("Hasil penjumlahan matriks: ");
        for (i = 0; i < m; i++) 
        {
            for (j = 0; j < n; j++) 
            {
                System.out.print(hasil[i][j] + "    ");
            }
            System.out.println();
        }
    }
  }
    
}
