package User;

public class Unboxing {
      public static void main(String args[]) {
    	  
			Integer a = new Integer(10);
			int i = a;
			System.out.println(a);

			Byte b1 = new Byte((byte)15);
			byte bb = b1;
			System.out.println(b1);
			
			Character ch=new Character('a');
			char c=ch;
			System.out.println(ch);
			
			Short s=new Short((short)20);
			short s1=s;
			System.out.println(s1);
			
			Long l=new Long(21458l);
			long l1=l;
			System.out.println(l1);
			
			Float f=new Float(4f);
			float f1=f;
			System.out.println(f1);
			
			Double d=new Double(4522);
			double d1=d;
			System.out.println(d1);
			
//			Boolean b2=new Boolean(true);
//			boolean  b3=b2;
//			System.out.println(b2);
			
		}
	}