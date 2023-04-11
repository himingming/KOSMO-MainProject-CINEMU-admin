package kr.co.cinemuadmin.cross;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.cinemuadmin.service.MainrService;

@RestController
public class MainRestController {

	@Autowired
	private MainrService mainService;
	
	@RequestMapping(value = "inMemberCount", produces = "application/json;charset=euc-kr")
	public String inMemberCount() {
	String login = "login";
	int memCount = mainService.inMemberCount(login);
	System.out.println("memCount=>"+memCount);
	return Integer.toString(memCount);
	}
	
	@RequestMapping(value = "addMemberCount", produces = "application/json;charset=euc-kr")
	public String addMemberCount() {
		int memCount = mainService.addMemberCount();
		System.out.println("memCount=>"+memCount);
		return Integer.toString(memCount);
	}
	
	
	@RequestMapping(value = "moviesale", produces = "application/json;charset=euc-kr")
	public String moviesale() {
	 
	
		return mainService.moviesale();
	}
	
	@RequestMapping(value = "snacksale", produces = "application/json;charset=euc-kr")
	public String snackSale() {
	 
	return mainService.snacksale();
	}
 	
}
