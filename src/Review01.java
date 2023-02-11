
public class Review01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int price = 1500;
		int taxrate = 10;
		int result;
		result = taxMethod(price,taxrate);
		int tax = price +result;
		System.out.println(price+"円の商品の税込価格は"+tax+
				"円(消費税は"+result+"円)です");
	}
	public static int taxMethod(int price, int taxrate) {
	int result = price*taxrate/100;
	return result;
	}

	}

