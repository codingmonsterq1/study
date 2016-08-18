package com.study.board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class BoardDAO {

	
	//query밑에 지정한 xml파일명과 일치.
	@Autowired
	private SqlSession sqlSession;
	private String namespace = "BoardMapper.";
	
	public int wirte(BoardDTO boardDTO) throws Exception{
		
		return sqlSession.insert(namespace+"write", boardDTO);
	}
}
	
	

