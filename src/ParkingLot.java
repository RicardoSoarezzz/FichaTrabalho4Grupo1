import java.util.List;

/**
 * The ParkingLot class represents a parking lot with ticket records, current tickets,
 * capacity, and the number of free parking spots.
 */
public class ParkingLot {

    /**
     * The list of ticket records for the parking lot.
     */
    private List<Ticket> ticketRecord;

    /**
     * The list of current tickets issued for parked vehicles.
     */
    private List<Ticket> ticketCurrent;

    /**
     * The maximum capacity of the parking lot.
     */
    private final int CAPACITY = 500;

    /**
     * The number of free parking spots available in the parking lot.
     */
    private static int FREE_SPOTS;

    /**
     * Retrieves the list of ticket records for the parking lot.
     *
     * @return The list of ticket records.
     */
    public List<Ticket> getTicketRecord() {
        return ticketRecord;
    }

    /**
     * Sets the list of ticket records for the parking lot.
     *
     * @param ticketRecord The new list of ticket records.
     */
    public void setTicketRecord(List<Ticket> ticketRecord) {
        this.ticketRecord = ticketRecord;
    }

    /**
     * Retrieves the list of current tickets issued for parked vehicles.
     *
     * @return The list of current tickets.
     */
    public List<Ticket> getTicketCurrent() {
        return ticketCurrent;
    }

    /**
     * Sets the list of current tickets issued for parked vehicles.
     *
     * @param ticketCurrent The new list of current tickets.
     */
    public void setTicketCurrent(List<Ticket> ticketCurrent) {
        this.ticketCurrent = ticketCurrent;
    }

    /**
     * Retrieves the maximum capacity of the parking lot.
     *
     * @return The maximum capacity of the parking lot.
     */
    public int getCapacity() {
        return CAPACITY;
    }

    /**
     * Retrieves the number of free parking spots available in the parking lot.
     *
     * @return The number of free parking spots.
     */
    public int getFreeSpots() {
        return FREE_SPOTS;
    }

    /**
     * Sets the number of free parking spots available in the parking lot.
     *
     * @param freeSpots The new number of free parking spots.
     */
    public void setFreeSpots(int freeSpots) {
        this.FREE_SPOTS = freeSpots;
    }

    public Student getHighestPayer(){
        Student student = new Student(12, "Jorge", "EI");
        return student;
    }
}
