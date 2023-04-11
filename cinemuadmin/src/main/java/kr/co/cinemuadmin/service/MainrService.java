package kr.co.cinemuadmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cinemuadmin.dao.MainrDao;

@Service
public class MainrService {

	@Autowired
	private MainrDao mainDao;
	
	public int inMemberCount(String login) {
	
		return mainDao.inMemberCount(login);
	}
	
	public int addMemberCount() {
		return mainDao.addMemberCount();
	}
	
	
	public String moviesale() {
		return mainDao.moviesale();
	}
	
	public String snacksale() {
		return mainDao.snacksale();
	}
	
	
}
