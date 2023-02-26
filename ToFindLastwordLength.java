package practice;

public class ToFindLastwordLength {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String Alan="Hello World";
	        
	        
			System.out.println("Original String :- \n" + Alan);
            String[] strArray = Alan.split("\\s");
            int length = strArray[strArray.length-1].length();
			System.out.print("\nLength of last word '" + strArray[strArray.length-1] + "' is :- \n" + length);//
		}
		}
