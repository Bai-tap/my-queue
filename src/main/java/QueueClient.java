public class QueueClient {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(4);
        myQueue.enqueue(99);
        myQueue.dequeue();
        myQueue.enqueue(4);
        myQueue.enqueue(4);
        myQueue.enqueue(4);
        myQueue.enqueue(4);
        myQueue.enqueue(4);
        myQueue.enqueue(4);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.enqueue(9);
        myQueue.enqueue(8);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
    }
}
