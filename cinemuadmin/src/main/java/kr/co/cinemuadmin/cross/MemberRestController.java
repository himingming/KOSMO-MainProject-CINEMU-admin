package kr.co.cinemuadmin.cross;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.cinemuadmin.service.MemberService;
import kr.co.cinemuadmin.vo.MemberVO;

@RestController
public class MemberRestController {
 @Autowired
 private MemberService memberService;
 
 @RequestMapping(value = "/login", produces = "application/json;charset=UTF-8")
 public MemberVO Login( @RequestBody MemberVO vo) {
    MemberVO mvo = memberService.Login(vo);
    
     if (mvo == null) { // mvo가 null인 경우
           mvo = new MemberVO(); // 새로운 MemberVO 객체 생성
           mvo.setLid(""); // lid 속성을 빈 문자열로 설정
       }
     
    
    return mvo;
 }
   
   
}