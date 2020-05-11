package dsr.persistence;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dsr.entity.DeezerSearch.SearchResponse;
import lombok.extern.log4j.Log4j2;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;


/**
 * The type Deezer search dao.
 */
@Log4j2
public class DeezerSearchDao {

    /**
     * Gets response.
     *
     * @param myUrl the my url
     * @return the response
     */
    public SearchResponse getResponse(String myUrl) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(myUrl);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        SearchResponse searchResponse = null;
        try {
            searchResponse = mapper.readValue(response, SearchResponse.class);
        } catch(JsonProcessingException e) {
            log.info(e);
        }
        return searchResponse;
    }
}
