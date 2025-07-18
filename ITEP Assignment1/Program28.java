// 28. A carpet is 5 m long and 4 m wide. Find its price at the rate of $ 205 per square meter.

class Program28 {
    public static void main(String[] args) {

        int length = 5;
        int width = 4;
        int rate = 205;

        int area = length * width;
        int price = area * rate;

        System.out.println("The price of the carpet is: $" + price);
    }
}
