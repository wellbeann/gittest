package com.jdbc.board.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BoardDao {

	
	
	public List<BoardComment> selectBoardComment(Connection conn, int )
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	List<BoardComment> comments = new ArrayList();
	String sql = this.sql.getProperty("selectBoardCommentByBoardNo");
	try {
		pstmt= conn.prepareStatement(sql);
		pstmt.setInt(1,  boardNo));
		rs= pstmt
	}
	
	
	
	
	
	private BoardComment getComment(ResultSet rs) thows SQLException
}
