<%-- 
    Document   : index
    Created on : 17-nov-2016, 17:11:36
    Author     : alego
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <h2>Auto Refresh JSF</h2>
            <%
               response.setIntHeader("Refresh", 1);

               Calendar calendar = new GregorianCalendar();
               String am_pm;

               int h = calendar.get(Calendar.HOUR);
               int m = calendar.get(Calendar.MINUTE);
               int s = calendar.get(Calendar.SECOND);

               if(calendar.get(Calendar.AM_PM) == 0){
                  am_pm = "AM";
               }else{
                  am_pm = "PM";
               }
               
               out.println( h +":"+ m +":"+ s  +" "+ am_pm );
            %>
        </body>
    </html>
</f:view>
