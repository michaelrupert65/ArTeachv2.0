package com.arteach.main.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message = "Field is required!")
	private Integer teacherID;
	private String firstName;
	private String lastName;
	@Column(unique=true) 
	private String teacherEmail;
	@Column(columnDefinition = "boolean default true")
	private Boolean uEnabled;
	@NotNull(message = "Field is required!")
	private String uRole;
	private String uPassword;
	@OneToMany(targetEntity = Course.class)
	private List<Course> course;
	@OneToMany(targetEntity = Discipline.class)
	private List<Discipline> discipline;
	//constructors
	public Teacher() {
	
	}
	public Teacher(@NotNull(message = "Field is required!") Integer teacherID, String firstName, String lastName,
			String teacherEmail, Boolean uEnabled, @NotNull(message = "Field is required!") String uRole,
			String uPassword, List<Course> course, List<Discipline> discipline) {
		super();
		this.teacherID = teacherID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.teacherEmail = teacherEmail;
		this.uEnabled = uEnabled;
		this.uRole = uRole;
		this.uPassword = uPassword;
		this.course = course;
		this.discipline = discipline;
	}
	//getters and setters
	public Integer getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(Integer teacherID) {
		this.teacherID = teacherID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTeacherEmail() {
		return teacherEmail;
	}
	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
	public Boolean getuEnabled() {
		return uEnabled;
	}
	public void setuEnabled(Boolean uEnabled) {
		this.uEnabled = uEnabled;
	}
	public String getuRole() {
		return uRole;
	}
	public void setuRole(String uRole) {
		this.uRole = uRole;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public List<Discipline> getDiscipline() {
		return discipline;
	}
	public void setDiscipline(List<Discipline> discipline) {
		this.discipline = discipline;
	}

}
