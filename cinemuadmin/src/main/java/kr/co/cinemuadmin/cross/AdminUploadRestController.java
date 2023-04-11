package kr.co.cinemuadmin.cross;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.cinemuadmin.service.AdminUploadService;
import kr.co.cinemuadmin.vo.MovieUpVO;
import kr.co.cinemuadmin.vo.SnackUpVO;

@RestController
public class AdminUploadRestController {
	@Autowired
	private AdminUploadService adminUploadService;
	
	@RequestMapping(value = "snackupload", produces = "application/json;charset=euc-kr")
	public void snackUp(@RequestBody SnackUpVO svo) {
		System.out.println("=============================");
		System.out.println("poppay=>"+svo.getPoppay());
		System.out.println("popname=>"+svo.getPopname());
		System.out.println("popimg"+svo.getPopimg());
		adminUploadService.snackUp(svo);
	}
	
	@RequestMapping(value = "movieupload", produces = "application/json;charset=euc-kr")
	public void movieUp(@RequestBody MovieUpVO mvo) {
		System.out.println("=================================");
		System.out.println("mname=>"+mvo.getMname());
		adminUploadService.movieUp(mvo);
	}
	
}
