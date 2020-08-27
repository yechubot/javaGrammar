package javaproject;

 class GoodsInfo {
		String code;
		String name;
		String maker;
		int price;
		int discountRate;
		
		GoodsInfo(String code, String name, String maker, int price, int discountRate){
			this.code = code;
			this.name = name;
			this.maker = maker;
			this.price = price;
			this.discountRate = discountRate;
			}
		
		GoodsInfo(String code, String name, String maker, int price){
			
			this.code = code;
			this.name = name;
			this.maker = maker;
			this.price = price;
		}
		
		int updateDiscountRate(int discountRate) {
			return discountRate;
		}
		
		int getSellingPrice(int price, int discountRate) {
			return price = price - (price*discountRate)/100;
		}
}
