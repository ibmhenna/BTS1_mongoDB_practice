package com.ibm.bts_practice.service.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class Bug1 {
	@Id
	private String id;
	@NotBlank
	@NotNull
	private String type;
	@NotBlank
	@NotNull
	private String status;
	@NotBlank
	@NotNull
	private String severity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		int count = 0;
		String[] arr = { "compile time", "syntax", "run time", "logical", "arithmetic" };
		for (int i = 0; i < arr.length; i++) {
			if (status.equals(arr[i])) {
				count++;
			}
		}
		if (count == 0) {
			throw new IllegalArgumentException("Invalid Type");
		}
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		int count = 0;
		String[] arr = { "New", "Assigned", "Open", "Reopen", "Closed", "Verified", "Fixed", "PendingRequest",
				"Retest" };
		for (int i = 0; i < arr.length; i++) {
			if (status.equals(arr[i])) {
				count++;
			}
		}
		if (count == 0) {
			throw new IllegalArgumentException("Invalid Status");
		}
		this.status = status;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		int count = 0;
		String[] arr = { "mild", "low", "severe" };
		for (int i = 0; i < arr.length; i++) {
			if (status.equals(arr[i])) {
				count++;
			}
		}
		if (count == 0) {
			throw new IllegalArgumentException("Invalid Status");
		}
		this.severity = severity;
	}

}
