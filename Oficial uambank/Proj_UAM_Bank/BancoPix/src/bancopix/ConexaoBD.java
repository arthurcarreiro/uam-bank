package bancopix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static final String URL = "jdbc:mysql://localhost:3306/uam_bank";
    private static final String USUARIO = "root"; // seu usuário do MySQL
    private static final String SENHA = "root"; // sua senha do MySQL

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
