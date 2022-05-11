package com.spring.entity;


public class Message {
	
	private String messageID;
	private String Content;
	private String sender;

	@Override
	public String toString() {
		return "Message{" +
				"messageID='" + messageID + '\'' +
				", Content='" + Content + '\'' +
				", sender='" + sender + '\'' +
				'}';
	}

	public String getMessageID() {
		return messageID;
	}

	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}
}
