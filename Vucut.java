package notort;

import java.util.Scanner;

public class Not {

	public static void main(String[] args) {

	
		int kilo;
		double boy;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Boyunuzu Giriniz : ");
		boy = inp.nextDouble();
		
		System.out.print("Lütfen Kilonuzu Giriniz : ");
		kilo = inp.nextInt();
		
		Double Vucut = (kilo/boy*boy);
		
		
		System.out.println("Vücüt Kitle İndeksiniz : "+ Vucut);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 

}
 