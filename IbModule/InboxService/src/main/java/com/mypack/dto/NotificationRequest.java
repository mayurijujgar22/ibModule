package com.mypack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequest {

	public NotificationRequest(Long doctorId, String scheduleDate, String scheduleTime, Long patientId) {
		super();
		this.doctorId = doctorId;
		this.scheduleDate = scheduleDate;
		this.scheduleTime = scheduleTime;
		this.patientId = patientId;
	}
	private Long doctorId;
	private String scheduleDate;
	private String scheduleTime;
	private Long patientId;
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	public String getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public String getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	
}
