package ArrayProgram;

import java.util.Arrays;

public class ArrayEqual {
	public static void main(String args[]) {
		int[] a = { 10,7, 12, 15,6,8 };
		int[] b = { 10, 15, 12,8,6,7 };
		Arrays.sort(a);
		Arrays.sort(b);
		boolean isEqual=true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]){
					isEqual=false;
				}
			}
		}
		else {
			isEqual=false;
		}
		if(isEqual==true) {
			System.out.println("Arrays are Equal");
		}else {
			System.out.println("Arrays are not Equal");
		}
	}
}
