package wyklad.w03;

public
	class Main{

	public static void main(String[] args){
	
		System.out.println(
			false ? "tak" : false ? "nie - a" : "nie - b"
		);
		
		if(true){
			System.out.println("test");
			System.out.println("test2");			
		}

/*
		if(){
		}else{
		}
*/

		int wrt1 = 5;
		int wrt2 = 8;
		
		
		if(wrt1==5)
			System.out.println("5");
		else
			if(wrt2 == 8)
				System.out.println("8");
			else
				System.out.println("!5 && !8");
			

//===================================================

		if(wrt1 != 5 && wrt2 != 8)
			System.out.println("!5 && !8");

//===================================================
		int wrt3 = 5;
		if(wrt3 == 5)
			System.out.println("5");
		else
			if(wrt3 == 8)
				System.out.println("8");
			else
				System.out.println("!5 && !8");

//===================================================
		switch(wrt3){
			case 5:
				System.out.println("5");
				break;
			case 8:
				System.out.println("8");
				break;
			default:
				System.out.println("!5 && !8");
		}
		
		switch(wrt3){
			case 5 -> System.out.println("5");
			case 8 -> System.out.println("8");
			default -> System.out.println("!5 && !8");
		}
		
		String str = switch(wrt3){
			case 5 -> {
				System.out.println("tu");
				yield "5";
			}
			case 8 -> "8";
			default -> "!5 && !8";
		};
		System.out.println(str);
	}

}





