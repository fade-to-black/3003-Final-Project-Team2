package Morgan;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class FittingRoom {

	public static void main(String[] args) {
		
		if (args.length < 2) {
			System.out.println("Invalid Arguments:  java FittingRoom [Time(in seconds)]  [Number of Fitting Rooms]");
			System.exit(100);
		}

		// time - in seconds - that customers are allowed to arrive in the waiting area for
		int time = Integer.parseInt(args[0]);
		// number of fitting rooms
		int numFittingRooms = Integer.parseInt(args[1]);
		// number of chairs in waiting area
		int numChairs = numFittingRooms * 2;
		// number of customers
		int numCustomers = numChairs + numFittingRooms;
		
		// Output
		System.out.println("Using arguments from command line");
		System.out.println("Sleep time = " + time);
		System.out.println("Fitting Rooms = " + numFittingRooms);
		System.out.println("Number of chairs in the waiting area = " + numChairs);
		System.out.println("Number of customers = " + numCustomers + "\n");
		


	}

}
