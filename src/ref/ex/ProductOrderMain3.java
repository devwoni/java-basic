package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = sc.nextInt();
        sc.nextLine();
        ProductOrder[] orders = new ProductOrder[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 주문을 입력하세요.");
            System.out.print("상품명: ");
            String productName = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            orders[i] = createProduct(productName, price, quantity);
        }

        printOrders(orders);
        int totalPrice = getTotalPrice(orders);
        System.out.println("총 결제 금액: " + totalPrice);
    }

    static ProductOrder createProduct(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;

    }
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalPrice(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }

        return totalPrice;
    }
}
