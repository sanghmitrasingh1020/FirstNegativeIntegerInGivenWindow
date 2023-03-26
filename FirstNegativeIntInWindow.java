package queue1;
import java.util.LinkedList;
public class FirstNegativeIntInWindow {
    public static void main(String[] args) {
        int[] nums = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;

        LinkedList<Integer> qu = new LinkedList<>();

        int i;
        for (i = 0; i < k; i++) {
            if (nums[i] < 0) {
                qu.addLast(i);
            }
        }

        for (; i < nums.length; i++) {
            if (!qu.isEmpty()) {
                System.out.print(nums[qu.peek()] + " ");
            } else {
                System.out.print("0 ");
            }

            while (!qu.isEmpty() && qu.peek() <= (i - k)) {
                qu.removeFirst();
            }

            if (nums[i] < 0) {
                qu.addLast(i);
            }
        }
        if (!qu.isEmpty()) {
            System.out.print(nums[qu.peek()] + " ");
        } else {
            System.out.print("0 ");

        }
    }
}
