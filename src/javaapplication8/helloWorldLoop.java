package javaapplication8;

public class helloWorldLoop {

	public static void main(String[] args) {
	       int outerCounter =1;
	       while (outerCounter <=50){
	    	   int innerCounter = 1;
	    	   while (innerCounter <=10) {
	    	   System.out.println("Hello, World!");
	    	   innerCounter++;
	       }
      outerCounter++;
	}

}
}