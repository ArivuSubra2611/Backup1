package practice;

public class PalindromePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name="Madam";
      char[] charArray= name.toCharArray();
      String reverseString="";
      name.toLowerCase();
      
      for (int i = charArray.length-1; i >=0; i--) {
    	  reverseString=reverseString+charArray[i];
   }
      System.out.println("The reverse String of the given word: " +reverseString);
      if(name.equalsIgnoreCase(reverseString)) {
    	  System.out.println("The given String is a Palindrome");
      }else{
    		  System.out.println("The given String is Not a Palindrome");
    	  }
      }
	}


