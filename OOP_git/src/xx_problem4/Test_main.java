package xx_problem4;

import java.util.*;

public class Test_main {
	public static void main(String[] args) {

		int last_369_number = 33;
		System.out.println(problem1(last_369_number));

		int mod1=3, mod2=4, max_range=20;
		System.out.println(problem2(mod1,mod2,max_range));
		
		int arr[] = {3,5,3,5,7,5,7};
		int[] result = problem3(arr);
		for(int i=0; i<result.length;i++)
			System.out.print(result[i]+"/ ");
	}

	public static int problem1(int last_number) {

		int count = 0;

		for(int i=1; i <= last_number; i++) {

			int temp = i;
			while(temp != 0) {

				if (temp%10 == 3 | temp%10 == 6 | temp%10 == 9) {
					count++;
					break;
				}
				temp /= 10;
			}
		}
		return count;
	}
	
	public static int problem2(int mod1, int mod2, int max_range) {

		int count=0;

		for(int i=1; i<=max_range; i++) {
			if(i%mod1==0 & i%mod2!=0)
				count++;
		}

		return count;
	}
	
	public static int[] problem3(int[] arr) {
		Arrays.sort(arr);

		Set<Integer> set = new TreeSet<Integer>();

		for(int i =0; i < arr.length; i++) {

			if(i ==0) {
				if(arr[i]!=arr[i+1])
					set.add(arr[i]);
			}
			else if(i == arr.length-1) {
				if(arr[i-1]!=arr[i])
					set.add(arr[i]);
			}
			else {
				if(arr[i] != arr[i+1] & arr[i-1] != arr[i])
					set.add(arr[i]);
			}
		}
		
		if(set.isEmpty())
			return new int[] {-1};
		else
			return set.stream().mapToInt(Integer::intValue).toArray();
	}
	
}
