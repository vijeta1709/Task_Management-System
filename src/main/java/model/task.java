package model;

import java.time.LocalDateTime;

public class task {
	
	private int id;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public LocalDateTime getCreateAt() {
		return createAt;
	}
	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}
	public LocalDateTime getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}
	public LocalDateTime getCompletedAt() {
		return completedAt;
	}
	public void setCompletedAt(LocalDateTime completedAt) {
		this.completedAt = completedAt;
	}
	private String title;
    private String description;
    private  String priority;
    private String dueDate;
    private boolean completed;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private LocalDateTime completedAt;

	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	@Override
	public String toString() {
		return "task [id=" + id + ", title=" + title + ", description=" + description + ", priority=" + priority
				+ ", dueDate=" + dueDate + ", completed=" + completed + ", createAt=" + createAt + ", updateAt="
				+ updateAt + ", completedAt=" + completedAt + "]";
	}
	
	
    
}
