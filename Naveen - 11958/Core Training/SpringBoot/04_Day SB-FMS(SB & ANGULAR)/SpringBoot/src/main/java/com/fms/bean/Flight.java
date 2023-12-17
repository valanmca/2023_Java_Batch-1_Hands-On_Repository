package com.fms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_fms")
public class Flight {
	
	@Id
	@Column(name = "flightno")
	private String flightno;
	
	@Column(name = "flighttype")
	private String flighttype;
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "economyseatcount")
	private int economyseatcount;
	
	@Column(name = "businessseatcount")
	private int businessseatcount;
	
	@Column(name = "economyfare")
	private int economyfare;
	
	@Column(name = "businessfare")
	private int businessfare;

	public Flight(String flightno, String flighttype, String source, String destination, int economyseatcount,
			int businessseatcount, int economyfare, int businessfare) {
		super();
		this.flightno = flightno;
		this.flighttype = flighttype;
		this.source = source;
		this.destination = destination;
		this.economyseatcount = economyseatcount;
		this.businessseatcount = businessseatcount;
		this.economyfare = economyfare;
		this.businessfare = businessfare;
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFlightno() {
		return flightno;
	}

	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}

	public String getFlighttype() {
		return flighttype;
	}

	public void setFlighttype(String flighttype) {
		this.flighttype = flighttype;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getEconomyseatcount() {
		return economyseatcount;
	}

	public void setEconomyseatcount(int economyseatcount) {
		this.economyseatcount = economyseatcount;
	}

	public int getBusinessseatcount() {
		return businessseatcount;
	}

	public void setBusinessseatcount(int businessseatcount) {
		this.businessseatcount = businessseatcount;
	}

	public int getEconomyfare() {
		return economyfare;
	}

	public void setEconomyfare(int economyfare) {
		this.economyfare = economyfare;
	}

	public int getBusinessfare() {
		return businessfare;
	}

	public void setBusinessfare(int businessfare) {
		this.businessfare = businessfare;
	}

	@Override
	public String toString() {
		return "Flight [flightno=" + flightno + ", flighttype=" + flighttype + ", source=" + source + ", destination="
				+ destination + ", economyseatcount=" + economyseatcount + ", businessseatcount=" + businessseatcount
				+ ", economyfare=" + economyfare + ", businessfare=" + businessfare + "]";
	}

}
