package Queue;

public class Queue<T extends Comparable<T>> {
	Node<T> head;
	Node<T> tail;
	private T[] queue;

	public Queue() {
		head = null;
	}
	/**
	 * Insert an element to the end of the queue.
	 * @param item
	 */
	public void enqueue(T item) {
		Node<T> node = new Node<T>(item);
		if (head == null) {
			head = node;
			head.next = null;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			node.next = null;
		}

	}

	public void display() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	/**
	 * Delete the element from the beginning of the queue.
	 * @return
	 */
	public T dequeue() {
		Node<T> temp = head;
		if (head == null) {
			System.out.println("queue is empty");
			return null;
		}

		head = head.next;
		return temp.data;

	}

	/**
	 * @purpose test to see wheather the queue is empty or not
	 * @param it needs nothing
	 * @return it returns boolean value
	 */
	public boolean isEmpty() {
		return head == null ? true : false;
	}



}


