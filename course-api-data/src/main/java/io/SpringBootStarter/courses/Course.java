package io.SpringBootStarter.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.SpringBootStarter.topics.Topic;

@Entity
public class Course {
	
	
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Topic topic;
	public Course()
	{
		
	}
	
	
	public Course(String id,String name,String Description,String topicId) {
		
		super();
		this.id=id;
		this.name=name;
		this.description=Description;
		this.topic=new Topic(topicId,"","");
	}
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	public void setTopic(Topic topic) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
