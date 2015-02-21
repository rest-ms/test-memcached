package it.siletto.ms.memcached.test.dto;

import java.io.Serializable;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

public class SimpleObject implements Serializable {
	private static final long serialVersionUID = 8260764172081022396L;

	private String name;
	private Long value;
	private Date age;
	private Timestamp created;
	
	public static SimpleObject createRandom(){
		Random rand = new SecureRandom();
		SimpleObject ret = new SimpleObject();
		ret.setName("object " + rand.nextLong());
		ret.setValue(rand.nextLong());
		ret.setAge(new Date());
		ret.setCreated(new Timestamp(System.currentTimeMillis()));
		return ret;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getValue() {
		return value;
	}
	public void setValue(Long value) {
		this.value = value;
	}
	public Date getAge() {
		return age;
	}
	public void setAge(Date age) {
		this.age = age;
	}
	public Timestamp getCreated() {
		return created;
	}
	public void setCreated(Timestamp created) {
		this.created = created;
	}
}
