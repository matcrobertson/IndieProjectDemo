
<html lang="en" dir="ltr">
<%@ include file="templates/head.jsp"%>
    <body>
        <div class="container">
            <%@ include file="templates/mainNav.jsp"%>
                <h1 class="mt-5">Updates on All Artists</h1>

                <form class="centering" action="home_page" method="get">
                    <h2 class="centerText">When did you check on your artists last?</h2>
                    <input type="date" name="checkDate">
                    <button type="submit" id="enterButton" name="button">Enter</button>
                </form>

            <%@include file="templates/mainTable.jsp"%>

        </div>
    </body>
</html>
