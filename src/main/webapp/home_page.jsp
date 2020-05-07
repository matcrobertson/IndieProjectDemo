
<html lang="en" dir="ltr">
<%@ include file="head.jsp"%>
    <body>
        <div class="container">
                <ul class="nav nav-tabs nav-fill bg-dark">
                      <li class="nav-item">
                          <a class="nav-link active" href="home_page.jsp">Home(signed in)</a>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link" href="artist_update.jsp">Specific Artist Update</a>
                      </li>
                      <li class="nav-item">
                          <a class="nav-link" href="edit_artists.jsp">Edit My Artists</a>
                      </li>
                </ul>


                <h1 class="mt-5">Updates on All Artists</h1>

                <form class="centering" action="home_page" method="get">
                    <h2 class="centerText">When did you check on your artists last?</h2>
                    <input type="date" name="checkDate">
                    <button type="submit" id="enterButton" name="button">Enter</button>
                </form>

                    <!-- TODO: use jstl to populate this section -->
            <c:forEach items="${songs}" var="song">
                <tr>
                    <th scope="row">song.data</th>
                    <td>Pink Floyd</td>
                    <td>The Wall</td>
                    <td>Another Brick in the Wall Pt.1</td>
                    <td><a target="_blank" href="http://www.youtube.com"><img src="images/youtube.png" class="youtube"></a></td>
                </tr>
            </c:forEach>
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
                          <td>Guns N' Roses</td>
                          <td>Appetite for Destruction</td>
                          <td>Sweet Child O' Mine</td>
                          <td><a target="_blank" href="http://www.youtube.com"><img src="images/youtube.png" class="youtube"></a></td>
                        </tr>
                      </tbody>
                    </table>

        </div>
    </body>
</html>
