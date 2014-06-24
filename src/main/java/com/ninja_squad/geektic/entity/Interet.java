package com.ninja_squad.geektic.entity;

import javax.persistence.*;

@Entity
@Table(name = "INTERET")

public class Interet {

		@Id
		private Long id;

		@Column(name = "Programmation")
		private String programmation;
		
		@ManyToMany
		@JoinTable(name = "GEEKINTERET", joinColumns = @JoinColumn(name = "ID_INTERET"), inverseJoinColumns = @JoinColumn(name = "ID_GEEK"))


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProgrammation() {
			return programmation;
		}

		public void setProgrammation(String programmation) {
			this.programmation = programmation;
		}
		
		

		
		
	
}
