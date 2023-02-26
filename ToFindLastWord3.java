package practice;

public class ToFindLastWord3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String james="luffy is still joyboy ";
       String[] strArray = james.split("\\s");
       int length = strArray[strArray.length-1].length();
       System.out.println("Original String :- \n" + james );
       System.out.print("\nLength of last word '" + strArray[strArray.length-1] + "' is :- \n" + length);
	
		
	}

}
