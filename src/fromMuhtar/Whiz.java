package fromMuhtar;

public class Whiz {

	public static void main(String[] args) {
		Whizsup w =  new Whizsub();
//		w.print();
	w.g();
//		
		System.out.println(w.x);
	}
}

 class Whizsup  {

	 int x = 20;
	 
	 public void print() {
		System.out.println("class Whizsup");
		}
	 
	   public  void g(){System.out.println("sup");}

}
 
 class Whizsub extends Whizsup {
	 int x = 10;

	 public void print() {
			System.out.println("class Whizsub");
		}
	   public void g(){System.out.println("sub");}

	}

