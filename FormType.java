package com.survey.Survey.googleForm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FormType {

	@Id
	long formId;

	
	 @OneToMany(mappedBy = "formType") 
	 List<Users> users;
	 
	
	
	
	 
	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	public FormType(long formId) {
		super();
		this.formId = formId;
	}
	
	public FormType() {
		
	}

	@Override
	public String toString() {
		return "FormType [FormId=" + this.formId + "]";
	}

	public long getFormId() {
		return this.formId;
	}

	public void setFormId(long formId) {
		this.formId = formId;
	}
	
}
