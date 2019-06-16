package fromMuhtar;

import java.util.ArrayList;

public class Deneme {

	int x;
	
	static void hey(int i) {
			i = i * i;
	}
		
	static void hey2(String s) {
			s += s;
	}		
		static int count=0;
		int k =0;
		public void modify()
		{
			while(k<5)
			{
				k++;
				count++;
			}
		}
		public static void main(String[] args) 
		{
//ArrayList<Integer> x = new ArrayList();
//			
//			x.add(1);
//			x.add(2);
//			x.add(3);
//			x.remove(2);
//			x.add(2,5);
//			
//			System.out.println(x);

			String s = "Hello";
			Integer i = 10;
			Deneme object = new Deneme();
			object.x = 10;
			
			hey(i);
			hey2(s);
			hey(object.x);
			
			System.out.println(object.x +"..." +  i +"..."+ s);
		}}		
//			int[] x;
//			x = new int[] {10,20};
//		}
			
