package kr.co.cinemuadmin.vo;

import java.security.Timestamp;

import org.apache.ibatis.type.Alias;

import lombok.Data;
import oracle.sql.TIMESTAMP;

/*
 * MBNO	NUMBER
LID	VARCHAR2(30 BYTE)
MBSARAM	NUMBER
MBDATE	DATE
MBPAY	NUMBER
MNO	NUMBER
BUY_TIME	TIMESTAMP(6)
BOOKING_NO	VARCHAR2(10 BYTE)
THEATER_ID	NUMBER
SCREENING_ID	NUMBER
 * 
 * 
 * */

@Alias("mbbuy")
@Data
public class MoiveBuyVO {
	private String lid,mbdate,booking_no;
	private int mbsaram, mbpay,mno,theater_id,screening_id;
}
