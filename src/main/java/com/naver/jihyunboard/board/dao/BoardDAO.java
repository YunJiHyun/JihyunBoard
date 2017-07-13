package com.naver.jihyunboard.board.dao;

import java.util.List;

import com.naver.jihyunboard.board.dto.BoardDTO;

public interface BoardDAO {
	public List<BoardDTO> listAll() throws Exception;
	public int insertBoard(BoardDTO dto) throws Exception;
	public BoardDTO viewBoard(String content) throws Exception;
}