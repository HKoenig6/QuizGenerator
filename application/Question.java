package application;

import java.util.List;

public class Question {
	private String metadata;
	private String question;
	private String topic;
	private String image;
	private List<Choice> choices;
	private String answer;
	
	public Question(String metadata, String question, String topic, String image, 
			List<Choice> choices, String answer) {
		this.metadata = metadata;
		this.question = question;
		this.topic = topic;
		this.image = image;
		this.choices = choices;
		this.answer = answer;
	}
	
	String getQuestion() {
		return question; //TODO
	}
	
	List<Choice> getChoices() {
		return choices; //TODO
	}
	
	String getAnswer() {
		return answer; //TODO
	}
	
	String getMetadata() {
		return metadata; //TODO
	}
	
	String getTopic() {
		return topic; //TODO
	}
	
	String getImage() {
		return image; //TODO
	}
}
