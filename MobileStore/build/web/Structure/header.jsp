<%-- 
    Document   : header
    Created on : Nov 12, 2019, 10:31:49 PM
    Author     : jakes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./Style/header.css" type="text/css" rel="stylesheet" />    
        <link href="./Style/reset.css" type="text/css" rel="stylesheet" />  

        <link rel="stylesheet" type="text/css" href="font/fontawesome-free-5.11.2/css/all.css">
        <link rel="icon" href="Image/Favicon.ico" type="image/x-icon"/>
        <link rel="shortcut icon" href="Image/Favicon.ico" type="image/x-icon"/>
    </head>
    <body>
        <div id="header-container">
            <div id="header-center">
                <h1>Jakes Store</h1>
                <ul>
                    <li></li>
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="ShopAll.jsp">Shop All</a></li>
                    <li><a href="MobileView.jsp">Mobile</a></li>
                    <li><a href="TabletView.jsp">Tablet</a></li>
                    <li><a href="AccessoriesView.jsp">Accessories</a></li>
                    <li><a href="ContactMe.jsp">Contact</a></li>
                        <%
                            if (session.getAttribute("sessUserName") == null) {
                        %>

                    <li><a href="login.jsp"><i class="fas fa-user"></i> Login</a></li>
                    <li><a href="register.jsp"> <i class="fas fa-user-plus"></i> Register</a></li>
                        <%
                            }
                        %>
                        <%
                            if (session.getAttribute("sessUserName") != null) {
                        %>                     
                    <li><a href="userInfo.jsp"><i class="fas fa-user"></i> <b><%=session.getAttribute("sessUserFullName")%></b></a></li>
                    <li><a href="<%=request.getContextPath()%>/LogoutServlet"><i class="fas fa-sign-out-alt"></i> Logout</a></li> 
                        <%
                            }
                        %>
                </ul>
            </div>
            <div class="sale" style="background-image: url('Image/sale.jpg');">
                <div class="banner-left">
                    <div class="HeaderImg-cart">
                        <a href="CartView">
                            <i class="fas fa-shopping-basket">  <p> Shop Cart <span class="number">
                                        <%if (request.getParameter("count") == null) {
                                                out.write("0");
                                            } else {
                                                out.write(request.getParameter("count"));
                                            }
                                        %>

                                    </span></p> </i>
                        </a>
                    </div>
                </div>

            </div>
        </div>  

    </div>

</body>
</html>
