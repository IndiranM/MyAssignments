package homeAssignments;

import java.util.Arrays;

public class FindFirstMissingElementInAnArray {

	public static void main(String[] args) {
		
			int[] arr = {1,2,3,4,7,6,8};
			int len=arr.length;
			Arrays.sort(arr);
			for(int i=1; i<len;i++) {
				if(i!=arr[i-1]) {
					System.out.println("Missing number is"+ " "+i);
					break;
				}

			}
		}

	}
