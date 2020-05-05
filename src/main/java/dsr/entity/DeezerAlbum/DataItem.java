package dsr.entity.DeezerAlbum;

import com.fasterxml.jackson.annotation.JsonProperty;

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

	public void setReadable(boolean readable){
		this.readable = readable;
	}

	public boolean isReadable(){
		return readable;
	}

	public void setPreview(String preview){
		this.preview = preview;
	}

	public String getPreview(){
		return preview;
	}

	public void setArtist(Artist artist){
		this.artist = artist;
	}

	public Artist getArtist(){
		return artist;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setExplicitContentCover(int explicitContentCover){
		this.explicitContentCover = explicitContentCover;
	}

	public int getExplicitContentCover(){
		return explicitContentCover;
	}

	public void setIsrc(String isrc){
		this.isrc = isrc;
	}

	public String getIsrc(){
		return isrc;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setTitleVersion(String titleVersion){
		this.titleVersion = titleVersion;
	}

	public String getTitleVersion(){
		return titleVersion;
	}

	public void setExplicitLyrics(boolean explicitLyrics){
		this.explicitLyrics = explicitLyrics;
	}

	public boolean isExplicitLyrics(){
		return explicitLyrics;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTitleShort(String titleShort){
		this.titleShort = titleShort;
	}

	public String getTitleShort(){
		return titleShort;
	}

	public void setDuration(String duration){
		this.duration = duration;
	}

	public String getDuration(){
		return duration;
	}

	public void setDiskNumber(int diskNumber){
		this.diskNumber = diskNumber;
	}

	public int getDiskNumber(){
		return diskNumber;
	}

	public void setRank(String rank){
		this.rank = rank;
	}

	public String getRank(){
		return rank;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setExplicitContentLyrics(int explicitContentLyrics){
		this.explicitContentLyrics = explicitContentLyrics;
	}

	public int getExplicitContentLyrics(){
		return explicitContentLyrics;
	}

	public void setTrackPosition(int trackPosition){
		this.trackPosition = trackPosition;
	}

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