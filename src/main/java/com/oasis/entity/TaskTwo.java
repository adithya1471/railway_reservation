package com.oasis.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Reservation_Counter")
public class TaskTwo {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pnr_id")
	private Integer pnrid;
	private String train_date;
	private String from;
	private String to;
	private String train_number;
	private String train_name;
	private String class_name;
	
	public TaskTwo() {
		super();
	}

	
	public Integer getPnrid() {
		return pnrid;
	}
	public void setPnrid(Integer pnrid) {
		this.pnrid = pnrid;
	}

	public String getTrain_date() {
		return train_date;
	}

	public void setTrain_date(String train_date) {
		this.train_date = train_date;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrain_number() {
		return train_number;
	}

	public void setTrain_number(String train_number) {
		this.train_number = train_number;
	}

	public String getTrain_name() {
		return train_name;
	}

	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}


	public TaskTwo(Integer pnrid, String train_date, String from, String to, String train_number, String train_name,
			String class_name) {
		super();
		this.pnrid = pnrid;
		this.train_date = train_date;
		this.from = from;
		this.to = to;
		this.train_number = train_number;
		this.train_name = train_name;
		this.class_name = class_name;
	}

	
	
}
