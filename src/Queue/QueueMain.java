package Queue;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Queue Implementation using Array");
		/**
		 * create a queue of capacity 5
		 */
		Queue queue = new Queue();
		while (true) {
			/* Perform Stack Operations */
			System.out.println("\nQueue Operations\n");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Display");
			System.out.println("4. AddFront");
			System.out.println("5. AddRear");
			System.out.println("6. Remove Front");
			System.out.println("7. Remove Rear");
			System.out.println("8. peek");
			System.out.println("9. check empty");
			System.out.println("10. size");
			System.out.println("Enter Your Choice:");
			int choice1 = Utility.inputInteger();
			switch (choice1) {
			case 1:
				System.out.println("How many items do u want to insert into the queue: ");
				int totalItem = Utility.inputInteger();
				System.out.println("Enter element to insert");
				for (int i = 0; i < totalItem; i++) {
					int item = Utility.inputInteger();
					queue.enqueue(item);
				}
				System.out.println("Inserted an element to the end of the queue.");
				break;
			case 2:
				queue.dequeue();
				System.out.println("Dequeued Success for removes the front node ");

				break;
			case 3:
				System.out.println("Queue : ");
				queue.display();
				break;

			case 4:
				System.out.println("How many items do u want to insert into the queue: ");
				int totalItem3 = Utility.inputInteger();
				System.out.println("Enter element to insert");
				for (int i = 0; i < totalItem3; i++) {
					int item = Utility.inputInteger();
					queue.addFront(item);
				}
				System.out.println("Inserted an element to the top of the queue.");
				break;
			case 5:
				System.out.println("How many items do u want to insert into the queue: ");
				int totalItem4 = Utility.inputInteger();
				System.out.println("Enter element to insert");
				for (int i = 0; i < totalItem4; i++) {
					int item = Utility.inputInteger();
					queue.addRear(item);
				}
				System.out.println("Inserted an element to the end of the queue.");
				break;
			case 6:
				queue.removeFront();
				System.out.println("Removed Front Element");

				break;
			case 7:
				queue.removeRear();
				System.out.println("Removed Last Element");
				break;
			case 8:

				 System.out.println("Peek Element = " + queue.peek());
				break;

			case 9:
				System.out.println("Empty status = " + queue.isEmpty());
				break;
			case 10:
				System.out.println("Size = " + queue.size());
				System.out.println("Queue = ");
				queue.display();
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}

		}
	}
}
