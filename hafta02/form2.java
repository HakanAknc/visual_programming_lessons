package hafta02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class form2 extends JFrame {
    private JPanel panel;
    private JButton button1;
    private JLabel lbl1;
    private JButton button2;

    form2(){
        add(panel);
        setTitle("Resimli Button");
        setSize(600,400);

        lbl1.setSize(200,90);
        lbl1.setOpaque(true);  //arka planda bişey göster bana <<<<<<<<<<< VİZE SORUSU >>>>>>>>>>>
        Image kirmizi = new ImageIcon(this.getClass().getResource("/bkirmizi.png")).getImage();
        lbl1.setIcon(new ImageIcon(kirmizi));
        Image mavi = new ImageIcon(this.getClass().getResource("/bmavi.png")).getImage();
        Image yesil = new ImageIcon(this.getClass().getResource("/byesil.png")).getImage();
        Image icon1 = new ImageIcon(this.getClass().getResource("/icon1.png")).getImage();
        button2.setIcon(new ImageIcon(icon1));  // icon eklendi

        //Create listener / mouse listener
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button1.setBackground(new Color(0,0,255));
                super.mouseEntered(e);   // mausla button üzerinden geçildiğinde buttona mavi renk verildi
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                button1.setBackground(new Color(255,0,0));
                super.mouseExited(e);   // button ayarlandı ve buttona kırmızı renk verildi
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                button1.setBackground(new Color(0,255,0));
                super.mouseReleased(e);  // buttona basıldığında buttona yeşil renk verildi
            }
        });

        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lbl1.setIcon(new ImageIcon(mavi));
                super.mouseEntered(e);
            }
        });
        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                lbl1.setIcon(new ImageIcon(kirmizi));
                super.mouseExited(e);
            }
        });
        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                lbl1.setIcon(new ImageIcon(yesil));
                super.mouseReleased(e);
            }
        });
    }
}
