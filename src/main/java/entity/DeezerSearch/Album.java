package entity.DeezerSearch;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Album{

	@JsonProperty("cover")
	private String cover;

	@JsonProperty("tracklist")
	private String tracklist;

	@JsonProperty("cover_xl")
	private String coverXl;

	@JsonProperty("cover_medium")
	private String coverMedium;

	@JsonProperty("cover_small")
	private String coverSmall;

	@JsonProperty("id")
	private String id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("type")
	private String type;

	@JsonProperty("cover_big")
	private String coverBig;

	public void setCover(String cover){
		this.cover = cover;
	}

	public String getCover(){
		return cover;
	}

	public void setTracklist(String tracklist){
		this.tracklist = tracklist;
	}

	public String getTracklist(){
		return tracklist;
	}

	public void setCoverXl(String coverXl){
		this.coverXl = coverXl;
	}

	public String getCoverXl(){
		return coverXl;
	}

	public void setCoverMedium(String coverMedium){
		this.coverMedium = coverMedium;
	}

	public String getCoverMedium(){
		return coverMedium;
	}

	public void setCoverSmall(String coverSmall){
		this.coverSmall = coverSmall;
	}

	public String getCoverSmall(){
		return coverSmall;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
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
			"Album{" + 
			"cover = '" + cover + '\'' + 
			",tracklist = '" + tracklist + '\'' + 
			",cover_xl = '" + coverXl + '\'' + 
			",cover_medium = '" + coverMedium + '\'' + 
			",cover_small = '" + coverSmall + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",type = '" + type + '\'' + 
			",cover_big = '" + coverBig + '\'' + 
			"}";
		}
}