package estudo.cap24.tabela;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.AbstractTableModel;

public class ResultSetTableModelEstudo extends AbstractTableModel{

	private final Connection connection;
	private final Statement statement;
	private ResultSet resultSet;
	private ResultSetMetaData metaData;
	private int numberOfRows;
	
	private boolean connectToDatabase = false;
	
	
	
	public ResultSetTableModelEstudo(String url, String username,
		      String password, String query) throws SQLException
	{
		// connect to database
	      connection = DriverManager.getConnection(url, username, password);

	      // create Statement to query database
	      statement = connection.createStatement(
	         ResultSet.TYPE_SCROLL_INSENSITIVE,
	         ResultSet.CONCUR_READ_ONLY);

	      // update database connection status
	      connectedToDatabase = true;

	      // set query and execute it
	      setQuery(query);
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
