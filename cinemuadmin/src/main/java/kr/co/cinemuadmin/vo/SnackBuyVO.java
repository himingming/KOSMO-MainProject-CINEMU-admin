package kr.co.cinemuadmin.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("svo")
@Data
public class SnackBuyVO {
	private String lid,popname;
	private int poppay,snacksaram;

}
