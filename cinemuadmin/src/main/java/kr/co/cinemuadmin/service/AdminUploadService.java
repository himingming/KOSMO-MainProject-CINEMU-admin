package kr.co.cinemuadmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cinemuadmin.dao.AdminUploadDao;
import kr.co.cinemuadmin.vo.MovieUpVO;
import kr.co.cinemuadmin.vo.SnackUpVO;

@Service
public class AdminUploadService {
	@Autowired
	private AdminUploadDao adminUploadDao;
	
	public void snackUp(SnackUpVO svo) {
	adminUploadDao.snackUp(svo);
	}
	
	public void movieUp(MovieUpVO mvo) {
	adminUploadDao.movieUp(mvo);
	}
	
}
