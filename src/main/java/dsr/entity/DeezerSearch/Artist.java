package dsr.entity.DeezerSearch;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Artist{

	@JsonProperty("picture_xl")
	private String pictureXl;

	@JsonProperty("tracklist")
	private String tracklist;

	@JsonProperty("picture_big")
	private String pictureBig;

	@JsonProperty("name")
	private String name;

	@JsonProperty("link")
	private String link;

	@JsonProperty("picture_small")
	private String pictureSmall;

	@JsonProperty("id")
	private String id;

	@JsonProperty("type")
	private String type;

	@JsonProperty("picture")
	private String picture;

	@JsonProperty("picture_medium")
	private String pictureMedium;

	public void setPictureXl(String pictureXl){
		this.pictureXl = pictureXl;
	}

	public String getPictureXl(){
		return pictureXl;
	}

	public void setTracklist(String tracklist){
		this.tracklist = tracklist;
	}

	public String getTracklist(){
		return tracklist;
	}

	public void setPictureBig(String pictureBig){
		this.pictureBig = pictureBig;
	}

	public String getPictureBig(){
		return pictureBig;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setPictureSmall(String pictureSmall){
		this.pictureSmall = pictureSmall;
	}

	public String getPictureSmall(){
		return pictureSmall;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setPicture(String picture){
		this.picture = picture;
	}

	public String getPicture(){
		return picture;
	}

	public void setPictureMedium(String pictureMedium){
		this.pictureMedium = pictureMedium;
	}

	public String getPictureMedium(){
		return pictureMedium;
	}

	@Override
 	public String toString(){
		return 
			"Artist{" + 
			"picture_xl = '" + pictureXl + '\'' + 
			",tracklist = '" + tracklist + '\'' + 
			",picture_big = '" + pictureBig + '\'' + 
			",name = '" + name + '\'' + 
			",link = '" + link + '\'' + 
			",picture_small = '" + pictureSmall + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			",picture = '" + picture + '\'' + 
			",picture_medium = '" + pictureMedium + '\'' + 
			"}";
		}
}