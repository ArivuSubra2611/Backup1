package practice;

public class CommonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int[] Arivu= {26,14,16,8,55};
             int[] Daksana= {5,8,17,26,31};
             int count=0;
             for(int i = 0; i< Arivu.length; i++) {
             for(int j = 0; j< Daksana.length; j++) {
            	 if (Arivu[i]== Daksana[j]) {
            		 count++;
            	 }
            	 }
             } 
             System.out.println("Common Number for the Both:" +count);
             } 
	}


