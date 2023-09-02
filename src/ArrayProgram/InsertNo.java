package ArrayProgram;

public class InsertNo {
       public static void main(String args[]) {
    	   int[] a= {10,20,30,40,50,60,70};
    	   int position=3;
    	   int insertNo=90;
    	   System.out.println("orignal array list");
           for(int i=0;i<a.length;i++)
           {
           	System.out.print(a[i]+" ");
           }
           System.out.println("");
           
    	   //insert at position
    	   for(int i=a.length-1;i>position-1;i--) 
    	   {
    		      a[i]= a[i-1];
    	   }
            a[position-1]=insertNo;
            System.out.println("array list after insert at position");
            for(int i=0;i<a.length;i++)
            {
            	System.out.print(a[i]+" ");
            }
            
            System.out.println("");
            //insert at index position
            int indexposition=5;
     	    int insertelement=80;
            for(int i=a.length-1;i>indexposition;i--) 
     	   {
     		      a[i]= a[i-1];
     	   }
             a[indexposition]=insertelement;
             System.out.println();
             System.out.println("new array list after insert at index position");
             for(int i=0;i<a.length;i++)
             {
             	System.out.print(a[i]+" ");
             }
       }
}
