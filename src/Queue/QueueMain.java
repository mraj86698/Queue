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


			default:
				System.out.println("Wrong Entry \n ");
				break;
			}

		}
	}
}
