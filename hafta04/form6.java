package hafta04;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class form6 extends JFrame{
    private JPanel panel;
    private JCheckBox pythonCheckBox;
    private JCheckBox javaCheckBox;
    private JCheckBox cCheckBox;
    private JCheckBox PHPCheckBox;
    private JCheckBox swiftCheckBox;
    private JCheckBox goCheckBox;
    private JCheckBox cCheckBox1;
    private JCheckBox kotlinCheckBox;
    private JRadioButton HTMLRadioButton;
    private JRadioButton CSSRadioButton;
    private JRadioButton aspNetRadioButton;
    private JRadioButton javaScriptRadioButton;

    form6(){
        add(panel);
        setTitle("CheckBox ve RadioButton");
        setSize(600,600);

        ButtonGroup bg = new ButtonGroup();
        bg.add(HTMLRadioButton);
        bg.add(CSSRadioButton);
        bg.add(aspNetRadioButton);
        bg.add(javaScriptRadioButton);

        pythonCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(pythonCheckBox.isSelected()) System.out.println("Python seçildi :) ");   //true veya false değeri döndürür
                else System.out.println("Python seçimi iptal edildi :( ");
            }
        });
    }
}
