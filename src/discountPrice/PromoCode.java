package discountPrice;

public class PromoCode {

	double priceOfProduct;
	String promoCode;
	double discountedPrice;

	void discount() {
		discountedPrice = priceOfProduct * 0.5;
		if (promoCode == "Promo5") {
			discountedPrice -= discountedPrice * 5 / 100;
			System.out.println("Price of product after discount is $" + discountedPrice);
		} else if (promoCode == "Promo10") {
			discountedPrice -= discountedPrice * 10 / 100;
			System.out.println("Price of product after discount is $" + discountedPrice);
		} else if (promoCode == "Promo20") {
			discountedPrice -= discountedPrice * 20 / 100;
			System.out.println("Price of product after discount is $" + discountedPrice);
		} else {
			System.out.println("No promocodes applied");
			System.out.println("Price of product after discount is $" + discountedPrice);
		}

	}
}
