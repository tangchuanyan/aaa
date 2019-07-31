package cn.itcast;//本实例是一个TCP服务器端程序，在getserver()方法中建立服务器套接字，调用getClientMessage()方法获取客户端信息
import java.sql.*;

public class Gradation {
    static Connection con;
    static Statement sql;
    static ResultSet res;
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            con=DriverManager.getConnection("jdbc:mysql:"+"//localhost:3306/test","root","tcy03181030");
            System.out.println("数据库连接成功");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
    public static void main(String[] args){
        Gradation c=new Gradation();
        con=c.getConnection();
        try{
            sql=con.createStatement();
            res=sql.executeQuery("select * from time_zone_name");
            while(res.next()) {
                String id = res.getString("id");
                String name = res.getString("name");
                String sex = res.getString("sex");
                String birthday = res.getString("birthday");
                System.out.println("编号：" + id);
                System.out.println("姓名：" + name);
                System.out.println("性别：" + sex);
                System.out.println("生日：" + birthday);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
