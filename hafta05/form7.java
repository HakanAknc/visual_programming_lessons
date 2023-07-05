package hafta05;

import javax.swing.*;

public class form7 extends JFrame{
    private JPanel panel;
    private JTextArea textArea1;

    form7(){
        add(panel);
        setTitle("");
        setSize(400,600);

        String s = "Bugün hava yağmurlu. \n\n\n Ders online olarak işleniyordu.";  // \n = aşağa satıra geçer
        textArea1.setText(s);
    }
}
