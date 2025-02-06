
public class Review01 {

    public static void main(String[] args) {
        //本体価格の指定
        double itemPrice = 1500;
        //税込み価格
        double taxPrice = tax(itemPrice);
        double tax = taxPrice - itemPrice;
        System.out.println((int)itemPrice + "円の商品の税込価格は" + (int)taxPrice + "円（消費税は" + (int)tax + "円）です。");
    }
    public static double tax(double itemPrice) {
        //税率
        double tax = 1.1;
        //税込み価格計算
        double taxPrice = itemPrice * tax;
        return taxPrice;
    }

}
