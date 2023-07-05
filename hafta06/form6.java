package hafta06;

import javax.swing.*;

public class form6 extends JFrame{
    private JPanel panel;
    private JList list1;

    DefaultListModel<String> liste_model = new DefaultListModel<>();

    form6(){
        add(panel);
        setTitle("Liste");
        setSize(600,400);
        liste_model.add(0,"Elma");
        liste_model.add(0,"Armut");
        list1.setModel(liste_model);
    }
}
