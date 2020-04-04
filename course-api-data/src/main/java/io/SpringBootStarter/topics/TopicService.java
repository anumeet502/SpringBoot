package io.SpringBootStarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository tr;
	
	
	
	private List <Topic>topics=new ArrayList<>(Arrays.asList(new Topic("spring","Spring Framework","Spring Description"),
			new Topic("java","Core Java","Java Description"),
			new Topic("javascript","JavaScript","JavaScript Description")
			
			
			));
	public Optional<Topic> gettopic(String id)
	
	{
		return tr.findById(id);
	//	return  topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}
	public List<Topic> getAlltopics() {
		// TODO Auto-generated method stub
		
		
		List <Topic>topics=new ArrayList<>();
		 tr.findAll()
				.forEach(topics::add);
		 
		 return topics;
	}
	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		tr.save(topic);
		
		
	}
	public void updateTopic(String id, Topic topic) {
		
	       /*int i;
			for( i= 0;i<topics.size();i++) {
				Course t =topics.get(i);
			
				
				if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}*/
			
		tr.save(topic);
		
	
	
	
}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		
		tr.deleteById(id);
		
	}
}
