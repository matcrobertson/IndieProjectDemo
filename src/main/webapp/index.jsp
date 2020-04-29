<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Music</title>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
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
                              <a class="nav-link active" href="index.html">Home</a>
                          </li>
                          <li class="nav-item">
                            <a class="nav-link" href="login.html">Log In</a>
                          </li>
                          <li class="nav-item">
                              <a class="nav-link" href="sign_up.html">Sign Up</a>
                          </li>
                    </ul>


                    <h1 class="mt-5">Welcome to {fakeName}!</h1>
                    <div class="row correctWidth mx-auto">
                        <div class="col">
                            &emsp; Do you find it hard to keep up with your favorite artists?
                            Try {fakeName} today! Tell us what artists you like, when you were
                            up to speed on their content, and we will give you back all of music that is
                            new to you. You can also get updates on just one of your artists if you would like.
                             If you are up to speed on your artists then it will tell you that as well.
                        </div>
                    </div>
                    <section class="correctWidth mx-auto">
                        <h2 class="centerText">
                            Here is a what it will look like
                        </h2>
                        <img src="images/sample_data.png" style="width: 100%; margin-bottom: 2em;" alt="sample_data">
                    </section>
            </div>

    </body>
</html>
