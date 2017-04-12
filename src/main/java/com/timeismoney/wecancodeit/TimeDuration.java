package com.timeismoney.wecancodeit; 

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class TimeDuration {
	private long userTime;
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	
	protected TimeDuration() {
		
	}
	public TimeDuration(long id, long userTime) {
		this.id = id;
		this.userTime = userTime;
	}

	public long getId() {
		return id;
	}

	public long getUserTime() {
		return userTime;
	}
}
