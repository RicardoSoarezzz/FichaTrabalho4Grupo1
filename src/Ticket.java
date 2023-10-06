import java.time.LocalTime;

public class Ticket {

    LocalTime Entry;
    LocalTime Exit;
    String vehicle;
    Double amount;
    Student student;

    public Ticket(LocalTime entry, LocalTime exit, String vehicle, Double amount, Student student) {
        Entry = entry;
        Exit = exit;
        this.vehicle = vehicle;
        this.amount = amount;
        this.student = student;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "Entry=" + Entry +
                ", Exit=" + Exit +
                ", vehicle='" + vehicle + '\'' +
                ", amount=" + amount +
                ", student=" + student +
                '}';
    }
}
