package wyklad.w02;

public
	class Main{

	public static void main(String[] args){
	
		System.out.println("Hello PPJ");
		//System.out.println(null);
		
		System.out.println(false);
		System.out.println(true);
		
		System.out.println(123456789);
		System.out.println(20); // dec
		System.out.println(020); // oct
		System.out.println(0x20); // hex
		System.out.println(0b10100); // bin
		
		System.out.println('a'); // char
		System.out.println('\177'); // char
		System.out.println('\u00BA'); // char
		
		String str;
		int val;
		
		str = null;
		{
			double dVal = .14;
		}
		float  fVal = .14f;
		
		//System.out.println(val);
		{
			double dVal = .14;
		}
		double dVal = .14;
		
		{
			int wrt = 100;
			
			System.out.println(
				wrt < 50 ? "jestem tu": " a nie bojestem tu"
			);
		}
		
	}
	
}