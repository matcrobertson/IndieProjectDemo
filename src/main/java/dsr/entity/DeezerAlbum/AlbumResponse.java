package dsr.entity.DeezerAlbum;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Album response.
 */
public class AlbumResponse{

	@JsonProperty("total")
	private int total;

	@JsonProperty("data")
	private List<DataItem> data;
	//did this fix it?
	@JsonProperty("next")
	private String next;

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
			"AlbumResponse{" + 
			"total = '" + total + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}