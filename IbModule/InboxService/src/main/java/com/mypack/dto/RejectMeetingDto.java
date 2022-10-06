package com.mypack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RejectMeetingDto {

	
	private Long notificationId;
	private String reasonForReject;
	
	public Long getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}
	public String getReasonForReject() {
		return reasonForReject;
	}
	public void setReasonForReject(String reasonForReject) {
		this.reasonForReject = reasonForReject;
	}
	
	public RejectMeetingDto(Long notificationId, String reasonForReject) {
		super();
		this.notificationId = notificationId;
		this.reasonForReject = reasonForReject;
	}
}
