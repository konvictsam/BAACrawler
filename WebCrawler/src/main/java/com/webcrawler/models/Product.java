package com.webcrawler.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Sameer Gaware
 *
 */

@XmlRootElement(name = "product")
@XmlAccessorType (XmlAccessType.FIELD)
public class Product
{
	private String id = null;
	private String productURL = null;
	private String modelNumber = null;
	private String description = null;
	private String image = null;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) { 
		this.id = id;
	}
	
	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}

	public String getProductURL() {
		return productURL;
	}

	public void setProductURL(String productURL) {
		this.productURL = productURL;
	}

	
}