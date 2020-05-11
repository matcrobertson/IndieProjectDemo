package dsr.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dsr.entity.Youtube.YoutubeResponse;
import lombok.extern.log4j.Log4j2;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * The type Youtube dao.
 */
@Log4j2
public class YoutubeDao {

    /**
     * Gets response.
     *
     * @param myUrl the my url
     * @return the response
     */
    public YoutubeResponse getResponse(String myUrl) {
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(myUrl);
            String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
            ObjectMapper mapper = new ObjectMapper();
            YoutubeResponse youtubeResponse = null;
            try {
                youtubeResponse = mapper.readValue(response, YoutubeResponse.class);
            } catch(JsonProcessingException e) {
                log.error(e);
            }
            return youtubeResponse;
        }
}
