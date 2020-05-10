<html lang="en" dir="ltr">
<%@ include file="templates/head.jsp"%>
    <body>
        <div class="container">
            <%@include file="templates/mainNav.jsp"%>


                <h1 class="mt-5">Updates on Specific Artists</h1>
            <form action="artistSearch" method="get">
                <select class="centering" name="artistName">
                    <c:forEach var="artist" items="${artists}">
                        <option value="${artist.artistName}">${artist.artistName}</option>
                    </c:forEach>
                </select>
                    <input type="date" name="artistCheckDate" value="">
                    <button type="submit" name="submit">Enter</button>
            </form>
            <%@include file="templates/mainTable.jsp"%>

        </div>
    </body>
</html>
