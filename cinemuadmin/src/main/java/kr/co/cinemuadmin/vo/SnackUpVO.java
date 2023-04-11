package kr.co.cinemuadmin.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("snackupvo")
@Data
public class SnackUpVO {
private String popimg, popname,usedate,country,snackdetail;
private int popno, poppay;
}
