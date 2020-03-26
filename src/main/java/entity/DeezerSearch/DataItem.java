package entity.DeezerSearch;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataItem{

	@JsonProperty("readable")
	private boolean readable;

	@JsonProperty("preview")
	private String preview;

	@JsonProperty("artist")
	private Artist artist;

	@JsonProperty("album")
	private Album album;

	@JsonProperty("link")
	private String link;

	@JsonProperty("explicit_content_cover")
	private int explicitContentCover;

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

	@JsonProperty("rank")
	private String rank;

	@JsonProperty("id")
	private String id;

	@JsonProperty("explicit_content_lyrics")
	private int explicitContentLyrics;

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

	public void setAlbum(Album album){
		this.album = album;
	}

	public Album getAlbum(){
		return album;
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

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"readable = '" + readable + '\'' + 
			",preview = '" + preview + '\'' + 
			",artist = '" + artist + '\'' + 
			",album = '" + album + '\'' + 
			",link = '" + link + '\'' + 
			",explicit_content_cover = '" + explicitContentCover + '\'' + 
			",title = '" + title + '\'' + 
			",title_version = '" + titleVersion + '\'' + 
			",explicit_lyrics = '" + explicitLyrics + '\'' + 
			",type = '" + type + '\'' + 
			",title_short = '" + titleShort + '\'' + 
			",duration = '" + duration + '\'' + 
			",rank = '" + rank + '\'' + 
			",id = '" + id + '\'' + 
			",explicit_content_lyrics = '" + explicitContentLyrics + '\'' + 
			"}";
		}
}