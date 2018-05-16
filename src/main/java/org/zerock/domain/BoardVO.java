package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	
	private int bno, newIcon;
	private String title,content,writer;
	private Date regdate,updatedate;
	


}
