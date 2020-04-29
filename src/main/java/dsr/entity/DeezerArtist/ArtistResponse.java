package dsr.entity.DeezerArtist;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArtistResponse {

	@JsonProperty("picture_xl")
	private String pictureXl;

	@JsonProperty("tracklist")
	private String tracklist;

	@JsonProperty("link")
	private String link;

	@JsonProperty("picture_small")
	private String pictureSmall;

	@JsonProperty("type")
	private String type;

	@JsonProperty("nb_album")
	private int nbAlbum;

	@JsonProperty("picture")
	private String picture;

	@JsonProperty("nb_fan")
	private int nbFan;

	@JsonProperty("radio")
	private boolean radio;

	@JsonProperty("picture_big")
	private String pictureBig;

	@JsonProperty("name")
	private String name;

	@JsonProperty("share")
	private String share;
//use this to create this => https://api.deezer.com/artist/27/albums
	@JsonProperty("id")
	private String id;

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

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setNbAlbum(int nbAlbum){
		this.nbAlbum = nbAlbum;
	}

	public int getNbAlbum(){
		return nbAlbum;
	}

	public void setPicture(String picture){
		this.picture = picture;
	}

	public String getPicture(){
		return picture;
	}

	public void setNbFan(int nbFan){
		this.nbFan = nbFan;
	}

	public int getNbFan(){
		return nbFan;
	}

	public void setRadio(boolean radio){
		this.radio = radio;
	}

	public boolean isRadio(){
		return radio;
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

	public void setShare(String share){
		this.share = share;
	}

	public String getShare(){
		return share;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
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
			"SearchResponse{" +
			"picture_xl = '" + pictureXl + '\'' + 
			",tracklist = '" + tracklist + '\'' + 
			",link = '" + link + '\'' + 
			",picture_small = '" + pictureSmall + '\'' + 
			",type = '" + type + '\'' + 
			",nb_album = '" + nbAlbum + '\'' + 
			",picture = '" + picture + '\'' + 
			",nb_fan = '" + nbFan + '\'' + 
			",radio = '" + radio + '\'' + 
			",picture_big = '" + pictureBig + '\'' + 
			",name = '" + name + '\'' + 
			",share = '" + share + '\'' + 
			",id = '" + id + '\'' + 
			",picture_medium = '" + pictureMedium + '\'' + 
			"}";
		}
}