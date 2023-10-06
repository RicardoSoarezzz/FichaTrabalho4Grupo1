import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The ParkingLot class represents a parking lot with ticket records, current tickets,
 * capacity, and the number of free parking spots.
 */
public class ParkingLot {

    /**
     * The list of ticket records for the parking lot.
     */
    private ArrayList<Ticket> ticketRecord;

    /**
     * The list of current tickets issued for parked vehicles.
     */
    private ArrayList<Ticket> ticketCurrent;

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
    public ArrayList<Ticket> getTicketRecord() {
        return ticketRecord;
    }

    /**
     * Sets the list of ticket records for the parking lot.
     *
     * @param ticketRecord The new list of ticket records.
     */
    public void setTicketRecord(ArrayList<Ticket> ticketRecord) {
        this.ticketRecord = ticketRecord;
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
    public ParkingLot() {
        ticketRecord = new ArrayList<>();
        ticketCurrent = new ArrayList<>();
        FREE_SPOTS = CAPACITY;
    }

    /** Add a ticket based on student number*/

    public void addTicket( Student student) {
        if (FREE_SPOTS > 0) {
            // Create a new Ticket object with the student number
            Ticket ticket = new Ticket("TicketID", LocalTime.now(), "Vehicle", student);
            ticketCurrent.add(ticket);
            ticketRecord.add(ticket);
            FREE_SPOTS--;
            System.out.println("Ticket added for student number " + student);
        } else {
            System.out.println("The parking lot is full. Please try again later.");
        }
    }
}
