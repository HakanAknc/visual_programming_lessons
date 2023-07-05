package hafta01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class form1 extends JFrame {    //miras alınır form için constructor method
    private JPanel panel;
    private JButton btn1;

    form1(){   //constructor method
        add(panel);   //kod ve tasarımın isimleri aynı olur yani panelin değişken ismi verilir tasarımda
        setTitle("İlk form uygulamamız");   //forma isim verilir pencere başlığı
        setSize(600,400);   //pencerenin boyutu ayarlanır
        Random r = new Random();

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //btn1.setText("ONAY");
                int sayi = r.nextInt(100);
                btn1.setText(Integer.toString(sayi));
            }
        });
    }
}
