package fromMuhtar;

interface Readable {

	public  void readBook();

	public  void setBookMark();
}

abstract class Book implements Readable {
	public  void readBook() {
	}

}

public class EBook extends Book {
	public void readBook() { }
	

	public static void main(String[] args) {

		Book book1 = new EBook();
		// Book1.readBook();
		
		StringBuilder sb = new StringBuilder("5");
		
		String s = "";
		
		
		if(sb.equals(s))
			System.out.println("Mathch 1");
		else if(sb.toString().equals(s.toString()))
			System.out.println("Mathch 2");
		else
			System.out.println("No Mathch");

	}


	@Override
	public void setBookMark() {
		// TODO Auto-generated method stub
		
	}
}
