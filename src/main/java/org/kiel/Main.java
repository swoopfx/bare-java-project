package org.kiel;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        String url = "jdbc:postgresql://localhost:5432/demo"; // jdbc:mysql:demo

        String user = "postgres";

        String  password = "great";

        String query = "SELECT * FROM showss";
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        System.out.println("Connection establised");
        ResultSet resultSql = st.executeQuery(query);
//        boolean next = resultSql.next();
//        String resultST = resultSql.getString("information");
//        System.out.println(resultST);

        while (resultSql.next()){
            System.out.println("ID is:" + resultSql.getInt(1));
            System.out.println("Information is :"+ resultSql.getString(2));
        }
//        System.out.println(resultST);
//        if(resultST){
//            System.out.println(resultSql.next());
//        }else{
//            System.out.println(resultSql.next());
//        }

        con.close();

    }
}