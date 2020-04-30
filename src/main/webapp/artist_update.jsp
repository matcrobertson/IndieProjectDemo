<html lang="en" dir="ltr">
<%@ include file="head.jsp"%>
    <body>
        <div class="container">
                <ul class="nav nav-tabs nav-fill bg-dark">
                      <li class="nav-item">
                          <a class="nav-link" href="home_page.jsp">Home</a>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link active" href="artist_update.jsp">Specific Artist Update</a>
                      </li>
                      <li class="nav-item">
                          <a class="nav-link" href="edit_artists.jsp">Edit My Artists</a>
                      </li>
                </ul>


                <h1 class="mt-5">Updates on Specific Artists</h1>


                    <select class="centering" name="artistName">
                        <option value="artist">artist</option>
                        <option value="">poputate</option>
                        <option value="">section</option>
                        <!-- TODO: use jstl to populate this section -->
                    </select>
                    <input type="date" name="" value="">
                    <button type="button" name="button">Enter</button>
                    <table class="table">
                      <thead class="thead-dark">
                        <tr>
                            <th scope="col">Release Date</th>
                            <th scope="col">Artist</th>
                            <th scope="col">Album</th>
                            <th scope="col">Song</th>
                            <th scope="col">Youtube Link</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <th scope="row">09/22/1979</th>
                          <td>Pink Floyd</td>
                          <td>The Wall</td>
                          <td>Another Brick in the Wall Pt.1</td>
                          <td><a target="_blank" href="http://www.youtube.com"><img src="images/youtube.png" class="youtube"></a></td>
                        </tr>
                        <tr>
                          <th scope="row">07/25/1970</th>
                          <td>Pink Floyd</td>
                          <td>Dark Side of the Moon</td>
                          <td>Comfortably Numb</td>
                          <td><a target="_blank" href="http://www.youtube.com"><img src="images/youtube.png" class="youtube"></a></td>
                        </tr>
                        <tr>
                          <th scope="row">07/01/1980</th>
                          <td>Pink Floyd</td>
                          <td>Wish You Were Here</td>
                          <td>Sweet Child O' Mine</td>
                          <td><a target="_blank" href="http://www.youtube.com"><img src="images/youtube.png" class="youtube"></a></td>
                        </tr>
                      </tbody>
                    </table>
        </div>
    </body>
</html>
