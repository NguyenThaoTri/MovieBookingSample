package com.example.cinema_back_end.dtos;

import lombok.Data;

import java.util.List;

@Data
public class BookingRequestDTO {
    private Integer userId;
    private Integer scheduleId;
    private double price;
    private List<Integer> listSeatIds;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}
	public List<Integer> getListSeatIds() {
		return listSeatIds;
	}
	public void setListSeatIds(List<Integer> listSeatIds) {
		this.listSeatIds = listSeatIds;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
