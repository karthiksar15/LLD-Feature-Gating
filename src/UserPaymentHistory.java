import java.util.Date;

public class UserPaymentHistory {
	private Double amntPayed;
	private Date payementDate;
	private String paymentStatus;
	public Double getAmntPayed() {
		return amntPayed;
	}
	public void setAmntPayed(Double amntPayed) {
		this.amntPayed = amntPayed;
	}
	public Date getPayementDate() {
		return payementDate;
	}
	public void setPayementDate(Date payementDate) {
		this.payementDate = payementDate;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}
