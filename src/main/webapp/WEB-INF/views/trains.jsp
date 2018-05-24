<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 22.05.2018
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.*" %>
<%@ page import="model.entity.Trains" %>
<%@ page import="java.io.PrintWriter" %>
<html>
<head>
    <title>Trains</title>
</head>
<body>
<h4 align="center">Доступні потяги</h4>
<p>
    <%! List<Trains> trains;%>

     <%! String getTrains(List<Trains> trains) {
         StringBuilder sb = new StringBuilder();
         for (Trains s : trains){
            sb.append("<br> Потяг № "+s.getIdTrain());
            sb.append("Рушає зі станції : "+s.getRoute().getStartStation());
            sb.append(s.getRoute().getEndStation());
            sb.append(s.getRoute().getTotalDistance());
            sb.append(s.getDate());
            sb.append(s.getDepartureTime());
        }
        return sb.toString();
        }
%>
            <%=
    getTrains((List<Trains>)request.getAttribute("trains"))%>

</body>
</html>
