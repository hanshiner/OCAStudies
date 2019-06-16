package fromMuhtar;

public class BB extends D{

	
	int i =   4;
	   public static void main(String[] args){
	      D a = new BB();
	      a.print();
	   }
	   void print() { System.out.println(i); }
	
	}


class D{
	   D() {  print();   }
	   void print() { System.out.println("A"); }
	}
	