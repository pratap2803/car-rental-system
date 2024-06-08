import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private String reservation_id;
    private Customer customer;
    private Car car;
    private LocalDate start_date;
    private LocalDate end_date;
    private int total_price;

    public Reservation(String reservation_Id, Customer customer, Car car, LocalDate startDate, LocalDate endDate) {
        this.reservation_id = reservation_Id;
        this.customer = customer;
        this.car = car;
        this.start_date = start_date;
        this.end_date = end_date;
        this.total_price = total_price;
    }

    private double calculateTotalPrice(){
        long daysRented = ChronoUnit.DAYS.between(start_date, end_date) + 1;
        return car.getRentalPricePerDay()*daysRented;
    }

    public String getReservation_id() {
        return reservation_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Car getCar() {
        return car;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public int getTotal_price() {
        return total_price;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservation_id='" + reservation_id + '\'' +
                ", customer=" + customer +
                ", car=" + car +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", total_price=" + total_price +
                '}';
    }
}
