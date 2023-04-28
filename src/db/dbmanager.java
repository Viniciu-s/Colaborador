package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbmanager {
    public static Connection obterConexao() {
        try {
            // Define o Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Interface JDBC cuja implementação DriveManager abre uma
            // Conexão com a URL definida para acesso ao banco
            Connection conexao = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system",
                    "vncs");

            return conexao;

        } catch (SQLException e) {
            System.err.println("Não foi possivel se conectar");
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            System.err.println("O driver JDBC não foi encontrado");
            e.printStackTrace();
            return null;
        }
    }
}
