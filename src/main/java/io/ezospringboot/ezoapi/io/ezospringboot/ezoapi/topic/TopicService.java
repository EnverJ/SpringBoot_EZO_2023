package io.ezospringboot.ezoapi.io.ezospringboot.ezoapi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service   // make this class a spring service
public class TopicService {
     private List<Topic> topics = Arrays.asList(
        new Topic("Spring", "Spring Framework", "Spring Framework Description"),
        new Topic("Java", "Core Java", "Core Java Description"),
        new Topic("Javascript", "Java Script", "Javascript Description"));

        public List<Topic> getAllTopics() {
            return topics;

        }
        public Topic getTopic(String id) {
           return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        }
}
