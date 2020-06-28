
public class Loops {
	
	

	public static void main(String[] args) {
		 
		//While Loop 0-100
				int counter = 0;
					while (counter <= 100)	{
						System.out.println(counter);
						
						counter += 2;
					}

					//While loop every 3rd num backwards from 100
					int counter2 = 100;
						while (counter2 >= 0) {
						
							System.out.println(counter2);
						
						counter2 -= 3;
					
					
			}
						//Every other num from 1-100
						for (int i = 1; i <= 100; i ++) {
							if (i % 2 == 1)
							System.out.println(i);
						}
			
						//Numbers Divisble by 3,5 and both 3&5
						for (int x = 0; x <= 100; x ++) {
							if (x % 3 == 0 && x % 5 == 0) {System.out.println("Hello World");}
							else if (x % 5 == 0) { System.out.println("World");}
							else if (x % 3 == 0) { System.out.println("Hello");}
							else {System.out.println(x);}

						}
			
	
	
	
	
	} 




		} 
