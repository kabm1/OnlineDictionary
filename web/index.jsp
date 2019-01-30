<%-- 
    Document   : index
    Created on : Dec 17, 2018, 10:33:37 PM
    Author     : Kab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Dictionary</title>
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js" type="text/javascript"></script>
       <script src="onlinedict.js" type="text/javascript"></script>
      <link rel="stylesheet" type="text/css" href="onlinedict.css">
    </head>
    <body>
        <div id="whole">
            <h1>ONLINE DICTIONARY </h1>
       <div id="searching">
           <input id="target" type="text" placeholder="Enter Text"> 
               <button id="lookup">LookUp </button>
        </div>
        <div id="defResult"></div>
            <div id="loader">
                 <img src ="loader.gif" alt="loader gif" />
            </div>
        </div>
        <div id="w3c">
    <a href="https://webster.cs.washington.edu/validate-html.php">
        <img src="https://webster.cs.washington.edu/w3c-html.png" alt="Valid HTML" /></a>
    <a href="https://webster.cs.washington.edu/validate-css.php">
        <img src="https://webster.cs.washington.edu/w3c-css.png" alt="Valid CSS" /></a>
    <a href="https://webster.cs.washington.edu/jslint/?referer">
        <img src="https://webster.cs.washington.edu/w3c-js.png" alt="Valid JS" /></a>
</div>
    </body>
</html>
