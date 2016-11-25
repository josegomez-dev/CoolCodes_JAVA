<%-- 
    Document   : index
    Created on : 17-nov-2016, 16:51:35
    Author     : alego
--%>

<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            
            <center>
                
                <h1>c Tag test</h1>

                <c:set var="active" scope="session" value="${ false }"/>
                <c:set var="salary" scope="session" value="${ 3500 }"/>
                <c:if test="${ !(active) }">
                    <p>
                        Var value is: <c:out value="${ salary }"/>
                    <p>
                </c:if>
                        
                <c:forEach var="counter" begin="0" end="9" step="1" >
                    <c:out value="${ counter+1 }"/></br>
                    <% System.out.println( "counter: " + pageContext.findAttribute("counter") ); %>
                </c:forEach>        
                
            </center>
                
        </body>
    </html>
</f:view>
