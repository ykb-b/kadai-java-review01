
public class Review01 {

    public static void main(String[] args) {
        //本体価格の指定
        int itemPrice = 1500;
        //消費税額
        int taxPrice = tax(itemPrice);
        //税込み価格
        int taxInPrice = taxPrice + itemPrice;
        System.out.println(itemPrice + "円の商品の税込価格は" + taxInPrice + "円（消費税は" + taxPrice + "円）です。");
    }
    public static int tax(int itemPrice) {
        //税率
        double taxPer = 1.1;
        //消費税額計算
        double tax = itemPrice * taxPer - itemPrice;
        return (int)tax;

    }

}
