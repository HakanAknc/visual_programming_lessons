package hafta05;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class form6 extends JFrame{
    private JPanel panel;
    private JPasswordField passwordField1;
    private JButton button1;
    private JFormattedTextField formattedTextField1;

    form6(){
        add(panel);
        setTitle("Password Formatted Text");
        setSize(600,600);

        try {
            MaskFormatter mf = new MaskFormatter("(05##) LLL UU AA");
            mf.install(formattedTextField1);  //yukardaki özelliği yüklememizi sağlıyor
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        // # : Sadece sayısal veri girmenizi ister
        // L = lower : sadece küçük harf ister
        // U = upper : sadece büyük harf ister
        // A = alpha : sadece sayı ve harf girişi ister



        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char [] ps = passwordField1.getPassword();  //En önemli nokta bu kısım
                button1.setText(ps.toString());
            }
        });
    }
}
