package com.example.cinema_back_end.dtos;

import lombok.Data;

@Data
public class TicketDTO {
    private int id;
    private ScheduleDTO schedule;
    private SeatDTO seat;
    private BillDTO bill;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public ScheduleDTO getSchedule() {
		return schedule;
	}
	public void setSchedule(ScheduleDTO schedule) {
		this.schedule = schedule;
	}
	public SeatDTO getSeat() {
		return seat;
	}
	public void setSeat(SeatDTO seat) {
		this.seat = seat;
	}
	public BillDTO getBill() {
		return bill;
	}
	public void setBill(BillDTO bill) {
		this.bill = bill;
	}
}
