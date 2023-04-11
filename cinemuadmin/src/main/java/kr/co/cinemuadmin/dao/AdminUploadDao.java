package kr.co.cinemuadmin.dao;

import kr.co.cinemuadmin.vo.MovieUpVO;
import kr.co.cinemuadmin.vo.SnackUpVO;

public interface AdminUploadDao {
public void snackUp(SnackUpVO svo);
public void movieUp(MovieUpVO mvo);
}
