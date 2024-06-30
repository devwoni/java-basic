package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count = 0;
    private int totalPrice = 0;

    public void addItem(Item item) {
        if (count == items.length) {
            System.out.println("상품을 더이상 추가할수 없습니다.");
            return;
        }
        items[count] = item;
        count++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < count; i++) {
            System.out.println("상품명: " + items[i].getProductName() + ", 합계: " + items[i].getTotalPrice());
            totalPrice += items[i].getTotalPrice();
        }

        System.out.println("전 가격 합: " + totalPrice);
    }
}
