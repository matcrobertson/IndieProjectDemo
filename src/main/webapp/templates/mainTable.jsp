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
            <td><a target="_blank" href="https://www.youtube.com/watch?v=${song.videoId}"><img src="images/youtube.png" class="youtube"></a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<c:if test="${songs.size() == 0}">
    <h2>You are all caught up! :)</h2>
</c:if>