package Queue;

import java.util.NoSuchElementException;

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

	/**
	 * @purpose adds a new item at front in DeQue
	 * @param item it needs a item
	 * @return it returns nothing
	 */
	public void addFront(T item) {
		Node<T> node = new Node<T>(item);
		node.next = head;
		head = node;

	}

	/**
	 * @purpose adds a new item at rear in DeQue
	 * @param item it needs a item
	 * @return it returns nothing
	 */
	public void addRear(T item) {
		enqueue(item);
	}

	/**
	 * @purpose removes the top item from the queue
	 * @param it needs nothing
	 * @return returns the first item
	 */

	public T removeFront() {
		T data = dequeue();
		return data;
	}

	/**
	 * @purpose removes the rear item from the queue
	 * @param it needs nothing
	 * @return returns the rear item
	 */
	public T removeRear() {
		T data = null;
		Node<T> temp = head;
		if (head.next == null) {
			data = head.data;
			head = null;
			return data;
		}
		while (temp.next.next != null) {
			temp = temp.next;
		}

		data = temp.next.data;
		temp.next = null;
		return data;
	}

	/**
	    * Peek: Return the top element of the queue without deleting it.
	    * @return
	    */
	public T peek() {
		if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception") ;
        return head.getData();
	}

	/**
	 * @purpose checks the size of the queue
	 * @param it needs nothing
	 * @return it returns INTEGER to show size
	 */
	public int size() {
		Node<T> temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}




}


