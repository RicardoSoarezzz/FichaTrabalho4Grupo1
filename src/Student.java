public class Student {
    int student_num;
    String student_name;
    String Course;

    public Student(int student_num, String student_name, String course) {
        this.student_num = student_num;
        this.student_name = student_name;
        Course = course;
    }

    public int getStudent_num() {
        return student_num;
    }

    public void setStudent_num(int student_num) {
        this.student_num = student_num;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_num=" + student_num +
                ", student_name='" + student_name + '\'' +
                ", Course='" + Course + '\'' +
                '}';
    }
}
