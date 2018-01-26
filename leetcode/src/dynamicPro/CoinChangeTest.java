package dynamicPro;

public class CoinChangeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinChange cc = new CoinChange();
		int[] coins = {2, 5, 90, 123};
		int amount = 331;
		int res = cc.coinChange(coins, amount);
		System.out.print(res);

	}

}
