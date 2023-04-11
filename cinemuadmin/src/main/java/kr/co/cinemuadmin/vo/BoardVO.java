package kr.co.cinemuadmin.vo;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("bvo")
public class BoardVO {
	// NO,WRITER,SUBJECT,CONTENT,REIP,REGDATE
	private int no;
	private String writer;
	private String subject;
	private String content;
	private String reip;
	private String regdate;
}
