package DataStructureAssingment1;
import java.util.Scanner;
public class Arrays extends DataStructureApp {
	
		private int arr[];
		private int count;
		private int size;
		
		public void Arrays() {
			this .arr=new int [size];
			this .count=0;
			this.size=1;
			
		}
		public void insert(int value) {
			arr[count]=value;
			count++;
		}
   
}
