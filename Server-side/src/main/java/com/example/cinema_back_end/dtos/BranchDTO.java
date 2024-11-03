package com.example.cinema_back_end.dtos;

import java.util.List;

import lombok.Data;

@Data
public class BranchDTO {
    private int id;
    private String imgURL;
    private String name;
    private String diaChi;
    private String phoneNo;
    private List<ScheduleDTO> schedules;
    private List<MovieDTO> movies;
    private Long total;
    private Long totalTicket;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public List<ScheduleDTO> getSchedules() {
		return schedules;
	}
	public void setSchedules(List<ScheduleDTO> schedules) {
		this.schedules = schedules;
	}
	public List<MovieDTO> getMovies() {
		return movies;
	}
	public void setMovies(List<MovieDTO> movies) {
		this.movies = movies;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotalTicket() {
		return totalTicket;
	}
	public void setTotalTicket(Long totalTicket) {
		this.totalTicket = totalTicket;
	}
}
