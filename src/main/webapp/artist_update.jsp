<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Music</title>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdSessionFactoryProvidern.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/styles.css">
    <!-- <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> -->
</head>
    <body>
        <div class="container">
                <ul class="nav nav-tabs nav-fill bg-dark">
                      <li class="nav-item">
                          <a class="nav-link" href="home_page.html">Home</a>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link active" href="artist_update.html">Specific Artist Update</a>
                      </li>
                      <li class="nav-item">
                          <a class="nav-link" href="edit_artists.html">Edit My Artists</a>
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
