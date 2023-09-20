package Practice9.task3;

public class Student implements Comparable<Student>{
    String fullName;
    int id;
    int score;

    public Student(String fullName, int id, int score) {
        this.fullName = fullName;
        this.id = id;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                ", score=" + score +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student student) {
        if (this.getScore()>student.getScore())
            return 1;
        else if (this.getScore()== student.getScore())
            return 0;
        return -1;

    }
}
