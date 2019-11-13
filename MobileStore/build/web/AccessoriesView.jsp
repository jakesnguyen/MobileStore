<%-- 
    Document   : index
    Created on : Nov 12, 2019, 10:31:42 PM
    Author     : jakes
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="Model.Devices"%>
<%@page import="DAO.DevicesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jakes Store - Mobile View</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
        <link rel="icon" href="Image/Favicon.ico" type="image/x-icon"/>
        <link rel="shortcut icon" href="Image/Favicon.ico" type="image/x-icon"/>
        <link href="./Style/main.css" type="text/css" rel="stylesheet" />    
        <link href="./Style/reset.css" type="text/css" rel="stylesheet" />  


    </head>
    <body>
        <%@ include file = "/Structure/header.jsp" %>
        <%            
            DevicesDAO ddao = new DevicesDAO();
            ArrayList<Devices> dList = ddao.getAllAccessories();
        %>  
        <div class="body-container assessories">
            <div class="body-center assessories">
                <div class="filter">
                    <h1>Mobile View</h1>

                </div>


                <div class="devices-container assessories">
                    <%
            for(int i = 0 ; i < dList.size() ; i ++){
                %>
                <div class="grid-item">
                    <div class="grid-item-hover"><a href="DevicesDetail.jsp">View Detail</a></div>
                    <div class="grid-item-text"><%=dList.get(i).getDevicesName()%></div>
                        <img src="<%=dList.get(i).getImg1()%>" >
                        <div class="grid-item-text">$<%=dList.get(i).getPrice()%></div>
                       
                    </div>
                <%
            }
          
            %>
                    
               

                </div>

            </div>
        </div>


        <%@ include file = "/Structure/footer.jsp" %>


    </body>



</html>
