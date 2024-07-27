package com.oasis.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="Railway_customer")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pnr_id")
	private int pnrid;
	private String name;
	@Column(name = "password")
	private String psw;
	@Column(name = "confirm_password")
	private String con_psw;
	@Column(name = "mobile_number")
	private long m_num;
	private String mail;
	private String gender;
	
	@OneToMany(targetEntity = TaskTwo.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name = "pnr_id",referencedColumnName = "pnr_id")
	private List<TaskTwo> tasktwo;
	public Department() {
		super();
	}
	public int getPnrid() {
		return pnrid;
	}
	public void setPnrid(int pnrid) {
		this.pnrid = pnrid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getCon_psw() {
		return con_psw;
	}
	public void setCon_psw(String con_psw) {
		this.con_psw = con_psw;
	}
	public long getM_num() {
		return m_num;
	}
	public void setM_num(long m_num) {
		this.m_num = m_num;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<TaskTwo> getTasktwo() {
		return tasktwo;
	}
	public void setTasktwo(List<TaskTwo> tasktwo) {
		this.tasktwo = tasktwo;
	}
	public Department(int pnrid, String name, String psw, String con_psw, long m_num, String mail, String gender,
			List<TaskTwo> tasktwo) {
		super();
		this.pnrid = pnrid;
		this.name = name;
		this.psw = psw;
		this.con_psw = con_psw;
		this.m_num = m_num;
		this.mail = mail;
		this.gender = gender;
		this.tasktwo = tasktwo;
	}
	
	
}
