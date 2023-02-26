package practice;



public class LastWordFindigSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		String hanil ="ArivelanSubramanian";
		int length= hanil.length();
		char[] arivArray=hanil.toCharArray();
		//hanil.toLowerCase();
		System.out.println(arivArray[0] +" " +length);
	for (int i = 0; i < arivArray.length; i++) {
		System.out.println(arivArray[i]);
		if(arivArray[i] == 'l') {
	 System.out.println("present in the System ");
		}else {
			 System.out.println("NOt present in the System ");

		}
	}
	}

}
