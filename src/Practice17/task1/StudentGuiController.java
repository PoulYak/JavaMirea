package Practice17.task1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class StudentGuiController {
    private Student model;
    private GUI view;

    public StudentGuiController(Student model, GUI view) {
        this.model = model;
        this.view = view;
        view.addGenerateButtonListener(new GenerateButtonListener());
    }

    public void updateView() {
        view.updateView(model.getName(), model.getRollNo());
    }

    private class GenerateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            generateModelData();
            updateView();
        }
    }

    private void generateModelData() {
        Random random = new Random();
        model.setRollNo("Student " + random.nextInt(1000));
        model.setName("RollNo " + random.nextInt(10000));
    }

}
