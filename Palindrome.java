package practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String Anu="MALAYALAM";
  char[] anuArray=Anu.toCharArray();
  String reverseString= "";
		  for (int i = anuArray.length-1; i >=0; i--) {
			  reverseString = reverseString+anuArray[i];
		}
    System.out.print(reverseString);
    if(Anu.equals(reverseString)) {
    	System.out.println(" The given word is Plaindrome");
    }else {
    	System.out.println(" The given word is Not a Plaindrome");
    }
	}

}

