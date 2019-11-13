<%-- 
    Document   : index
    Created on : Nov 12, 2019, 10:31:42 PM
    Author     : jakes
--%>


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
        <link href="./Style/contact.css" type="text/css" rel="stylesheet" />  

    </head>
    <body>
        <p style="text-align: center">Chức năng chưa hoàn thành</p>

        <%@ include file = "/Structure/header.jsp" %>

        <div class="container">
            <h1>Send me a message if you need some help, or we can talk about this project</h1> </br>
            <h1>&nbsp;</h1>
            </br>
            <h1>&nbsp;</h1>
            <form action="SendContact" method="post">
                <label for="name">Your Name</label>
                <input type="text" id="fname" name="name" placeholder="Your name.....">

                <label for="email">Email</label>
                <input type="text" id="lname" name="email" placeholder="Email....">

                <label for="country">Country</label>
                <select id="country" name="country">
                    <option value="australia">Vietnam</option>
                    <option value="canada">Canada</option>
                    <option value="usa">USA</option>
                </select>

                <label for="subject">Subject</label>
                <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px"></textarea>

               <input type="submit" value="Submit">
            </form>
            </br>
            <h1>&nbsp;</h1>
           
        </div>

        <%@ include file = "/Structure/footer.jsp" %>


    </body>



</html>


