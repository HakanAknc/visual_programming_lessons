package hafta03;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class form3 extends JFrame {
    private JPanel panel;
    private JComboBox comboBox1;
    private JLabel lbl1;
    private JLabel lbl2;

    form3(){
        add(panel);
        setTitle("ComboBox");
        setSize(600,400);


        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) { //bir nesne seçildiği zaman çalışacak ivent
                int secilen = (int) comboBox1.getSelectedIndex();
                lbl1.setText(Integer.toString(secilen));

                lbl2.setText(comboBox1.getSelectedItem().toString());

                if((int)comboBox1.getSelectedIndex()==0)
                {
                    System.out.println("Elma seçildi");
                }

                if(comboBox1.getSelectedItem().toString().equals("armut"))  //equals = karşılaştırma
                {
                    System.out.println("Armut seçldi");
                }
            }
        });
    }
}
