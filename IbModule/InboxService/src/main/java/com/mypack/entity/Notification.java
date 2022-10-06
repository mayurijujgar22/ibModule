package com.mypack.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "notification_tb")
public class Notification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String notification;
	
	private boolean isAccept;
	private Long doctorId;
	private Long nurseId;
	private String reasonForReject;
	private Long patientId;
	@Column(updatable = false)
	private Date createdDate = new Date();
	private Date updateDate;
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
	public Long getNurseId() {
		return nurseId;
	}
	public void setNurseId(Long nurseId) {
		this.nurseId = nurseId;
	}
	public String getReasonForReject() {
		return reasonForReject;
	}
	public void setReasonForReject(String reasonForReject) {
		this.reasonForReject = reasonForReject;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
