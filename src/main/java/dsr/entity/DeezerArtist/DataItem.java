package dsr.entity.DeezerArtist;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataItem{

	@JsonProperty("tracklist")
	private String tracklist;

	@JsonProperty("link")
	private String link;

	@JsonProperty("cover_small")
	private String coverSmall;

	@JsonProperty("title")
	private String title;

	@JsonProperty("explicit_lyrics")
	private boolean explicitLyrics;

	@JsonProperty("type")
	private String type;

	@JsonProperty("genre_id")
	private int genreId;

	@JsonProperty("record_type")
	private String recordType;

	@JsonProperty("fans")
	private int fans;

	@JsonProperty("cover")
	private String cover;

	@JsonProperty("cover_xl")
	private String coverXl;

	@JsonProperty("release_date")
	private String releaseDate;

	@JsonProperty("cover_medium")
	private String coverMedium;

	@JsonProperty("id")
	private String id;

	@JsonProperty("cover_big")
	private String coverBig;

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

	public void setCoverSmall(String coverSmall){
		this.coverSmall = coverSmall;
	}

	public String getCoverSmall(){
		return coverSmall;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
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

	public void setGenreId(int genreId){
		this.genreId = genreId;
	}

	public int getGenreId(){
		return genreId;
	}

	public void setRecordType(String recordType){
		this.recordType = recordType;
	}

	public String getRecordType(){
		return recordType;
	}

	public void setFans(int fans){
		this.fans = fans;
	}

	public int getFans(){
		return fans;
	}

	public void setCover(String cover){
		this.cover = cover;
	}

	public String getCover(){
		return cover;
	}

	public void setCoverXl(String coverXl){
		this.coverXl = coverXl;
	}

	public String getCoverXl(){
		return coverXl;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public void setCoverMedium(String coverMedium){
		this.coverMedium = coverMedium;
	}

	public String getCoverMedium(){
		return coverMedium;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCoverBig(String coverBig){
		this.coverBig = coverBig;
	}

	public String getCoverBig(){
		return coverBig;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"tracklist = '" + tracklist + '\'' + 
			",link = '" + link + '\'' + 
			",cover_small = '" + coverSmall + '\'' + 
			",title = '" + title + '\'' + 
			",explicit_lyrics = '" + explicitLyrics + '\'' + 
			",type = '" + type + '\'' + 
			",genre_id = '" + genreId + '\'' + 
			",record_type = '" + recordType + '\'' + 
			",fans = '" + fans + '\'' + 
			",cover = '" + cover + '\'' + 
			",cover_xl = '" + coverXl + '\'' + 
			",release_date = '" + releaseDate + '\'' + 
			",cover_medium = '" + coverMedium + '\'' + 
			",id = '" + id + '\'' + 
			",cover_big = '" + coverBig + '\'' + 
			"}";
		}
}