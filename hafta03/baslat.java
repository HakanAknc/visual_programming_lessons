package hafta03;

import javax.swing.*;

public class baslat {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form3 f3 = new form3();
                f3.setVisible(true);

                form4 f4 = new form4();
                f4.setVisible(true);

                form5 f5 = new form5();
                f5.setVisible(true);
            }
        });
    }
}
