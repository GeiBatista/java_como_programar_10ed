package estudo.cap24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoDB {

	public static void main(String[] args) {

		final String DATABASE_URL = "jdbc:mysql://localhost:3306/books?serverTimezone=UTC";
		final String SELECT_QUERY = 
				"SELECT * FROM authors";
		
		try (Connection connection = DriverManager.getConnection(DATABASE_URL, "root", "");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
				){	
			
			   	ResultSetMetaData metaData = resultSet.getMetaData();
			   	int NumeroColunas = metaData.getColumnCount();
			   	
			   	System.out.printf("Tabela Autores do Banco de Dados \"books\"%n%n");
			   	
			   	for (int i = 1; i <= NumeroColunas; i++)					
					System.out.printf("%-8s\t",metaData.getColumnName(i));
			   		System.out.println();
				
			   		while(resultSet.next()) {
			   			for (int i = 1; i <=NumeroColunas; i++) 
			   				System.out.printf("%-8s\t",resultSet.getObject(i));
					   		System.out.println();
						
			   		}
			   	
			
		} catch (SQLException e) {
			System.out.println("N�o conectado " + e.getMessage());
		}
		
		
	}

}
