package com.nagarro.ds;
import java.util.List;
public class SubsetSumEasy {
	public static boolean sum(List<Integer> check) {
		int ans=0;
		if (check.size() == 0) {
			return false;
		}
		for(int i=0; i<check.size(); i++) {
			ans+=check.get(i);
		}
		if (ans == 0) {
			return true;
		}
		return false;
	}
	public static void subset(int ans, int[] arr, int vidx) {
		if (ans == 6) {
			System.out.println(true);
			return;
		}
		subset(0+arr[vidx], arr, vidx + 1);
		subset(ans, arr, vidx + 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,8,3,-3};
		subset(0,arr, 0);
		}
	
}