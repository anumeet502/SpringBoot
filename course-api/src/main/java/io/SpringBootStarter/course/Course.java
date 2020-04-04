package io.SpringBootStarter.course;

public class Course {
	
	public Course()
	{
		
	}
	private String id;
	private String name;
	private String description;
	
	
	public Course(String id,String name,String Description) {
		
		super();
		this.id=id;
		this.name=name;
		this.description=Description;
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
	
	
	
	
}
