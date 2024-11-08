package entities;

import java.time.LocalDateTime;
import java.time.temporal.Temporal;

public class CarRental {
	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	public LocalDateTime getFinish() {
		return this.finish;
	}
	
	public LocalDateTime getStart() {
		return this.start;
	}
	
	public Vehicle getVehicle() {
		return this.vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public Invoice getInvoice() {
		return this.invoice;
	}
}
