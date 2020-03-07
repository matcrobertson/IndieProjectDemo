<!DOCTYPE html>
<html lang="en" dir="ltr">
<%@ include file="head.jsp"%>
    <body>
        <div class="logon">
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

        </div>
    </body>
</html>
