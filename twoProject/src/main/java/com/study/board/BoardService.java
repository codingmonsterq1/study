package com.study.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	
	public void write(BoardDTO boardDTO){
		try {
			boardDAO.wirte(boardDTO);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	
}
