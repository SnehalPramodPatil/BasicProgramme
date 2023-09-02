package ArrayMethod;

public class BinarySearch {
         public static void binarySearch(int arr[],int first,int last,int key) {
        	while(first<=last)
        	{
        		int mid=(first+last)/2;
        		if(arr[mid]==key) 
        		{
        			System.out.println("Element is found at " +mid +" position");
        			break;
        		}
        		else if(key<arr[mid]) 
        		{
        			last=mid-1;
        		}
        		else
        		{
        			first=mid+1;
        		}
        	}
        	if(first>last)
        	{
        		System.out.println("Element is not found");
        	}
         }
	
	
	public static void main(String args[]) {
		int arr[]= {10,20,30,40,50,60,70};   //mid=40    key=20
		int key=40;
		int last=arr.length-1;
		//int first=0;
		binarySearch(arr,0,last,70);
	}
}
