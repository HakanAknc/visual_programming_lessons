package hafta07;

import javax.swing.*;

public class baslat {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form7 f7 = new form7();
                f7.setVisible(true);

                form8 f8 = new form8();
                f8.setVisible(true);

                form9 f9 = new form9();
                f9.setVisible(true);
            }
        });
    }
}
