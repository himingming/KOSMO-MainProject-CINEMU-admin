package kr.co.cinemuadmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cinemuadmin.dao.MemberDao;
import kr.co.cinemuadmin.vo.MemberVO;

@Service
public class MemberService {
   
   @Autowired
   private MemberDao memberDao;
   
   public MemberVO Login(MemberVO mvo) {
      return memberDao.Login(mvo);
   }
   
   
}