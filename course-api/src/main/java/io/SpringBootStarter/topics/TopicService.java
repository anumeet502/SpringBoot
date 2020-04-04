package io.SpringBootStarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	
	private List <Topic>topics=new ArrayList<>(Arrays.asList(new Topic("spring","Spring Framework","Spring Description"),
			new Topic("java","Core Java","Java Description"),
			new Topic("javascript","JavaScript","JavaScript Description")
			
			
			));
	public Topic gettopic(String id)
	{
		return  topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}
	public List<Topic> getAlltopics() {
		// TODO Auto-generated method stub
		return topics;
	}
	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
		
	}
	public void updateTopic(String id, Topic topic) {
		
	       int i;
			for( i= 0;i<topics.size();i++) {
				Topic t =topics.get(i);
			
				
				if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
			
		
		
	}
	
	
	
	
}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		
		topics.removeIf((t->t.getId().equals(id)));
		
	}
}
