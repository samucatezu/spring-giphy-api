package com.bezkoder.spring.jpa.postgresql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Table(name = "Gif")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Gif {
	@Id
	private String id;

	@Column(name = "title")
	private String title;

	@Column(name = "urlGiphy")
	private String urlGiphy;

	@Column(name = "urlImage")
	private String urlImage;
//	@Override
//	public String toString() {
//		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
//	}

}
