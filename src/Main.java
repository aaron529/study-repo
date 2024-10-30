import java.sql.*;

class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://bycjkmy6kckotma9b5zf-mysql.services.clever-cloud.com/bycjkmy6kckotma9b5zf", "uugep1b32szf7jcb", "X9jKx53jVO38mauD5Bus");

        PreparedStatement ps = con.prepareStatement("SELECT * FROM emp;");
        // ps.executeUpdate();
        ResultSet res = ps.executeQuery();
        int code;
        while (res.next()) {
            code = res.getInt("eid");
            System.out.println("EID : " + code);
        }
        ps.close();
        con.close();
    }
}