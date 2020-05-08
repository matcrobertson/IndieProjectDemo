
<html lang="en" dir="ltr">
<%@ include file="head.jsp"%>

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
            <c:if test="${error != null}">
                ${error}
                <c:remove var="error"/>
            </c:if>
            <c:set var="error" value="Oops! invalid credentials" scope="session"/>
            <a href="index.jsp" class="btn btn-dark">Go Back</a>
        </div>
    </body>
</html>
