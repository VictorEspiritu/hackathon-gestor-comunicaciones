package com.bbva.microservices.entity;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Mail {

	private String id;
	private String toMail;
	private String fromMail;
	private List<String> ccMail;
	private String subject;
	private String mTitle;
	private String mBody;
	private String mSign;
		
	public Mail() {
		// TODO Auto-generated constructor stub
	}
	

	public Mail(String toMail, String fromMail, List<String> ccMail, String subject, String mTitle, String mBody,
			String mSign) {
		super();
		this.toMail = toMail;
		this.fromMail = fromMail;
		this.ccMail = ccMail;
		this.subject = subject;
		this.mTitle = mTitle;
		this.mBody = mBody;
		this.mSign = mSign;
	}




	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getToMail() {
		return toMail;
	}

	public void setToMail(String toMail) {
		this.toMail = toMail;
	}

	public String getFromMail() {
		return fromMail;
	}

	public void setFromMail(String fromMail) {
		this.fromMail = fromMail;
	}

	public List<String> getCcMail() {
		return ccMail;
	}

	public void setCcMail(List<String> ccMail) {
		this.ccMail = ccMail;
	}

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public String getmBody() {
		return mBody;
	}

	public void setmBody(String mBody) {
		this.mBody = mBody;
	}

	public String getmSign() {
		return mSign;
	}

	public void setmSign(String mSign) {
		this.mSign = mSign;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{ \"id\":\"");
		builder.append(id);
		builder.append("\", \"toMail\":\"");
		builder.append(toMail);
		builder.append("\", \"fromMail\":\"");
		builder.append(fromMail);
		builder.append("\", \"ccMail\":\"");
		builder.append(ccMail);
		builder.append("\", \"mTitle\":\"");
		builder.append(mTitle);
		builder.append("\", \"mBody\":\"");
		builder.append(mBody);
		builder.append("\", \"mSign\":\"");
		builder.append(mSign);
		builder.append("\"}");
		return builder.toString();
	}
	
	
}
