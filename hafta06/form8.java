package hafta06;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form8 extends JFrame{
    private JPanel panel;
    private JTable table1;
    private JTable table2;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JButton button1;
    private JTable table3;

    DefaultTableModel mode1 = new DefaultTableModel();
    DefaultTableModel mode2 = new DefaultTableModel();
    DefaultTableModel mode3 = new DefaultTableModel();

    form8(){
        add(panel);
        setTitle("Matris Üret");
        setSize(900,400);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mode1.setRowCount(0);
                mode1.setColumnCount(0);
                mode2.setRowCount(0);
                mode2.setColumnCount(0);
                mode3.setRowCount(0);
                mode3.setColumnCount(0);
                int r,c;
                r = (int) spinner1.getValue();
                c = (int) spinner2.getValue();
                mode1.setRowCount(r);
                mode1.setColumnCount(c);
                mode2.setRowCount(r);
                mode2.setColumnCount(c);
                mode3.setRowCount(r);
                mode3.setColumnCount(c);


                int[][] m1 = matris.matrisUret(r,c);
                int[][] m2 = matris.matrisUret(r,c);

                table1.setModel(mode1);
                table1.setTableHeader(null);
                table2.setModel(mode2);
                table2.setTableHeader(null);
                table3.setModel(mode3);
                table3.setTableHeader(null);
                int toplam = 0;
                for(int i=0; i<r; i++){
                    for(int j=0; j<c; j++){
                        table1.setValueAt(m1[i][j],i,j);
                        table2.setValueAt(m2[i][j],i,j);
                        toplam = m1[i][j] + m2[i][j];
                        table3.setValueAt(toplam, i,j);
                    }
                }
            }
        });
    }
}
