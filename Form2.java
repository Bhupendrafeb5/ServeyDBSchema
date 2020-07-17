package com.survey.Survey.googleForm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Form2 {

	@Id
	long userIdForm2;
	
	public Form2() {
		super();
	}

	public Form2( boolean previousAttendence, String overallSatisfaction, String location, String content, String price,
			String speakers, String organizationName, String suggestion) {
		super();
		
		this.previousAttendence = previousAttendence;
		this.overallSatisfaction = overallSatisfaction;
		this.location = location;
		this.content = content;
		this.price = price;
		this.speakers = speakers;
		this.organizationName = organizationName;
		this.suggestion = suggestion;
	}

	@Override
	public String toString() {
		return "Form1 [userId=" + userIdForm2 + ", previousAttendence=" + previousAttendence + ", overallSatisfaction="
				+ overallSatisfaction + ", location=" + location + ", content=" + content + ", price=" + price
				+ ", speakers=" + speakers + ", organizationName=" + organizationName + ", suggestion=" + suggestion
				+ "]";
	}

	public long getUserId() {
		return userIdForm2;
	}

	public void setUserId(int userId) {
		this.userIdForm2 = userId;
	}

	public boolean isPreviousAttendence() {
		return previousAttendence;
	}

	public void setPreviousAttendence(boolean previousAttendence) {
		this.previousAttendence = previousAttendence;
	}

	public String getOverallSatisfaction() {
		return overallSatisfaction;
	}

	public void setOverallSatisfaction(String overallSatisfaction) {
		this.overallSatisfaction = overallSatisfaction;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSpeakers() {
		return speakers;
	}

	public void setSpeakers(String speakers) {
		this.speakers = speakers;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	boolean previousAttendence;
	
	String overallSatisfaction;
	
	String location;
	String content;
	String price;
	String speakers;
	String organizationName;
	
	String suggestion;
	public String getFormStatus() {
		return formStatus;
	}

	public void setFormStatus(String formStatus) {
		this.formStatus = formStatus;
	}

	String formStatus;
	

}
