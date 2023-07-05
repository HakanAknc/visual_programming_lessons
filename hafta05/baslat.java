package hafta05;

import javax.swing.*;

public class baslat {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form5 f5 = new form5();
                f5.setVisible(true);

                form6 f6 = new form6();
                f6.setVisible(true);

                form7 f7 = new form7();
                f7.setVisible(true);

                form8 f8 = new form8();
                f8.setVisible(true);
            }
        });
    }
}
