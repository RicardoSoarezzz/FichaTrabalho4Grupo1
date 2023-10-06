import java.time.LocalTime;

/**
 * The Ticket class represents a parking ticket containing entry and exit times, vehicle information,
 * the amount paid, and the associated student (if applicable).
 */
public class Ticket {

    /**
     * The unique identifier for the ticket.
     */
    private String ticketID;
    /**
     * The time when the vehicle entered the parking lot.
     */
    private LocalTime entryTime;

    /**
     * The time when the vehicle exited the parking lot.
     */
    private LocalTime exitTime;

    /**
     * The description of the vehicle (e.g., license plate number).
     */
    private String vehicle;

    /**
     * The amount paid for parking.
     */
    private double amountPaid;

    /**
     * The student associated with the ticket (if applicable).
     */
    private Student student;

    /**
     * Constructs a new Ticket object with the specified entry time, vehicle information, and associated student.
     *
     * @param entryTime The time when the vehicle entered the parking lot.
     * @param vehicle   The description of the vehicle (e.g., license plate number).
     * @param student   The student associated with the ticket (if applicable).
     */
    public Ticket(String ticketID, LocalTime entryTime, String vehicle, Student student) {
        this.ticketID = ticketID;
        this.entryTime = entryTime;
        this.student = student;
        this.vehicle = vehicle;
    }

    /**
     * Retrieves the time when the vehicle entered the parking lot.
     *
     * @return The entry time of the vehicle.
     */
    public LocalTime getEntryTime() {
        return entryTime;
    }

    /**
     * Sets the time when the vehicle entered the parking lot.
     *
     * @param entryTime The new entry time of the vehicle.
     */
    public void setEntryTime(LocalTime entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * Retrieves the time when the vehicle exited the parking lot.
     *
     * @return The exit time of the vehicle.
     */
    public LocalTime getExitTime() {
        return exitTime;
    }

    /**
     * Sets the time when the vehicle exited the parking lot.
     *
     * @param exitTime The new exit time of the vehicle.
     */
    public void setExitTime(LocalTime exitTime) {
        this.exitTime = exitTime;
    }

    /**
     * Retrieves the description of the vehicle.
     *
     * @return The vehicle description (e.g., license plate number).
     */
    public String getVehicle() {
        return vehicle;
    }

    /**
     * Sets the description of the vehicle.
     *
     * @param vehicle The new vehicle description.
     */
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Retrieves the amount paid for parking.
     *
     * @return The amount paid for parking.
     */
    public double getAmountPaid() {
        return amountPaid;
    }

    /**
     * Sets the amount paid for parking.
     *
     * @param amountPaid The new amount paid for parking.
     */
    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    /**
     * Retrieves the student associated with the ticket (if applicable).
     *
     * @return The associated student.
     */
    public Student getStudent() {
        return student;
    }

    /**
     * Sets the student associated with the ticket (if applicable).
     *
     * @param student The new associated student.
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * Retrieves the unique number of the ticket.
     *
     * @return ticket's unique identifier
     */
    public String getTicketID() {
        return ticketID;
    }

}