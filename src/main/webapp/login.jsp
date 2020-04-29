<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Music</title>
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
        <div class="wrapper">
            <div id="greetings">
                <p>Welcome</p>
                <p>Please sign in</p>

            </div>
            <form action="j_security_check" method="post">

                <label for="userName">User Name:</label>

                <input type="text" id="userName" name="j_username"><br>

                <label for="password">Password</label>

                <input type="password" id="password" name="j_password" value=""><br>
                <input type="submit" name="Submit" value="Log In">
                <input type="button" name="SignUp" value="Sign Up">
            </form>
            <a href="index.html" class="btn btn-dark">Go Back</a>
        </div>
    </body>
</html>
