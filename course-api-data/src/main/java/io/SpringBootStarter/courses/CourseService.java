package io.SpringBootStarter.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository cr;
	
	
	
	
			
			
	public List<Course> getAllCourses(String topicId) {
		// TODO Auto-generated method stub
		
		
		List <Course>topics=new ArrayList<>();
		 cr.findByTopic(topicId)
				.forEach(topics::add);
		 
		 return topics;
	}
	
	public Optional<Course> getCourse(String id)
	
	{
		return cr.findById(id);
	//	return  topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}
	
	public void addCourse(Course topic) {
		// TODO Auto-generated method stub
		cr.save(topic);
		
		
	}
	public void updateCourse( Course course) {
		
	       /*int i;
			for( i= 0;i<topics.size();i++) {
				Course t =topics.get(i);
			
				
				if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}*/
			
		cr.save(course);
		
	
	
	
}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		
		cr.deleteById(id);
		
	}
}
