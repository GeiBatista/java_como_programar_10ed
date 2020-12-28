package estudo.cap24.conexaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ConexaoSimples {

	public static void main(String[] args) {

		final String DATABASE_URL = "jdbc:mysql://localhost:3306/books?useTimezone=true&serverTimezone=UTC";
		final String SELECT_QUERY = "SELECT authorID, firstName, lastName FROM authors"; 
		
		try (Connection connection = DriverManager.getConnection(DATABASE_URL, "root", "");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(SELECT_QUERY))
		{
			System.err.println("Banco conectado");
			 ResultSetMetaData metaData = resultSet.getMetaData();
	         int numberOfColumns = metaData.getColumnCount();    
			
			while(resultSet.next()) {
				for (int i = 1; i <= numberOfColumns; i++)
		               System.out.printf("%-8s\t", resultSet.getObject(i));
		            System.out.println();
			}
			
		} catch (Exception e) {
			System.err.println("Banco não conectado %n" + e.getMessage());
		}
		
	}

}
