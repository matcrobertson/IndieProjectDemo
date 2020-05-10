package test.persistence;


import com.fasterxml.jackson.databind.ObjectMapper;
import dsr.entity.DeezerArtist.ArtistResponse;
import dsr.entity.DeezerSearch.DataItem;
import dsr.persistence.DeezerSearchDao;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@Log4j2
public class TestServiceClient {

    @Test
    public void deezerArtistJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.deezer.com/artist/27/albums");

        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        ArtistResponse deezerArtist = mapper.readValue(response, ArtistResponse.class);
        String expectedUrl = "https://api.deezer.com/album/6575789/tracks";
        assertEquals(expectedUrl, deezerArtist.getData().get(0).getTracklist());

    }



    @Test
    public void deezerSearchArtistJSON() {
        DeezerSearchDao searchDao = new DeezerSearchDao();
        String url = "https://api.deezer.com/search/artist?q=eminem";
        String returnedValue = null;
        for(DataItem item : searchDao.getResponse(url).getData()) {
            if(returnedValue != null) {
                break;
            }
            returnedValue = item.getId();
        }
        assertEquals("13", returnedValue);

    }



    @Test
    public void deezerSearchResponseJSON() {
        DeezerSearchDao searchDao = new DeezerSearchDao();
        String url = "https://api.deezer.com/search/artist?q=eminem";
        assertNotNull(searchDao.getResponse(url).getData());

    }
}
