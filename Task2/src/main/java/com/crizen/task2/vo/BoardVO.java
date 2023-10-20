package com.crizen.task2.vo;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	private int seq_counsel;
	private String counsel_writer;
	private String counsel_subject;
	private String counsel_content;
	private Timestamp counsel_date;
}
