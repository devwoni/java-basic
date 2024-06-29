package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createProductOrder("두부", 2000, 2);
        productOrders[1] = createProductOrder("김치", 5000, 1);
        productOrders[2] = createProductOrder("콜라", 1500, 2);

        printOrders(productOrders);
        int totalPrice = getTotalPrice(productOrders);
        System.out.println("총 결제 금액: " + totalPrice);
    }

    static ProductOrder createProductOrder(String name, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = name;
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


