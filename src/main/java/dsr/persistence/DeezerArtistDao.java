package dsr.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dsr.entity.DeezerArtist.ArtistResponse;
import lombok.extern.log4j.Log4j2;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

@Log4j2
public class DeezerArtistDao {
    public ArtistResponse getResponse(String myUrl) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(myUrl);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        ArtistResponse artistResponse = null;
        try {
            artistResponse = mapper.readValue(response, ArtistResponse.class);
        } catch(JsonProcessingException e) {
            log.error(e);
        }
        return artistResponse;
    }
}
