
public class App2 {

	public static void main(String[] args) {
		
		boolean isHotOutside = true ;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 3.20;
		double moneyInWallet = 59.49;
		int thirstLevel = 4;
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket || isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= costOfMilk *2;
		
		
		System.out.println(shouldBuyIcecream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
				
				
				
				
				
					
				}
				
				
		
		

	}


