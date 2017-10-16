package com.iugu.responses;

public class LogResponse {

	private String id;

	private String description;

	private String notes;

	private String createdAt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "LogResponse{" +
				"id='" + id + '\'' +
				", description='" + description + '\'' +
				", notes='" + notes + '\'' +
				", createdAt='" + createdAt + '\'' +
				'}';
	}
}