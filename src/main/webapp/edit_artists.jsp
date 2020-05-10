
<html lang="en" dir="ltr">
<%@ include file="templates/head.jsp"%>

    <body>
        <div class="container">
            <div class="jumbotron">
                <img id="banner" src="images/music_banner.jpg" alt="music_banner">
            </div>
            <a href="home_page.jsp" class="btn btn-dark">Go Back</a>

            <div id="artistContainer">
                <form class="" action="addUserArtist" method="get">
                    <label for="addArtistName">Which artist would you like to add?</label><br>
                    <input type="text" id="addArtistName" name="addArtistName" placeholder="Artist Name">
                    <button type="submit" class="btn btn-primary" name="submit">Enter</button>
                </form>
            <c:if test="${addedArtistName != null}" >
                <div id="addConfirmation">
                    ${addedArtistName} has been added to your artists
                </div>
            </c:if>

            </div>
<%--            </c:if>--%>
<%--            <c:if test="${container.equals('delete')}">--%>
         <div id="artistContainer">
             <form class="" action="deleteUserArtist" method="get">
                 <label for="delArtistName">Which artist would tou like to delete?</label><br>
                 <select id="delArtistName" class="centering" name="delArtistName">
                    <c:forEach var="artist" items="${artists}">
                        <option value="${artist.artistName}">${artist.artistName}</option>
                    </c:forEach>
                 </select>
                 <button type="submit" class="btn btn-primary" name="button">Enter</button>
             </form>
             <c:if test="${deletedArtist != null}">
             <div id="deleteConfirmation">
                     ${deletedArtist} has been added to your artists
             </div>
             </c:if>

            </div>


        </div>
    </body>
</html>
