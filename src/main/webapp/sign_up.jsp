
<html lang="en" dir="ltr">
<%@ include file="head.jsp"%>

    <body>        
        <div class="wrapper">
            <div id="greetings">
                <p>Welcome</p>
                <p>Please sign up</p>

            </div>
            <form action="#" method="post">
                <label for="userName">User Name:</label>
                <input type="text" id="userName" name="userName" value=""><br>
                <label for="password">Password</label>
                <input type="password" id="password" name="password" value=""><br>
                <label for="password">Re-enter Password</label>
                <input type="password" id="password" name="password2" value=""><br>

                <input type="button" class="btn btn-primary" name="SignUp" value="Sign Up">
            </form>
            <a href="index.jsp" class="btn btn-dark">Go Back</a>

        </div>
    </body>
</html>
