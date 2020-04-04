package io.SpringBootStarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.SpringBootStarter.topics.Course;
import io.SpringBootStarter.topics.TopicRepository;

@Service
public class CourseService {
	
	
	
	@Autowired
	private CourseRepository cr;
	
	
	
	private List <Course>topics=new ArrayList<>(Arrays.asList(new Course("spring","Spring Framework","Spring Description"),
			new Course("java","Core Java","Java Description"),
			new Course("javascript","JavaScript","JavaScript Description")
			
			
			));
	public Optional<Course> gettopic(String id)
	
	{
		return cr.findById(id);
	//	return  topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}
	public List<Course> getAlltopics() {
		// TODO Auto-generated method stub
		
		
		List <Course>topics=new ArrayList<>();
		 cr.findAll()
				.forEach(topics::add);
		 
		 return topics;
	}
	public void addTopic(Course topic) {
		// TODO Auto-generated method stub
		cr.save(topic);
		
		
	}
	public void updateTopic(String id, Course topic) {
		
	       /*int i;
			for( i= 0;i<topics.size();i++) {
				Course t =topics.get(i);
			
				
				if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}*/
			
		cr.save(topic);
		
	
	
	
}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		
		cr.deleteById(id);
		
	}
}
