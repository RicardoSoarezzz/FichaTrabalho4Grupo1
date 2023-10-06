import java.time.LocalTime;

public class Ticket {

    LocalTime Entry;
    LocalTime Exit;
    String vehicle;
    Double amount;

    public Ticket(LocalTime entry, LocalTime exit, String vehicle, Double amount) {
        Entry = entry;
        Exit = exit;
        this.vehicle = vehicle;
        this.amount = amount;
    }

    public LocalTime getEntry() {
        return Entry;
    }

    public void setEntry(LocalTime entry) {
        Entry = entry;
    }

    public LocalTime getExit() {
        return Exit;
    }

    public void setExit(LocalTime exit) {
        Exit = exit;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "Entry=" + Entry +
                ", Exit=" + Exit +
                ", vehicle='" + vehicle + '\'' +
                ", amount=" + amount +
                '}';
    }
}
