package selfStudy;

import java.time.LocalDate;

public class Localdate {

	public static void main(String[] args) {
		LocalDate lc = LocalDate.now();
		System.out.println(lc);

		LocalDate lc1 = LocalDate.of(2019, 05, 25);
		System.out.println(lc1);
		
		
		int i = 0;
		int y = 7;
		
		for ( i = 0; i < y-1; i+=2) {
		System.out.println(i +" ");	
		}
		
		
	}

}
