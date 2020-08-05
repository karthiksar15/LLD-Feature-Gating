
public class UserType extends User{
	
	private Double deliveryCharges;
	private Integer noOfDaysToDeliver;
	private Double splDiscounts;
	public Double getDeliveryCharges() {
		return deliveryCharges;
	}
	public void setDeliveryCharges(Double deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}
	public Integer getNoOfDaysToDeliver() {
		return noOfDaysToDeliver;
	}
	public void setNoOfDaysToDeliver(Integer noOfDaysToDeliver) {
		this.noOfDaysToDeliver = noOfDaysToDeliver;
	}
	public Double getSplDiscounts() {
		return splDiscounts;
	}
	public void setSplDiscounts(Double splDiscounts) {
		this.splDiscounts = splDiscounts;
	}

}
