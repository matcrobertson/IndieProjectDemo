<%@include file="head.jsp"%>

<html lang="en"><body>


<div class="container-fluid">
    <a href="index.jsp">go back</a>
    <h2>Search Results: </h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th class="col">First Name</th>
            <th class="col">Last Name</th>
            <th class="col">Age</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user" >
            <tr>
                <td class="row">${user.firstName}</td>
                <td class="row">${user.lastName}</td>
                <td class="row">${user.age}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>




</div>

</body>
</html>
