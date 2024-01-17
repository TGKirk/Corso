<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Registrazione</title>
</head>
<body>
<p>Sei entrato nella registrazione</p>
<c:forEach items="Clienti" var="cliente"></c:forEach>
</body>
</html>