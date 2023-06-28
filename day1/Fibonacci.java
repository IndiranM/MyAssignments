package week1.day1;

public class Fibonacci {
	public static void main(String[] args) {
		
		int FirstNum=0;
		int secNum=1;
		int sum=0;
		System.out.println(FirstNum);
		
		for(int i=1;i<=11;i++) {
			
			sum=FirstNum+secNum;
			 FirstNum=secNum;
			 secNum=sum;
			System.out.println(FirstNum);
	}

}
}
