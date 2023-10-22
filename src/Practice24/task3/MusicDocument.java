package Practice24.task3;

import java.awt.*;

public class MusicDocument extends IDocument{
    public MusicDocument() {
        super();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new ImageDocument();
            ex.setVisible(true);
        });
    }
}