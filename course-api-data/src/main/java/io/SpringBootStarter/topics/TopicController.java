package io.SpringBootStarter.topics;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService ts;
	
	@RequestMapping("/topics")
	public List<Topic>getallTopics(){
		
		return ts.getAlltopics();
				
				
			
				
	}
	@RequestMapping("/topics/{id}")
	public Optional<Topic> getAlltopics(@PathVariable String id)
	{
		return  ts.gettopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		
		ts.addTopic(topic);
		
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		
		ts.updateTopic(id,topic);
		
	
	
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		ts.deleteTopic(id);
	}
	
	


}
