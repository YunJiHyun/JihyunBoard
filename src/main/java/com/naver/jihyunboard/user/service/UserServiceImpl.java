package com.naver.jihyunboard.user.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.jihyunboard.user.dao.UserDAO;
import com.naver.jihyunboard.user.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDao;
	

	
	@Override
	public void registerUser(UserDTO dto) {
		userDao.registerUser(dto);
	}


	@Override
	public boolean loginCheck(UserDTO dto, HttpSession session) {
		
		boolean result = userDao.loginCheck(dto);
		
		if (result) { 
			// true일 경우 세션에 등록
            UserDTO userDto = userInfo(dto); //따로 메소드를 만드는 이유...??
            // 세션 변수 등록
            session.setAttribute("userId", userDto.getUserId());
            session.setAttribute("userName", userDto.getUserName());
        } 
        return result;
		
	}


	@Override
	public UserDTO userInfo(UserDTO dto) {
		return userDao.userInfo(dto);
	}
	

}
