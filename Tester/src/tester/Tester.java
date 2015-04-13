/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author ASUS 451LN
 */
public class Tester {

Tester (){
//konstruktor default	
}

//method hitung dari kelas induk
public void hitung (){
	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	double l = 0,s=0;
	try {
		
		System.out.println ("Masukkan nilai s :");
		s = Integer.parseInt(bfr.readLine());
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	l = s*s;
	System.out.println ("Luas  = " +l);
}
}
