package access.ex;

public class MaxCounter {
    private int max;
    private int count;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (isMaxCountValid(count)) {
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다");
        }
    }

    public int getCount() {
        return count;
    }

    private boolean isMaxCountValid(int count) {
        return count < max;
    }
}
