package Practice10.task1;

public class Student {
    private String firstName;
    private String lastName;
    private String speciality;
    private int courseNumber;
    private String group;
    private double avgScore;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", speciality='" + speciality + '\'' +
                ", courseNumber=" + courseNumber +
                ", group='" + group + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public Student(String firstName, String lastName, String speciality, int courseNumber, String group, double avgScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.courseNumber = courseNumber;
        this.group = group;
        this.avgScore = avgScore;
    }
}
