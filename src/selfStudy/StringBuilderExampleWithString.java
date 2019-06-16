package selfStudy;

public class StringBuilderExampleWithString {

	public static void main(String[] args) {
		String str = new String("Java");

		String str1 = "Java";
		String str2 = new String(str1);
		//System.out.print(str1 == str2);
		
		boolean b = true;
		String str3 = Boolean.toString(true);
		
		String ss =  Integer.toString(7);
		System.out.println(ss + 7);
		
	}

}
