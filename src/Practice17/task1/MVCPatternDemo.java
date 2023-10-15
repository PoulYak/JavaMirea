package Practice17.task1;


public class MVCPatternDemo {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        Student model = retieveStudentFromDatebase();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Mary");
        controller.setStudentRollNo("No rolls");
        controller.updateView();

    }
    public static Student retieveStudentFromDatebase(){
        Student student = new Student();
        student.setName("Poul");
        student.setRollNo("Rollin'");
        return student;
    }
}
