<%-- 
    Document   : SushiDetail
    Created on : Mar 12, 2020, 11:48:05 AM
    Author     : thinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShuShi</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"/>
            <div class="content">
                <div class="left">
                    <div class="sushi">
                        <div class="sushi_title">${sushi.name}</div>
                        <div class="sushi_detail">
                            <div class="sushi_image">
                                <img src="${imagePath}${sushi.image}" alt=""/>
                            </div>
                            ${sushi.detailDes}
                        </div>
                        <div class="sushi_price">
                            Price: ${sushi.price} $
                        </div>
                    </div>
                </div>
                <jsp:include page="Right.jsp"/>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
    <script>
        window.history.pushState("", "", 'DetailControl');
    </script>
</html>
