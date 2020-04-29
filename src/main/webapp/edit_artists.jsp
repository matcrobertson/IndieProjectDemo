<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Music</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="css/styles.css">
    <!-- <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> -->
</head>

    <body>
        <div class="container">
            <div class="jumbotron">
                <img id="banner"src="images/music_banner.jpg" alt="music_banner">
            </div>
            <a href="home_page.html" class="btn btn-dark">Go Back</a>
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
