package hafta01;

import javax.swing.*;

public class baslat {
    public static void main(String[] args) {  //form1 çalıştırmak için main method oluşturduk
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form1 f1 = new form1();  //bu tanımlamayı yaptığmız anda form1 constructor methodu tanımlanacak ve çalışacak
                f1.setVisible(true); //oluşturulan formun ekranda gözükmesini sağlıyor
            }
        });

    }
}
