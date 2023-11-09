
public class Review01 {

    public static void main(String[] args) {
        int money = (int) tax(1500);
        int total = money + 1500;

        System.out.println("1500円の商品の税込価格は" + total + "円（消費税は" + money + "円）です。");

    }

    public static double tax(int num1) {
        double result = num1 * 0.1;
        return result;

    }

}
