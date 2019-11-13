<%-- 
    Document   : index
    Created on : Nov 12, 2019, 10:31:42 PM
    Author     : jakes
--%>


<%@page import="Model.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
        <link rel="icon" href="Image/Favicon.ico" type="image/x-icon"/>
        <link rel="shortcut icon" href="Image/Favicon.ico" type="image/x-icon"/>
        <link href="./Style/main.css" type="text/css" rel="stylesheet" />    
        <link href="./Style/reset.css" type="text/css" rel="stylesheet" />  


    </head>
    <body>
        <%
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
        %>
        <jsp:include page="/Structure/header.jsp" >
            <jsp:param name="count" value = "<%=cart.countItems()%>" />
            <jsp:param name="prePage" value = "productPage" />
        </jsp:include>



        <%@ include file = "/Structure/footer.jsp" %>


    </body>



</html>
