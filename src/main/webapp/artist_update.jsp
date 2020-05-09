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
            <form action="artistSearch" method="get">
                <select class="centering" name="artistName">
                    <c:forEach var="artist" items="${artists}">
                        <option value="${artist.artistName}">${artist.artistName}</option>
                    </c:forEach>
                </select>
                    <input type="date" name="artistCheckDate" value="">
                    <button type="submit" name="submit">Enter</button>
            </form>

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
                <c:forEach items="${songs}" var="song">
                    <tr>
                        <th scope="row">${song.releaseDate}</th>
                        <td>${song.artistName}</td>
                        <td>${song.albumName}</td>
                        <td>${song.songTitle}</td>
                        <td><a target="_blank" href="http://www.youtube.com"><img src="images/youtube.png" class="youtube"></a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
