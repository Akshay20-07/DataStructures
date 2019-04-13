public class Factorial{
	public static int fact(int num) throws IllegalArgumentException{
		if(num<0)
		 throw new IllegalArgumentException();
		else if(num==0)
		 return 1;
	    else
	     return num*fact(num-1);
	 }

	 public static void main(String[] args){
	    fact(5);
	  }

}
