package entity.DeezerSearch;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResponse{

	@JsonProperty("next")
	private String next;

	@JsonProperty("total")
	private int total;

	@JsonProperty("data")
	private List<DataItem> data;

	public void setNext(String next){
		this.next = next;
	}

	public String getNext(){
		return next;
	}

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
			"SearchResponse{" + 
			"next = '" + next + '\'' + 
			",total = '" + total + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}