public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currenSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public void enqueue(int item) {
        if (isQueueFulll()) {
            System.out.println("Over flow! Unable to add element " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currenSize++;
            System.out.println("Item " + item + " is pushed to queue");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Under flow! Unable to remove element from queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done! removed: " + queueArr[head - 1]);
                head = 0;
            } else System.out.println("Pop operation done! removed: " + queueArr[head - 1]);
            currenSize--;
        }
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currenSize == 0) {
            status = true;
        }
        return status;
    }

    public boolean isQueueFulll() {
        boolean status = false;
        if (currenSize == capacity) {
            status = true;
        }
        return status;
    }
}
