package com.mypack.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientNotificationResponse {

	public PatientNotificationResponse(Long id, String notification, boolean isRead, Long doctorId, String doctorName,
			String scheduleDate, String scheduleTime, Long patientId, String patientName, Date createdDate) {
		super();
		this.id = id;
		this.notification = notification;
		this.isRead = isRead;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.scheduleDate = scheduleDate;
		this.scheduleTime = scheduleTime;
		this.patientId = patientId;
		this.patientName = patientName;
		this.createdDate = createdDate;
	}
	public PatientNotificationResponse() {
		// TODO Auto-generated constructor stub
	}
	private Long id;
	private String notification;
	private boolean isRead;
	private Long doctorId;
	private String doctorName;
	private String scheduleDate;
	private String scheduleTime;
	private Long patientId;
	private String patientName;
	private Date createdDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNotification() {
		return notification;
	}
	public void setNotification(String notification) {
		this.notification = notification;
	}
	public boolean isRead() {
		return isRead;
	}
	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
