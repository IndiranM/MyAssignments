package homeAssignments;

public class FindDuplicates {
	
	public static void main(String[] args) {
		         //  0 1 2 3 4 5 6 7
		int[] nums= {2,5,7,7,5,9,2,3};
		
		int ln=nums.length;
		
		for(int i=0;i<=ln-1;i++) { //0<=7 
			
				for(int j=i+1;j<=ln-1;j++) { //j=0+1=1;1<=8;
					if(nums[i]==nums[j]) {  //nums[0]==nums[1] -->2==5
						System.out.println(nums[i]);
					}
				}
			
		}
	}

}
