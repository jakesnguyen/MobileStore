<%-- 
    Document   : userInfo
    Created on : Nov 13, 2019, 2:34:23 PM
    Author     : jakes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Jakes Store - User Information</title>
        <link href="./Style/main.css" type="text/css" rel="stylesheet" />    
        <link href="./Style/reset.css" type="text/css" rel="stylesheet" />  
        <script src="Javascript/myJS.js"></script>
    </head>
    <body>
        <%@ include file = "/Structure/header.jsp" %>

        <div class="userInfo-container">
            <div class="userInfo-center">
                <div class="userInfo-left">
                    <ul>

                        <li onclick="openUser()">User Information</li>
                        <li onclick="openChangepassword()">Change Password</li>
                        <li onclick="openHistory()">Buying History</li>
                    </ul>
                </div>
                <div class="userInfo-right">
                    <div id="userInfo" class="userInfo-show">
                        <table align="center" width="670">

                            <tr height="50">

                                <td width="155">User Name</td>
                                <td width="500"><input type="text" value="<%=session.getAttribute("sessUserName")%>" style="width: 500px;"> </td>
                            </tr>

                            <tr height="50">

                                <td width="155">Email</td>
                                <td width="500"><input type="text" value="<%=session.getAttribute("sessEmail")%>"  style="width: 500px;"></td>
                            </tr>

                            <tr height="50">

                                <td width="155">User Full Name</td>
                                <td width="500"><input type="text" value="<%=session.getAttribute("sessUserFullName")%>" name="email" style="width: 500px;"></td>
                            </tr>

                            <tr height="50">

                                <td width="155">Address</td>
                                <td width="500"><input type="text" value="<%=session.getAttribute("sessAddress")%>" style="width: 500px;"></td>
                            </tr>

                            <tr height="50">

                                <td width="155">Phone</td>
                                <td width="500"><input type="text" value="<%=session.getAttribute("sessPhone")%>" style="width: 500px;"></td>
                            </tr>
                        </table>
                    </div>

                    <div id="changePassword" class="userInfo-hide ">
                        <form action="ChangePassword" method="post">
                            <table align="center" width="670">

                                <tr height="50">

                                    <td width="155">Enter Old Password</td>
                                    <td width="500"><input type="text" name="oldPassword" style="width: 500px;"> </td>
                                </tr>

                                <tr height="50">

                                    <td width="155">Enter New Password</td>
                                    <td width="500"><input type="text" name="newPassword" style="width: 500px;"></td>
                                </tr>

                                <tr height="50">

                                    <td width="155">Confirm New Password</td>
                                    <td width="500"><input type="text"  name="confirmNewPassword" style="width: 500px;"></td>
                                </tr>


                                <tr height="50"><td><input type="submit" value="Change Password" name="update"></td><td style="display:none"><input type="text" value="<%=session.getAttribute("sessUserName")%>" name="userName" style="width: 500px;"></td></tr>

                                <tr>
                                    <td width="155"></td>
                                    <td width="500" style="color:red;">${MESS2}</td></tr>

                            </table>
                        </form>

                    </div>

                    <div id="buyingHistory" class="userInfo-hide ">

                        <li>Buying History</li>
                    </div>
                </div>
            </div>
        </div>


        <%@ include file = "/Structure/footer.jsp" %>
    </body>

</html>
