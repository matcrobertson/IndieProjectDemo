package dsr.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dsr.entity.DeezerAlbum.AlbumResponse;

import lombok.extern.log4j.Log4j2;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

@Log4j2
public class DeezerAlbumDao {

        public AlbumResponse getResponse(String myUrl) {
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(myUrl);
            String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
            ObjectMapper mapper = new ObjectMapper();
            AlbumResponse albumResponse = null;
            try {
                albumResponse = mapper.readValue(response, AlbumResponse.class);
            } catch(JsonProcessingException e) {
                log.error(e);
            }
            return albumResponse;
        }
}
