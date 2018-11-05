<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nekisse-window
  Date: 2018-11-01
  Time: 오후 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
<p><strong>${user.name}님!! 반갑습니다. </strong>
    회원 가입 완료</p>
<p><a href="<c:url value="/main"/> ">[main2 첫 화면 이동]</a></p>


</body>
</html>
