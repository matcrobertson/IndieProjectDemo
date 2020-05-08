
<html lang="en" dir="ltr">
<%@ include file="head.jsp"%>

    <body>        
        <div class="wrapper">
            <div id="greetings">
                <p>Welcome</p>
                <p>Please sign up</p>

            </div>
            <form action="signUp" method="get">
                <label for="userName">User Name:</label>
                <input type="text" id="userName" name="userName" value=""><br>
                <label for="password1">Password</label>
                <input type="password" id="password1" name="password1" value=""><br>
                <label for="password2">Re-enter Password</label>
                <input type="password" id="password2" name="password2" value=""><br>

            <p>${userFail}</p>
                <input type="submit" class="btn btn-primary" name="SignUp" value="Sign Up">
            </form>
            <a href="index.jsp" class="btn btn-dark">Go Back</a>

        </div>
    </body>
</html>
