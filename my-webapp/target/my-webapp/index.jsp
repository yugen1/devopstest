<%@ page import="test.Test" %>
<html>
<body>
<h2>Hello World! This is the Test</h2>
<%
Test reh = new Test();
String result = reh.getGreeting("Yugender");
%>
<%= result %>
</body>
</html>
