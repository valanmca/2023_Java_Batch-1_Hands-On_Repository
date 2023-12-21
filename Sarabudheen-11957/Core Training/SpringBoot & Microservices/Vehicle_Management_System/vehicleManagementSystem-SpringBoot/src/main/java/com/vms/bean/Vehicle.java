package com.vms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vehicle")
public class Vehicle {
	
	@Id
	@Column(name = "Vehicle_Id")
	private int vehicleId;
	
	@Column(name = "Vehicle_Type")
	private String vehicleType;
	
	@Column(name = "vehicle_Name")
	private String vehicleName;
	
	@Column(name = "Vehicle_Number")
	private String vehicleNumber;
	
	@Column(name = "Owner_Name")
	private String ownerName;

	public Vehicle() {
		super();
	}

	public Vehicle(int vehicleId, String vehicleType, String vehicleName, String vehicleNumber, String ownerName) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.vehicleName = vehicleName;
		this.vehicleNumber = vehicleNumber;
		this.ownerName = ownerName;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + ", vehicleName=" + vehicleName
				+ ", vehicleNumber=" + vehicleNumber + ", ownerName=" + ownerName + "]";
	}
	
	

}
