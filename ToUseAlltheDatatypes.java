package practice;
public class ToUseAlltheDatatypes {

	public static void main(String[] args) {
		//Data declaration	
		int i=10; 
		int j=10;
		char N='Y';
		double A= 5.25825;
		double B=3.5826;
		boolean x =true;
		boolean z =false;
		//operations 
		int  r=i+j;
		int v= i*j;
		int q= i/j;
		Double Y= A+B;
		if (x == true){

			// Print statement
			System.out.println("Hi Geek");
		}
		// If condition holds
		if(z == false){

			// Print statement
			System.out.println("Hello Geek");        
		}

		// to print the values 
		System.out.println("adding the integer values:" +r);
		System.out.println("Multiplication the integer values:" +v);
		System.out.println("dividing the integer values:" +q);
		System.out.println("Adding of the Char:"+N);
		System.out.println("Adding Double values:" +Y);
		System.out.println();

	}

}
