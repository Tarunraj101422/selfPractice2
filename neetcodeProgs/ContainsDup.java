package neetcodeProgs;

import java.util.HashSet;

public class ContainsDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<>();
		int nums[] = { 1, 2, 3, 1 };
		for (int i = 0; i < nums.length; i++) {
			h.add(nums[i]);

		}
		if (nums.length != h.size()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
