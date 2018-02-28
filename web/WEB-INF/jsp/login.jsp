<%--
  Created by IntelliJ IDEA.
  User: Yassine
  Date: 12/01/2018
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="fr.cesi.qcm_backend.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="fr">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link rel="stylesheet" href="vendor/foudation/css/foundation.css">
    <title>Document</title>
</head>
<body>


<h3>Connexion</h3>
<form method="post" >
    <div class="grid-container">
        <div class="grid-x grid-padding-x">
            <div class="medium-6 cell">
                <label>Login
                    <input type="text" name="login" placeholder="Login">
                </label>
            </div>
            <div class="medium-6 cell">
                <label>Password
                    <input type="password" name="password" placeholder="">
                </label>
            </div>
        </div>
        <input type="submit" value="Valider" class="success button">
    </div>
</form>

</body>
</html>