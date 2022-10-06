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
@Table(name = "notes_tb")
public class Notes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String notes;
	private String fromEmployeeId;
	private Long fromId;
	private String toEmployeeId;
	private Long toId;
	private boolean isReply;
	private String reply;
	@Column(updatable = false)
	private Date createdDate = new Date();
	private Date updatedDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getFromEmployeeId() {
		return fromEmployeeId;
	}
	public void setFromEmployeeId(String fromEmployeeId) {
		this.fromEmployeeId = fromEmployeeId;
	}
	public Long getFromId() {
		return fromId;
	}
	public void setFromId(Long fromId) {
		this.fromId = fromId;
	}
	public String getToEmployeeId() {
		return toEmployeeId;
	}
	public void setToEmployeeId(String toEmployeeId) {
		this.toEmployeeId = toEmployeeId;
	}
	public Long getToId() {
		return toId;
	}
	public void setToId(Long toId) {
		this.toId = toId;
	}
	public boolean isReply() {
		return isReply;
	}
	public void setReply(boolean isReply) {
		this.isReply = isReply;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
