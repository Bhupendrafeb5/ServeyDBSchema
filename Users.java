package com.survey.Survey.googleForm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Users {

	@Id
	@GeneratedValue
	long userId;
	
	
	  @ManyToOne 
	  FormType formType;
	 
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	
	  public FormType getFormType() { return formType; }
	  
	  public void setFormType(FormType formType) { this.formType = formType; }
	 
	public Users(long userId) {
		super();
		this.userId = userId;
	}
	
	public Users() {
		
	}

	@Override
	public String toString() {
		return "FormType [FormId=" + this.userId + "]";
	}

	public long getFormId() {
		return this.userId;
	}

	public void setFormId(long formId) {
		this.userId = formId;
	}
	
}
