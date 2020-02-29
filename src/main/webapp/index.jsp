<!DOCTYPE html>
<html lang="en" dir="ltr">
<%@ include file="head.jsp"%>
<body>
    <div class="wrapper">
        <section>
            <article>
                <c:forEach var="people" items="users">
                    ${people.userName}
                </c:forEach>
            </article>
        </section>

    </div>
</body>
</html>