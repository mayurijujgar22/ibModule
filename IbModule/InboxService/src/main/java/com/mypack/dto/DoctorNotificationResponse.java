package com.mypack.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorNotificationResponse {

	
	private Long notificationId;
	private String notification;
	private String reasonForReject;
	private boolean isAccept;
	private Long doctorId;
	private String doctorName;
	private String scheduleDate;
	private String scheduleTime;
	private Long patientId;
	private String patientName;
	private Date createdDate;
	
	public DoctorNotificationResponse(Long notificationId, String notification, String reasonForReject,
			boolean isAccept, Long doctorId, String doctorName, String scheduleDate, String scheduleTime,
			Long patientId, String patientName, Date createdDate) {
		super();
		this.notificationId = notificationId;
		this.notification = notification;
		this.reasonForReject = reasonForReject;
		this.isAccept = isAccept;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.scheduleDate = scheduleDate;
		this.scheduleTime = scheduleTime;
		this.patientId = patientId;
		this.patientName = patientName;
		this.createdDate = createdDate;
	}
	
	public DoctorNotificationResponse() {
		// TODO Auto-generated constructor stub
	}

	public Long getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}
	public String getNotification() {
		return notification;
	}
	public void setNotification(String notification) {
		this.notification = notification;
	}
	public String getReasonForReject() {
		return reasonForReject;
	}
	public void setReasonForReject(String reasonForReject) {
		this.reasonForReject = reasonForReject;
	}
	public boolean isAccept() {
		return isAccept;
	}
	public void setAccept(boolean isAccept) {
		this.isAccept = isAccept;
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
