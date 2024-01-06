package com.vms.bean;
import java.lang.annotation.Native;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="Vehicle1")
public class Vehicle {
			 @Id
			    @Column(name ="id")
			    private int id ;
			    
			    @Column(name ="vehicleType")
			    private String vehicleType;
			    
			    @Column(name ="vehicleName")
			    private String vehicleName;
			    
			    @Column(name ="VehicleNumber")
			    private int VehicleNumber;
			    
			    @Column(name ="ownerName ")
			    private String ownerName ;

				

				public Vehicle(int id, String vehicleType, String vehicleName, int vehicleNumber, String ownerName) {
					super();
					this.id = id;
					this.vehicleType = vehicleType;
					this.vehicleName = vehicleName;
					VehicleNumber = vehicleNumber;
					this.ownerName = ownerName;
				}

				
				public Vehicle() {
					super();
					// TODO Auto-generated constructor stub
				}


				public int getId() {
					return id;
				}

				public void setId(int id) {
					this.id = id;
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

				public int getVehicleNumber() {
					return VehicleNumber;
				}

				public void setVehicleNumber(int vehicleNumber) {
					VehicleNumber = vehicleNumber;
				}

				public String getOwnerName() {
					return ownerName;
				}

				public void setOwnerName(String ownerName) {
					this.ownerName = ownerName;
				}

				@Override
				public String toString() {
					return "Vehicle [vehicleId=" + id + ", vehicleType=" + vehicleType + ", vehicleName="
							+ vehicleName + ", VehicleNumber=" + VehicleNumber + ", ownerName=" + ownerName + "]";
				}
			    
			   
}
