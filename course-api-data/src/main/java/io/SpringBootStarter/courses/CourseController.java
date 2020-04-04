package io.SpringBootStarter.courses;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.SpringBootStarter.topics.Topic;
import io.SpringBootStarter.topics.TopicService;

@RestController
public class CourseController {
	
	
	@Autowired
	private CourseService ts;
	
	@RequestMapping("/topics{id}/courses")
	public List<Course>getallCourses(String topicId){
		
		return ts.getAllCourses(topicId);
				
				
			
				
	}
	@RequestMapping("/topics/{id}/courses/{id}")
	public Optional<Course> getcourse(@PathVariable String id)
	{
		return  ts.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{id}/courses/")
	public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		ts.addCourse(course);
		
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}/courses/{id}")
    public void updateCourse(@RequestBody Course course,@PathVariable String topicId,@PathVariable String id) {
		course.setTopic(new Topic(topicId,"",""));
		ts.updateCourse(course);
		
	
	
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}/courses/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		ts.deleteTopic(id);
	}
	


}
