package CabBooking;
import com.google.gson.Gson;

public class TripInfo {
	
	private String typeOfVehicle;
	private String paymentMethod;
	private String primaryPassangerName;
	private String searchId;
	
	public String getSearchId() {
		return searchId;
	}


	public void setSearchId(String searchId) {
		this.searchId = searchId;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}


	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}


	public String getPaymentMethod() {
		return paymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	public String getPrimaryPassangerName() {
		return primaryPassangerName;
	}


	public void setPrimaryPassangerName(String primaryPassangerName) {
		this.primaryPassangerName = primaryPassangerName;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
}
