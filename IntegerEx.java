class IntegerEx
{
	public static void main(String[] args) {
			
		Integer a=new Integer(10);
		Integer b=new Integer(10);
		System.out.println(a==b);// false 
		System.out.println(a.equals(b));//true 
		
		Integer a=127;
		Integer b=127;
		System.out.println(a==b);//true
		System.out.println(a.equals(b));//true


		Integer a=128;
		Integer b=128;
		System.out.println(b);
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
		
	}
}