package com.wdsoft.delivery.domain;
// Generated 16 mai 2016 00:36:34 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cmscustomer generated by hbm2java
 */
@Entity
@Table(name = "cmscustomer")
public class Cmscustomer implements java.io.Serializable {

	private Integer cusId;
	private String cusFname;
	private String cusLname;
	private String cusCname;
	private int adrId;

	public Cmscustomer() {
	}

	public Cmscustomer(String cusFname, String cusLname, String cusCname, int adrId) {
		this.cusFname = cusFname;
		this.cusLname = cusLname;
		this.cusCname = cusCname;
		this.adrId = adrId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "cus_id", unique = true, nullable = false)
	public Integer getCusId() {
		return this.cusId;
	}

	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}

	@Column(name = "cus_fname", nullable = false, length = 45)
	public String getCusFname() {
		return this.cusFname;
	}

	public void setCusFname(String cusFname) {
		this.cusFname = cusFname;
	}

	@Column(name = "cus_lname", nullable = false, length = 45)
	public String getCusLname() {
		return this.cusLname;
	}

	public void setCusLname(String cusLname) {
		this.cusLname = cusLname;
	}

	@Column(name = "cus_cname", nullable = false, length = 90)
	public String getCusCname() {
		return this.cusCname;
	}

	public void setCusCname(String cusCname) {
		this.cusCname = cusCname;
	}

	@Column(name = "adr_id", nullable = false)
	public int getAdrId() {
		return this.adrId;
	}

	public void setAdrId(int adrId) {
		this.adrId = adrId;
	}

}
