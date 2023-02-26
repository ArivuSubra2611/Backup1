package practice;

public class ToFindLastword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Arivu="fly me to the moon";
        
		System.out.println("Original String :- \n" + Arivu );
       String[] strArray = Arivu.split("\\s");
        int length = strArray[strArray.length-1].length();
       System.out.print("\nLength of last word '" + strArray[strArray.length-1] + "' is :- \n" + length);
	
		
	}
	}


