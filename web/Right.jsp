<%-- 
    Document   : Right
    Created on : Mar 12, 2020, 11:41:05 AM
    Author     : thinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/right.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="right">
            <div class="share_box">
                <div class="share_header">Share this page</div>
                <div class="share_content">
                    <c:forEach items="${share}" var="i">
                        <div class="link">
                        <a href="#">
                            <img src="${imagePath}${i.icon}" alt=""/>
                            Share on ${i.socialNetwork}
                        </a>
                    </div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </body>
</html>
