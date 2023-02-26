package practice;

public class ToFindDuplicatesChar
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name="ArivelanSubramanian";
       char[] alanArray= name.toCharArray();
 for (int i = 0; i < alanArray.length; i++) {
 for (int j = i+1; j < alanArray.length; j++) {
	if(alanArray[i]==alanArray[j]) {
		System.out.println("duplicates: " +alanArray[i]);
	}
	}
}
	}

}
