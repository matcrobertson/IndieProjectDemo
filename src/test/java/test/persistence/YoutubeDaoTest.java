package test.persistence;

import dsr.entity.Youtube.ItemsItem;
import dsr.persistence.YoutubeDao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YoutubeDaoTest {
//    @Test
    public void getTopResult() {
        String apiKey = "AIzaSyBOiirNwA9ES1-z_FGWhYuSV4TR20isGTI";
        String url = "https://www.googleapis.com/youtube/v3/search?part=snippet&maxResults=1&order=relevance&q=down%20with%20the%20sickness&key=" + apiKey;
        YoutubeDao youtubeDao = new YoutubeDao();
        String youtubeResult = "";
        for(ItemsItem youtube : youtubeDao.getResponse(url).getItems()) {
            youtubeResult = youtube.getId().getVideoId();
        }
        assertEquals(youtubeResult, "09LTT0xwdfw");

    }
}
