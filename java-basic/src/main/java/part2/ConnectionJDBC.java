package part2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBC {

    public static void main(String[] args) {
        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";
        
        try  (Connection comm = DriverManager.getConnection(urlConnection, "root", "a1234567")) {
            System.out.println("Conexão com SUCESSO");
        } catch (Exception e) {
            System.out.println("Falha na conexão do Banco!!");
        }
    }
}