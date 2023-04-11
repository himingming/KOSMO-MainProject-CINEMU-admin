package kr.co.cinemuadmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cinemuadmin.dao.MyBoardDao;
import kr.co.cinemuadmin.vo.BoardVO;



@Service
public class MyBoardService {

	@Autowired
	private MyBoardDao myBoardDao;
	

	
	public List<BoardVO> listBoard(){
		return myBoardDao.listBoard();
	}
	
}