package homeAssignments;

public class FindIntersection {
	
	public static void main(String[] args) {
		//a) Declare An array for {3,2,11,4,6,7};
		int[] inter1= {3,2,11,4,6,7};
		//b) Declare another array for {1,2,8,4,9,7};
		int[] inter2= {1,2,8,4,9,7};
		
		int len1 = inter1.length; //len=6
		int len2 = inter2.length;
		
		//c) Declare for loop iterator from 0 to array length
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len2;j++)
				if(inter1[i]==inter2[j]) {
					System.out.println(inter1[i]);
				}
			
		}
	}

}
