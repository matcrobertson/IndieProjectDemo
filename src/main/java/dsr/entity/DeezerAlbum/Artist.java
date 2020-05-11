package dsr.entity.DeezerAlbum;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Artist.
 */
public class Artist{

	@JsonProperty("tracklist")
	private String tracklist;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private String id;

	@JsonProperty("type")
	private String type;

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

	@Override
 	public String toString(){
		return 
			"Artist{" + 
			"tracklist = '" + tracklist + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}