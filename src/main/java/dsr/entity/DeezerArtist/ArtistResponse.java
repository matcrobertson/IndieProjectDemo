package dsr.entity.DeezerArtist;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Artist response.
 */
public class ArtistResponse{

	@JsonProperty("next")
	private String next;

	@JsonProperty("total")
	private int total;

	@JsonProperty("data")
	private List<DataItem> data;

    /**
     * Set next.
     *
     * @param next the next
     */
    public void setNext(String next){
		this.next = next;
	}

    /**
     * Get next string.
     *
     * @return the string
     */
    public String getNext(){
		return next;
	}

    /**
     * Set total.
     *
     * @param total the total
     */
    public void setTotal(int total){
		this.total = total;
	}

    /**
     * Get total int.
     *
     * @return the int
     */
    public int getTotal(){
		return total;
	}

    /**
     * Set data.
     *
     * @param data the data
     */
    public void setData(List<DataItem> data){
		this.data = data;
	}

    /**
     * Get data list.
     *
     * @return the list
     */
    public List<DataItem> getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"ArtistResponse{" + 
			"next = '" + next + '\'' + 
			",total = '" + total + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}