package Practice24.task3;

import java.awt.*;

public class ImageDocument extends IDocument{
    public ImageDocument() {
        super();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new ImageDocument();
            ex.setVisible(true);
        });
    }
}
