package Practice17.task1;

public class MVCgui {
    public static void main(String[] args) {
        Student s = new Student();
        GUI gui = new GUI();
        StudentGuiController controller = new StudentGuiController(s, gui);
    }
}
