package week1.day1;

public class FindPrimeNumbers {
	public static void main(String[] args) {
		// find whether the given number is prime or not
		int input=4;
		boolean isPrime=true;
		
		//iterate through the loop
		for(int i=0;i<4;i++) {
			if(i%2==0)
		    isPrime=false;
			break;
			}
		if(isPrime) {
			System.out.println("The given number " +input+ " is a Prime number");
		}else {
			System.out.println("The given number " +input+ " is not a Prime number");
	}
	}
}
