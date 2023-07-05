package hafta08;

import javax.swing.*;

public class baslat {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form8 f8 = new form8();
                f8.setVisible(true);
            }
        });
    }
}
