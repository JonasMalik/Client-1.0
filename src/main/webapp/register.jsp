<%@ page contentType="text/html; charset=UTF-8" %>
<html>
    <head>
        <!--================  CSS =================================-->
        <link href="css/main.css" rel="stylesheet"/>
        <link href="css/login.css" rel="stylesheet"/>
        <link href="css/register.css" rel="stylesheet"/>
        <link href="css/validation.css" rel="stylesheet"/>
    </head>
    <body>
        <div id="mainContainer">
            <div id="registerContainer">
                <h1>Registrera dig <br></h1>
                <form id="registerForm" action="createPerson" method="post">
                    <input class="inputPos" type="text" name="firstName" value="fnamne" placeholder="Förnamn" required><br>
                    <input class="inputPos" type="text" name="lastName" value="lnamne" placeholder="Efternamn" required><br>
                    <input class="inputPos" type="number" name="age" value="20" placeholder="Ålder" required><br>
                    <input id="registerButton" class="inputPos" type="submit" value="Registrera">
                </form>
                <br>
            </div>
        </div>
    </body>
</html>