package discountPrice;

public class ManinPromoCode {
	public static void main(String[] args) {
		PromoCode promocode= new PromoCode();
		promocode.priceOfProduct= 50;
		promocode.promoCode= "Promo";
		promocode.discount();
		}

}
