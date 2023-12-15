package com.dsrc.airline.bean;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "airlinerest") 
  public class Airline {
	@Id
	@Column(name = "flightno")
	    private String flightno; 
	  
	@Column(name = "flighttype")
	    private String flighttype; 
	  
	@Column(name = "source") 
	    private String source; 
	  
	@Column(name = "destination") 
    private String destination;
	
	@Column(name = "economyseatscount") 
	    private int economyseatscount; 
	  
	@Column(name = "businessseatscount") 
	    private int businessseatscount; 
	  
	@Column(name = "economyfare") 
	    private int economyfare; 
	  
	@Column(name = "businessfare") 
	    private int businessfare;

		public Airline(String flightno, String flighttype, String source, String destination, int economyseatscount,
				int businessseatscount, int economyfare, int businessfare) {
			super();
			this.flightno = flightno;
			this.flighttype = flighttype;
			this.source = source;
			this.destination = destination;
			this.economyseatscount = economyseatscount;
			this.businessseatscount = businessseatscount;
			this.economyfare = economyfare;
			this.businessfare = businessfare;
		}

		public Airline() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
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

		public int getEconomyseatscount() {
			return economyseatscount;
		}

		public void setEconomyseatscount(int economyseatscount) {
			this.economyseatscount = economyseatscount;
		}

		public int getBusinessseatscount() {
			return businessseatscount;
		}

		public void setBusinessseatscount(int businessseatscount) {
			this.businessseatscount = businessseatscount;
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
			return "Airline [flightno=" + flightno + ", flighttype=" + flighttype + ", source=" + source
					+ ", destination=" + destination + ", economyseatscount=" + economyseatscount
					+ ", businessseatscount=" + businessseatscount + ", economyfare=" + economyfare + ", businessfare="
					+ businessfare + "]";
		}

		
	    
	}
