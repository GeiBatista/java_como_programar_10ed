package estudo.consolidacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexaoDB {

	public static void main(String[] args) {

		final String DATABASE_URL = "jdbc:mysql://localhost:3306/books?useTimezone=true&serverTimezone=UTC";
		final String SELECT_QUERY = "SELECT authorID, firstName, lastName FROM authors";
		
		try(Connection connection = DriverManager.getConnection(DATABASE_URL,"root", "");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(SELECT_QUERY))
		{
			System.out.println("Conectado ao Banco com sucesso!");
		} catch (Exception e) {
			System.out.println("Conexão falhou! \n" + e.getMessage());
		}
	}

}
