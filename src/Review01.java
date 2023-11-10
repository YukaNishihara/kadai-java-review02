
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        int tax = tax(price);
        int total = tax + price;

        System.out.println(price + "円の商品の税込価格は" + total + "円（消費税は" + tax + "円）です。");

    }

    public static int tax(int price) {
        double rate = 0.1;
        int result = (int)(price * rate);
        return result;

    }

}
