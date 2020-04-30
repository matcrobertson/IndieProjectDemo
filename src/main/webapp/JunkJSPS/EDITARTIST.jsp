
<html lang="en" dir="ltr">
<%@ include file="../head.jsp"%>
<body>
<div class="wrapper">
    <section>
        steven
        <article>
                            <c:forEach var="people" items="${users}">
                                ${people.userName}
                            </c:forEach>
        </article>
        segal
    </section>

</div>
</body>
</html>
