<%@ page import="org.kie.planner.webexamples.vehiclerouting.VrpWebAction" %>
<%
  new org.kie.planner.webexamples.vehiclerouting.VrpWebAction().terminateEarly(session);
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="REFRESH" content="0;url=<%=application.getContextPath()%>/vehiclerouting/terminated.jsp"/>
</head>
<body>
</body>
</html>
