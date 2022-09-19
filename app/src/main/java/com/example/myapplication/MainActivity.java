package com.example.myapplication;

import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionHelper {
    String userName, userPassword, ip, port, dataBase;

    public Connection connectionClass() {
        ip = "ngknn.ru";
        dataBase = "TestForSQL";
        userName = "33П";
        userPassword = "12357";
        port = "1433";
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String connectionURL = null;
        try {
            Class.forName("ne.sourceforge.jtds.jdbc.Drifer");
            connectionURL = "jdbc:jtds:sqlserver://" + ip + ";" + "datebasename=" + dataBase + ";user=" + userName + ";password=" + userPassword + ";";
            connection = DriverManager.getConnection(connectionURL);
        } catch (Exception ex) {
            Log.e("Error", ex.getMessage());
        }
        return Сonnection;
    }
}