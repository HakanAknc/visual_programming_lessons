package hafta10;

import javax.swing.*;

public class baslat {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form10 f10 = new form10();
                f10.setVisible(true);
            }
        });
    }
}
