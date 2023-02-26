package practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int firstnum=1, secondnum=2, sum=3;
    System.out.println(firstnum);
    System.out.println(secondnum);
    
    for (int i = 1; i < 11; i++) {
		sum=firstnum+secondnum;
		firstnum=secondnum;
		secondnum=sum;
		System.out.println(sum);
	}
	}

}
