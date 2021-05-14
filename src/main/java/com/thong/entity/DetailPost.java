package com.thong.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detailpost")
public class DetailPost extends Common  {
	private double acreage;
	private double deposit;
	
	@Column(name = "electricprice")
	private double electricPrice;
	
	@Column(name = "waterprice")
	private double waterPrice;
	private double internet;
	private int tankage;
	
	@Column(name = "privatetoilet")
	private boolean privateToilet;
	
	@Column(name = "packingspace")
	private boolean packingSpace;
	
	private boolean freeTime;
	private boolean fridge;
	private boolean washer;
	
	@Column(name = "airconditioner")
	private boolean airConditioner;

	@OneToOne
	@JoinColumn(name = "post_id")
	private Post post;
	
	public double getAcreage() {
		return acreage;
	}

	public void setAcreage(double acreage) {
		this.acreage = acreage;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getElectricPrice() {
		return electricPrice;
	}

	public void setElectricPrice(double electricPrice) {
		this.electricPrice = electricPrice;
	}

	public double getWaterPrice() {
		return waterPrice;
	}

	public void setWaterPrice(double waterPrice) {
		this.waterPrice = waterPrice;
	}

	public double getInternet() {
		return internet;
	}

	public void setInternet(double internet) {
		this.internet = internet;
	}

	public int getTankage() {
		return tankage;
	}

	public void setTankage(int tankage) {
		this.tankage = tankage;
	}

	public boolean isPrivateToilet() {
		return privateToilet;
	}

	public void setPrivateToilet(boolean privateToilet) {
		this.privateToilet = privateToilet;
	}

	public boolean isPackingSpace() {
		return packingSpace;
	}

	public void setPackingSpace(boolean packingSpace) {
		this.packingSpace = packingSpace;
	}

	public boolean isFreeTime() {
		return freeTime;
	}

	public void setFreeTime(boolean freeTime) {
		this.freeTime = freeTime;
	}

	public boolean isFridge() {
		return fridge;
	}

	public void setFridge(boolean fridge) {
		this.fridge = fridge;
	}

	public boolean isWasher() {
		return washer;
	}

	public void setWasher(boolean washer) {
		this.washer = washer;
	}

	public boolean isAirConditioner() {
		return airConditioner;
	}

	public void setAirConditioner(boolean airConditioner) {
		this.airConditioner = airConditioner;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
	
}
