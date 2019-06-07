package com.qa.persistance.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classroom {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(length = 30)
	private String trainerFirst;
	@Column(length = 30)
	private String trainerLast;

	// @OneToMany(mappedBy = "classroom")
	// private List<Trainee> trainee = new ArrayList<>();

	public Classroom() {
		super();
	}

	public Classroom(long id, String trainerFirst, String trainerLast/* , List<Trainee> trainee */) {
		super();
		this.id = id;
		this.trainerFirst = trainerFirst;
		this.trainerLast = trainerLast;
		// this.trainee = trainee;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTrainerFirst() {
		return trainerFirst;
	}

	public void setTrainerFirst(String trainerFirst) {
		this.trainerFirst = trainerFirst;
	}

	public String getTrainerLast() {
		return trainerLast;
	}

	public void setTrainerLast(String trainerLast) {
		this.trainerLast = trainerLast;
	}

	// public List<Trainee> getTrainee() {
	// return trainee;
	// }
	//
	// public void setTrainee(List<Trainee> trainee) {
	// this.trainee = trainee;
	// }

}
