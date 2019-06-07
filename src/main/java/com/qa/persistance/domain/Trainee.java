package com.qa.persistance.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainee {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(length = 30)
	private String firstName;
	@Column(length = 30)
	private String lastName;
	// @ManyToOne
	// @JoinColumn(name = "id")
	// private Classroom classroom;

	public Trainee() {
		super();
	}

	public Trainee(long id, String firstName, String lastName/* , Classroom classroom */) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		// this.classroom = classroom;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	// public Classroom getcId() {
	// return classroom;
	// }
	//
	// public void setcId(Classroom classroom) {
	// this.classroom = classroom;
	// }

	// @Override
	// public String toString() {
	// return "Trainee{" + "id=" + id + ", firstName='" + firstName + '\'' + ",
	// lastName=" + lastName + '}';
	// }

}
