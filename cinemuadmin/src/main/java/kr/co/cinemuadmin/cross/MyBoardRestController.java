package kr.co.cinemuadmin.cross;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import kr.co.cinemuadmin.service.MyBoardService;
import kr.co.cinemuadmin.vo.BoardVO;



@RestController
public class MyBoardRestController {
	@Autowired
	private MyBoardService service;

	@RequestMapping(value = "/myboardList", produces = "application/json;charset=euc-kr")
	public String myBoardList(Model m) {
		System.out.println("myboardList 메서드 실행");
		List<BoardVO> list = service.listBoard();
		List<Map<String, String>> jlist = new ArrayList<>();
		for (BoardVO e : list) {
			Map<String, String> map = new HashMap<>();
			map.put("no", String.valueOf(e.getNo()));
			map.put("subject", e.getSubject());
			map.put("writer", e.getWriter());
			map.put("regdate", e.getRegdate());
			jlist.add(map);
		}
		String result = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.writeValueAsString(jlist);
		} catch (JsonProcessingException e1) {
			e1.printStackTrace();
		}
		return result;
	}
}