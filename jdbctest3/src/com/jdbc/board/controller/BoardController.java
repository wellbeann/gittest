package com.jdbc.board.controller;

import java.util.List;

import com.jdbc.board.model.dto.Board;
import com.jdbc.board.model.service.BoardService;
import com.jdbc.board.view.Mainview;

public class BoardController {
	
	private BoardService service=new BoardService();
	private Mainview view=new Mainview();
	
	public void mainMenu() {
		view.mainMenu();
	}
	
	public void selectBoardAll() {
		
		List<Board> boards=service.selectBoardAll();
		
		view.printBoard(boards);
	}
	
	
	
}
