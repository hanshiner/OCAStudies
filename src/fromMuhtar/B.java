package fromMuhtar;



class Data {

    int intVal = 0;
    String strVal = "default";
    public Data(int k){
        this.intVal = k; 
    }

}


public class B {
    public static void main(String[] args) throws Exception {
	Data d1 = new Data(10);
    d1.strVal = "D1";
    Data d2 = d1;
    d2.intVal = 20;
    System.out.println("d2 val = "+d2.strVal);
    float f = 43e1;
    
    char ch = 67;
    
    
}}