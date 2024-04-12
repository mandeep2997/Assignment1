package rideClass;

public class WaterRidesReq {

	int capacity = 10;
   double heightofPerson = 90;

	void getARide() {

		if (capacity <= 10) {

			System.out.println("People are Eligible to take a ride");

		} else if (capacity > 10) {

			System.out.println("People are Not Eligible to take a ride");

		}
		if (heightofPerson == capacity);
		{

			System.out.println("People are Eligible for a ride");
		}

	}
}
