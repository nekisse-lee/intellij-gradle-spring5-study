<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nekisse
  Date: 2018. 10. 30.
  Time: 오후 5:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원 가입</title>
</head>
<body>

<h2>회원 정보 입력</h2>
<form:form action="step3" modelAttribute="registerRequest">
    <p>
        <label>이메일:<br/>
            <form:input path="email"/>
        </label>
    </p>
    <p>
        <label>이름:<br/>
            <form:input path="name"/>
        </label>
    </p>
    <p>
        <label>비밀번호:<br/>
            <form:input path="password"/>
        </label>
    </p>
    <p>
        <label>비밀번호 확인:<br/>
            <form:input path="confirmPassword"/>
        </label>
    </p>
    <input type="submit" value="가입 완료"/>

</form:form>

</body>
</html>
