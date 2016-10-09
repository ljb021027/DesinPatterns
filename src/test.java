import java.util.ArrayList;	
import java.util.List;	
import java.util.Random;	
	
public class test {	
	public static int[] random(int length) {	
		int[] nums = new int[length];	
		List<Integer> list = new ArrayList<Integer>();	
		for (int i = 0; i < length; i++) {	
			list.add(i);	
		}	
		Random ra = new Random();	
		for (int i = 0; i < length; i++) {	
			nums[i] = list.remove(ra.nextInt(length - i));	
		}	
		return nums;	
	}	
	
	public static void main(String[] args) {	
		int[] nums = random(5);	
		for (int i = 0; i < nums.length; i++) {	
			System.out.print(nums[i] + ",");	
		}	
	}	
}	
