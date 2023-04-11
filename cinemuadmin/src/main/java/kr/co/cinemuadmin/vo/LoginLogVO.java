package kr.co.cinemuadmin.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/*
 * NUM	NUMBER
IDN	VARCHAR2(30 BYTE)
REIP	VARCHAR2(30 BYTE)
UAGENT	VARCHAR2(150 BYTE)
STATUS	VARCHAR2(10 BYTE)
SSTIME	DATE
 * */
@Alias("logvo")
@Data
public class LoginLogVO {
private String idn, reip, uagent,status,date;
private int number;
}
