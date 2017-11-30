public class Queue<E> {
    private Node first;
    private Node last;

    private class Node<E> {
        private Node next;
        private E item;

        public Node() {

        }

        public Node(E userItem) {
            item = userItem;
        }


    }

    public Queue() {
        first = new Node();
    }

    public int size() {
        if (first == null)
            return 0;
//		else if (first.next==null)
//			return 1;
        else {
            Node current = first;
            int size = 0;
            while (current != null) {
                size++;
                current = current.next;
            }
            return size;
        }
    }

    public boolean isEmpty() {
        if ( size() == 0)
            return true;
        else
            return false;
    }

    public void enqueue(E thing) {
        last.next = new Node(thing);
        last = last.next;
    }

    public E dequeue() {
        return null;
    }

    public E peek() {
        return null;
    }

}