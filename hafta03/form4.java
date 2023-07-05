package hafta03;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class form4 extends JFrame{
    private JComboBox comboBox1;
    private JPanel panel;
    DefaultComboBoxModel model = new DefaultComboBoxModel();  // ???

    form4(){
        add(panel);
        setTitle("Dinamik ComboBox");
        setSize(600,400);

        //model.addElement("İstannbul"); //tek tek eleman ekleme
        //model.addElement("Ankara");
        //model.addElement("Konya");

        /*
        for(int i = 0; i<256; i++){
            model.addElement(Integer.toString(i));
        } */

        ArrayList<String> isimler = new ArrayList<>(Arrays.asList("Ali","Ayşe","Betül","Cihan"));
        model.addAll(isimler);
        comboBox1.setModel(model);
    }
}
