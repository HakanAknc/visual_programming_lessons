package hafta08;

import java.sql.*;

public class veritabani {
    static String url = "jdbc:postgresql://localhost:5432/normalveritabani";
    static Connection conn = null;

    static void baglan(){
        try {
            conn = DriverManager.getConnection(url,"postgres","");
            System.out.println("Veritabanı bağlantısı başarılı");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    static ResultSet listele(String sorgu){
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sorgu);
            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
