package kr.co.cinemuadmin.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("membervo")
@Data
public class MemberVO {
   private String lid,lpwd,lphone,lgender,lname,laddr,lemail,limg,lclass,lbirth,ldate;
   private int lno,lmileage;

}