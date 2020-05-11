package dsr.entity.DeezerArtist;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Data item.
 */
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
     * Set cover small.
     *
     * @param coverSmall the cover small
     */
    public void setCoverSmall(String coverSmall){
		this.coverSmall = coverSmall;
	}

    /**
     * Get cover small string.
     *
     * @return the string
     */
    public String getCoverSmall(){
		return coverSmall;
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
     * Set genre id.
     *
     * @param genreId the genre id
     */
    public void setGenreId(int genreId){
		this.genreId = genreId;
	}

    /**
     * Get genre id int.
     *
     * @return the int
     */
    public int getGenreId(){
		return genreId;
	}

    /**
     * Set record type.
     *
     * @param recordType the record type
     */
    public void setRecordType(String recordType){
		this.recordType = recordType;
	}

    /**
     * Get record type string.
     *
     * @return the string
     */
    public String getRecordType(){
		return recordType;
	}

    /**
     * Set fans.
     *
     * @param fans the fans
     */
    public void setFans(int fans){
		this.fans = fans;
	}

    /**
     * Get fans int.
     *
     * @return the int
     */
    public int getFans(){
		return fans;
	}

    /**
     * Set cover.
     *
     * @param cover the cover
     */
    public void setCover(String cover){
		this.cover = cover;
	}

    /**
     * Get cover string.
     *
     * @return the string
     */
    public String getCover(){
		return cover;
	}

    /**
     * Set cover xl.
     *
     * @param coverXl the cover xl
     */
    public void setCoverXl(String coverXl){
		this.coverXl = coverXl;
	}

    /**
     * Get cover xl string.
     *
     * @return the string
     */
    public String getCoverXl(){
		return coverXl;
	}

    /**
     * Set release date.
     *
     * @param releaseDate the release date
     */
    public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

    /**
     * Get release date string.
     *
     * @return the string
     */
    public String getReleaseDate(){
		return releaseDate;
	}

    /**
     * Set cover medium.
     *
     * @param coverMedium the cover medium
     */
    public void setCoverMedium(String coverMedium){
		this.coverMedium = coverMedium;
	}

    /**
     * Get cover medium string.
     *
     * @return the string
     */
    public String getCoverMedium(){
		return coverMedium;
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
     * Set cover big.
     *
     * @param coverBig the cover big
     */
    public void setCoverBig(String coverBig){
		this.coverBig = coverBig;
	}

    /**
     * Get cover big string.
     *
     * @return the string
     */
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