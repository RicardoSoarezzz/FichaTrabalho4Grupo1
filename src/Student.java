import java.util.List;

/**
 * The Student class represents a student with an ID, name, and course information.
 */
public class Student {

    /**
     * The unique identifier for the student.
     */
    private int id;

    /**
     * The name of the student.
     */
    private String name;

    /**
     * The course in which the student is enrolled.
     */
    private String course;

    /**
     * List of all tickets
     */
    private List<Ticket>ticketsRecord;

    /**
     * Constructs a new Student object with deafult parameters
     */
    public Student(){}

    /**
     * Constructs a new Student object with the specified ID, name, and course.
     *
     * @param id    The unique identifier for the student.
     * @param name  The name of the student.
     * @param course The course in which the student is enrolled.
     */
    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    /**
     * Retrieves the unique identifier of the student.
     *
     * @return The ID of the student.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the student.
     *
     * @param id The new ID of the student.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the student.
     *
     * @return The name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     *
     * @param name The new name of the student.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the course in which the student is enrolled.
     *
     * @return The course of the student.
     */
    public String getCourse() {
        return course;
    }

    /**
     * Sets the course in which the student is enrolled.
     *
     * @param course The new course of the student.
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * Retrieves the list of tickets that current student has.
     * @return List of tickets
     */
    public List<Ticket> getTicketsRecord() {
        return ticketsRecord;
    }

    /**
     * Adds a ticket to the ticket's list of the student
     * @param ticket The ticket to add to the ticket's list
     */
    public void addTicket(Ticket ticket) {
        this.ticketsRecord.add(ticket);
    }

    /**
     * Returns a string representation of the Student object.
     *
     * @return A string containing the ID, name, and course of the student.
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    /**
     *
     * @return
     */
    public double getTotalPayments(){
        double total = 0;
        for(int i=0; i<ticketsRecord.size(); i++){
            total += ticketsRecord.get(i).getAmountPaid();
        }
        return total;
    }
}
