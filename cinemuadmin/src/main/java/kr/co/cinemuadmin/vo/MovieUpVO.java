package kr.co.cinemuadmin.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("movieupvo")
@Data
public class MovieUpVO {
	private String mimg,mname,mtype,mtime,mstartday,mdirec,mstory,mactor,mendday,mmain;
	private int mno,msaram,mage;
}
