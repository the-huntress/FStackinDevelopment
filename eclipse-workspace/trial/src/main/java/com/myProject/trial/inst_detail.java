package com.myProject.trial;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data

public class inst_detail implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "did")
	private int did;
	private String youtube;
	private String twitter;
	@OneToOne(mappedBy = "details",cascade = CascadeType.ALL)
	private inst ins;

}
