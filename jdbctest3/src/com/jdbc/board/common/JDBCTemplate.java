package com.jdbc.board.common;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCTemplate {

	
	public static void commir (Connection conn) {
		try {
			if(conn!=null && !conn.isClosed()) conn.commit();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rillback(Connection conn)
}
