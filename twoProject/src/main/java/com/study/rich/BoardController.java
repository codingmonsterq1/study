package com.study.rich;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.board.BoardDTO;
import com.study.board.BoardService;



@Controller
@RequestMapping(value= "/board/**")
public class BoardController {

	
	@Inject
	private BoardService boardService;
	
	@RequestMapping(value="/writePage",method = RequestMethod.GET)
	public String write(){
		System.out.println("글쓰기 페이지 진입 성공.");
		return "/board/writePage";
		
	}
	@RequestMapping(value="/writeform",method = RequestMethod.POST)
	public String write(BoardDTO boardDTO){
		boardService.write(boardDTO);
		System.out.println("글쓰기 폼 진입 성공.");
		return "redirect:/";
	}
}
