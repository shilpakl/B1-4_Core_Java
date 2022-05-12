package application;
import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class GSShopFactory
{
	

	// Overriding the getNewPrimeAcc abstract method to provide body
		@Override
		public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime)
		{
			
			return null;
		}

		// Overriding the getNewNormalAcc abstract method to provide body
		@Override
		public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges)
		{
			
			return null;
		}
		

		

		
		
		
		
}
