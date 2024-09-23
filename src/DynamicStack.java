import java.util.LinkedList;

public class DynamicStack {
    private LinkedList<Integer> stack;

    public DynamicStack() {
        stack = new LinkedList<>();
    }

    public void push(int element) {
        stack.addFirst(element);
    }

    public boolean search(int element) {
        return stack.contains(element);
    }

    public boolean removeItem(int element) {
        if (stack.isEmpty()) {
            return false;
        };
        return stack.removeFirstOccurrence(element);
    }

    public LinkedList<Integer> printAll() {
        return stack;
    }

    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();

        stack.push(5);
        stack.push(10);
        stack.push(20);

        System.out.println(stack.printAll());

        System.out.println("Чи міститься 10: " + stack.search(10));

        System.out.println("Вилучений елемент " + 20 + " :" + stack.removeItem(20));
        System.out.println("Чи міститься 20: " + stack.search(20));

        System.out.println(stack.printAll());
    }
}
