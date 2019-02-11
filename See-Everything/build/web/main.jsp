<%-- 
    Document   : success
    Created on : 27-Jan-2019, 12:05:10
    Author     : flemi
--%>
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>       
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">   
        <link rel="shortcut icon" type="image/png" href="img/SJCfavicon.png">
        <link rel="stylesheet" type="text/css" href="StyleSheet.css" />
        <title>See Everything Login | St John's</title>
        <script src="https://apis.google.com/js/platform.js" async defer></script>
        <meta name="google-signin-client_id" content="1056145859345-trlkgoivq1slfk4kmjbvpo0vgfuj85il.apps.googleusercontent.com">
            <script type="text/javascript">
                function SignedIn(googleUser) {
                    // window.location.href='success.jsp';
                    var profile = googleUser.getBasicProfile();
                    var imagurl=profile.getImageUrl();
                    var name=profile.getName();
                    document.getElementById("myImg").src = imagurl;
                    document.getElementById("name").innerHTML = name;			  	   
		}
            </script>
            <script>
                function myFunction() {
                gapi.auth2.getAuthInstance().disconnect();
                location.reload(true);                                              /* Reloads to sign out the user */
                location.replace("http://localhost:8080/See-Everything/login.jsp"); /* Redirects to login page */
                }
            </script>
    </head>
    <body>
        <h1 align="center" ><font face="Arial" color="white">See Everything | St John's College</font></h1>
            <div id = "hidden" class="GSignInCentered">
                <div class="g-signin2" data-onsuccess="SignedIn"></div>               
            </div>
            <div class="top-left-GSignOut">
                <button class="button" onclick="myFunction()"><span>Sign Out</button>  
            </div>
            <div id = "profile-details">
            <img id="myImg" style="width:70px;height:70px;">
                <br> 
            <p id="name"></p>  
            </div>
        <footer>
            <center>
                <div id="bottom-left-info">
                    <%
                    String name = (String)request.getParameter("name");
                    String email = (String)request.getParameter("email");
                    %>
                    <%=name %>
                    <br>
                    <%=email %> 
            </div>
        </center>
        </footer>
    </body>
</html>
            
