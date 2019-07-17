package com.vehicle.entities;

import java.io.Serializable;

public class VehiclePK implements Serializable{

	private int vehicleId;
	private int ownerId;
	
	
	public VehiclePK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	
	
}
