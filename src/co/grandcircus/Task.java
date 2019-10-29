package co.grandcircus;

public class Task {
	
	String memberName;
	String memberDeetz;
	String dueDate;
	boolean complete = false;
	
	public Task(String memberName, String memberDeetz, String dueDate, boolean complete) {
		super();
		this.memberName = memberName;
		this.memberDeetz = memberDeetz;
		this.dueDate = dueDate;
		this.complete = complete;
	}

	public Task() {
		
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberDeetz() {
		return memberDeetz;
	}

	public void setMemberDeetz(String memberDeetz) {
		this.memberDeetz = memberDeetz;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	@Override
	public String toString() {
		return "Task [memberName=" + memberName + ", memberDeetz=" + memberDeetz + ", dueDate=" + dueDate
				+ ", complete=" + complete + "]";
	}
	
	
	
	
}
