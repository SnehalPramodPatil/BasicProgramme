package ArrayProgram;

public class BinarySearch {
     public static void main(String args[]) {
    	 int[] a= {2,4,6,8,10,14,15,18,20,25};  //binary search perfom only on sorted array
    	 int searchelement=15;
    	 int li=0;
    	 int hi=a.length-1;
    	 int mid=li+hi/2;     //10
    	// System.out.println(mi);
    	 while(li<=hi) {
    	 if(a[mid]==searchelement) {
    		 System.out.println("element is found at "+mid+" index position");
    		 break;
    	 }
    	 else if(a[mid]<searchelement) {       //10<15  if mid is less than search no then new lowerindx will be mid+1
    		 li=mid+1;         
    	 }else {
    		 hi=mid-1;
    	 }
    	 mid=(hi+li)/2;            //if mid is greater than search no then new higherindex will be mid-1
    	 }
    	 if(li>hi) {
    		 System.out.println("element is not found "); 
    	 }
     }
}
           //best case time complexity  O(1)
           // average case time complexity O(log n)
            //worst case time complexity   O(log n)