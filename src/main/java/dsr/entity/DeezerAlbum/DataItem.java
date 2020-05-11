package dsr.entity.DeezerAlbum;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Data item.
 */
public class DataItem{

	@JsonProperty("readable")
	private boolean readable;

	@JsonProperty("preview")
	private String preview;

	@JsonProperty("artist")
	private Artist artist;

	@JsonProperty("link")
	private String link;

	@JsonProperty("explicit_content_cover")
	private int explicitContentCover;

	@JsonProperty("isrc")
	private String isrc;

	@JsonProperty("title")
	private String title;

	@JsonProperty("title_version")
	private String titleVersion;

	@JsonProperty("explicit_lyrics")
	private boolean explicitLyrics;

	@JsonProperty("type")
	private String type;

	@JsonProperty("title_short")
	private String titleShort;

	@JsonProperty("duration")
	private String duration;

	@JsonProperty("disk_number")
	private int diskNumber;

	@JsonProperty("rank")
	private String rank;

	@JsonProperty("id")
	private String id;

	@JsonProperty("explicit_content_lyrics")
	private int explicitContentLyrics;

	@JsonProperty("track_position")
	private int trackPosition;

    /**
     * Set readable.
     *
     * @param readable the readable
     */
    public void setReadable(boolean readable){
		this.readable = readable;
	}

    /**
     * Is readable boolean.
     *
     * @return the boolean
     */
    public boolean isReadable(){
		return readable;
	}

    /**
     * Set preview.
     *
     * @param preview the preview
     */
    public void setPreview(String preview){
		this.preview = preview;
	}

    /**
     * Get preview string.
     *
     * @return the string
     */
    public String getPreview(){
		return preview;
	}

    /**
     * Set artist.
     *
     * @param artist the artist
     */
    public void setArtist(Artist artist){
		this.artist = artist;
	}

    /**
     * Get artist artist.
     *
     * @return the artist
     */
    public Artist getArtist(){
		return artist;
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
     * Set explicit content cover.
     *
     * @param explicitContentCover the explicit content cover
     */
    public void setExplicitContentCover(int explicitContentCover){
		this.explicitContentCover = explicitContentCover;
	}

    /**
     * Get explicit content cover int.
     *
     * @return the int
     */
    public int getExplicitContentCover(){
		return explicitContentCover;
	}

    /**
     * Set isrc.
     *
     * @param isrc the isrc
     */
    public void setIsrc(String isrc){
		this.isrc = isrc;
	}

    /**
     * Get isrc string.
     *
     * @return the string
     */
    public String getIsrc(){
		return isrc;
	}

    /**
     * Set title.
     *
     * @param title the title
     */
    public void setTitle(String title){
		this.title = title;
	}

    /**
     * Get title string.
     *
     * @return the string
     */
    public String getTitle(){
		return title;
	}

    /**
     * Set title version.
     *
     * @param titleVersion the title version
     */
    public void setTitleVersion(String titleVersion){
		this.titleVersion = titleVersion;
	}

    /**
     * Get title version string.
     *
     * @return the string
     */
    public String getTitleVersion(){
		return titleVersion;
	}

    /**
     * Set explicit lyrics.
     *
     * @param explicitLyrics the explicit lyrics
     */
    public void setExplicitLyrics(boolean explicitLyrics){
		this.explicitLyrics = explicitLyrics;
	}

    /**
     * Is explicit lyrics boolean.
     *
     * @return the boolean
     */
    public boolean isExplicitLyrics(){
		return explicitLyrics;
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
     * Set title short.
     *
     * @param titleShort the title short
     */
    public void setTitleShort(String titleShort){
		this.titleShort = titleShort;
	}

    /**
     * Get title short string.
     *
     * @return the string
     */
    public String getTitleShort(){
		return titleShort;
	}

    /**
     * Set duration.
     *
     * @param duration the duration
     */
    public void setDuration(String duration){
		this.duration = duration;
	}

    /**
     * Get duration string.
     *
     * @return the string
     */
    public String getDuration(){
		return duration;
	}

    /**
     * Set disk number.
     *
     * @param diskNumber the disk number
     */
    public void setDiskNumber(int diskNumber){
		this.diskNumber = diskNumber;
	}

    /**
     * Get disk number int.
     *
     * @return the int
     */
    public int getDiskNumber(){
		return diskNumber;
	}

    /**
     * Set rank.
     *
     * @param rank the rank
     */
    public void setRank(String rank){
		this.rank = rank;
	}

    /**
     * Get rank string.
     *
     * @return the string
     */
    public String getRank(){
		return rank;
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
     * Set explicit content lyrics.
     *
     * @param explicitContentLyrics the explicit content lyrics
     */
    public void setExplicitContentLyrics(int explicitContentLyrics){
		this.explicitContentLyrics = explicitContentLyrics;
	}

    /**
     * Get explicit content lyrics int.
     *
     * @return the int
     */
    public int getExplicitContentLyrics(){
		return explicitContentLyrics;
	}

    /**
     * Set track position.
     *
     * @param trackPosition the track position
     */
    public void setTrackPosition(int trackPosition){
		this.trackPosition = trackPosition;
	}

    /**
     * Get track position int.
     *
     * @return the int
     */
    public int getTrackPosition(){
		return trackPosition;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"readable = '" + readable + '\'' + 
			",preview = '" + preview + '\'' + 
			",artist = '" + artist + '\'' + 
			",link = '" + link + '\'' + 
			",explicit_content_cover = '" + explicitContentCover + '\'' + 
			",isrc = '" + isrc + '\'' + 
			",title = '" + title + '\'' + 
			",title_version = '" + titleVersion + '\'' + 
			",explicit_lyrics = '" + explicitLyrics + '\'' + 
			",type = '" + type + '\'' + 
			",title_short = '" + titleShort + '\'' + 
			",duration = '" + duration + '\'' + 
			",disk_number = '" + diskNumber + '\'' + 
			",rank = '" + rank + '\'' + 
			",id = '" + id + '\'' + 
			",explicit_content_lyrics = '" + explicitContentLyrics + '\'' + 
			",track_position = '" + trackPosition + '\'' + 
			"}";
		}
}