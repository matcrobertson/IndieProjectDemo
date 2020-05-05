package dsr.entity.DeezerAlbum;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AlbumResponse{

	@JsonProperty("total")
	private int total;

	@JsonProperty("data")
	private List<DataItem> data;

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

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