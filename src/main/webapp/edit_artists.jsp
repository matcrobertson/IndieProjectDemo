
<html lang="en" dir="ltr">
<%@ include file="head.jsp"%>

    <body>
        <div class="container">
            <div class="jumbotron">
                <img id="banner"src="images/music_banner.jpg" alt="music_banner">
            </div>
            <a href="home_page.jsp" class="btn btn-dark">Go Back</a>
            <!-- This needs to get swapped around in JSTL -->
            <div id="artistContainer">
                <form class="" action="#" method="post">
                    <label for="addArtistName">Which artist would tou like to add?</label><br>
                    <input type="text" id="addArtistName" name="artistName" placeholder="Artist Name">
                    <button type="button" class="btn btn-primary" name="button">Enter</button>
                </form>
                <div id="confirmation">
                    ___________ has been added to your artists
                </div>
            </div>
            <div id="artistContainer">
                <form class="" action="#" method="post">
                    <label for="delArtistName">Which artist would tou like to delete?</label><br>
                    <select id="delArtistName" class="centering" name="artistName">
                        <option value="artist">artist</option>
                        <option value="">poputate</option>
                        <option value="">section</option>
                        <!-- TODO: use jstl to populate this section -->
                    </select>
                    <button type="button" class="btn btn-primary" name="button">Enter</button>
                </form>
                <div id="confirmation">
                    ___________ has been added to your artists
                </div>
            </div>


        </div>
    </body>
</html>
