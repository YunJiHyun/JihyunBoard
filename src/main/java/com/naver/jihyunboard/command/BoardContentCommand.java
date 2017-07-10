package com.naver.jihyunboard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;


public class BoardContentCommand implements BoardCommand { 

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap(); 
		HttpServletRequest request =(HttpServletRequest)map.get("request"); //casting
		String boardId = request.getParameter("boardId");
	}

}
