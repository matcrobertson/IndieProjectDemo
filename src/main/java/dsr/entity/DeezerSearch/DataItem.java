package dsr.entity.DeezerSearch;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Data item.
 */
public class DataItem{

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

	@JsonProperty("id")
	private String id;

	@JsonProperty("picture_medium")
	private String pictureMedium;

    /**
     * Set picture xl.
     *
     * @param pictureXl the picture xl
     */
    public void setPictureXl(String pictureXl){
		this.pictureXl = pictureXl;
	}

    /**
     * Get picture xl string.
     *
     * @return the string
     */
    public String getPictureXl(){
		return pictureXl;
	}

    /**
     * Set tracklist.
     *
     * @param tracklist the tracklist
     */
    public void setTracklist(String tracklist){
		this.tracklist = tracklist;
	}

    /**
     * Get tracklist string.
     *
     * @return the string
     */
    public String getTracklist(){
		return tracklist;
	}

    /**
     * Set link.
     *
     * @param link the link
     */
    public void setLink(String link){
		this.link = link;
	}

    /**
     * Get link string.
     *
     * @return the string
     */
    public String getLink(){
		return link;
	}

    /**
     * Set picture small.
     *
     * @param pictureSmall the picture small
     */
    public void setPictureSmall(String pictureSmall){
		this.pictureSmall = pictureSmall;
	}

    /**
     * Get picture small string.
     *
     * @return the string
     */
    public String getPictureSmall(){
		return pictureSmall;
	}

    /**
     * Set type.
     *
     * @param type the type
     */
    public void setType(String type){
		this.type = type;
	}

    /**
     * Get type string.
     *
     * @return the string
     */
    public String getType(){
		return type;
	}

    /**
     * Set nb album.
     *
     * @param nbAlbum the nb album
     */
    public void setNbAlbum(int nbAlbum){
		this.nbAlbum = nbAlbum;
	}

    /**
     * Get nb album int.
     *
     * @return the int
     */
    public int getNbAlbum(){
		return nbAlbum;
	}

    /**
     * Set picture.
     *
     * @param picture the picture
     */
    public void setPicture(String picture){
		this.picture = picture;
	}

    /**
     * Get picture string.
     *
     * @return the string
     */
    public String getPicture(){
		return picture;
	}

    /**
     * Set nb fan.
     *
     * @param nbFan the nb fan
     */
    public void setNbFan(int nbFan){
		this.nbFan = nbFan;
	}

    /**
     * Get nb fan int.
     *
     * @return the int
     */
    public int getNbFan(){
		return nbFan;
	}

    /**
     * Set radio.
     *
     * @param radio the radio
     */
    public void setRadio(boolean radio){
		this.radio = radio;
	}

    /**
     * Is radio boolean.
     *
     * @return the boolean
     */
    public boolean isRadio(){
		return radio;
	}

    /**
     * Set picture big.
     *
     * @param pictureBig the picture big
     */
    public void setPictureBig(String pictureBig){
		this.pictureBig = pictureBig;
	}

    /**
     * Get picture big string.
     *
     * @return the string
     */
    public String getPictureBig(){
		return pictureBig;
	}

    /**
     * Set name.
     *
     * @param name the name
     */
    public void setName(String name){
		this.name = name;
	}

    /**
     * Get name string.
     *
     * @return the string
     */
    public String getName(){
		return name;
	}

    /**
     * Set id.
     *
     * @param id the id
     */
    public void setId(String id){
		this.id = id;
	}

    /**
     * Get id string.
     *
     * @return the string
     */
    public String getId(){
		return id;
	}

    /**
     * Set picture medium.
     *
     * @param pictureMedium the picture medium
     */
    public void setPictureMedium(String pictureMedium){
		this.pictureMedium = pictureMedium;
	}

    /**
     * Get picture medium string.
     *
     * @return the string
     */
    public String getPictureMedium(){
		return pictureMedium;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
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
			",id = '" + id + '\'' + 
			",picture_medium = '" + pictureMedium + '\'' + 
			"}";
		}
}