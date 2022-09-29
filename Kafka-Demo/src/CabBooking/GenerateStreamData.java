package CabBooking;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;


public class GenerateStreamData {
	public static void main(String[] args) throws InterruptedException, IOException {
		while (true) {

			for (int i = 0; i <= 3; i++) {
				TripInfo tripInfo = new TripInfo();
				
				tripInfo.setSearchId(UUID.randomUUID().toString());

				String[] typeOfVehicle = { "Two-Wheeler", "Auto", "Mini", "Sedan", "SUV" };
				tripInfo.setTypeOfVehicle(RandomItem.randomElement(typeOfVehicle));

				String[] paymentMethod = { "cash", "gpay", "paytm", "phone-pe"};
				tripInfo.setPaymentMethod(RandomItem.randomElement(paymentMethod));

				String[] passengers = { "Ajay", "Bala", "Cyan", "Dinesh", "Ezhil" };
				tripInfo.setPrimaryPassangerName(RandomItem.randomElement(passengers));

				kafkaProducer.sendDataToKafka("kafkademo1", tripInfo.toString());

			}
			System.out.println(3 + " records Sent to Kafka.");
			Thread.sleep(5000);
		}

	}
}