package homeAssignments;

import java.util.Arrays;

import com.sun.tools.javac.code.Attribute.Array;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int len=data.length; //len=6
		Arrays.sort(data);
		System.out.println(data[len-2]);
			}
		}

	
