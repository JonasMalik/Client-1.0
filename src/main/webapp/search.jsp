<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="services.searchPerson.PersonResponse" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <!--================  CSS =================================-->
    <link href="css/main.css" rel="stylesheet"/>
    <link href="css/register.css" rel="stylesheet"/>
    <link href="css/table.css" rel="stylesheet"/>
</head>
<body>
<div id="mainContainer">

    <form id="searchBox" action="searchPerson" method="POST">
        <input id="search" type="search" name="Search" placeholder="Sök.."/>
        <input id="search_button" type="submit" value="Sök"/>
    </form>
    <%
        ArrayList<PersonResponse> results = new ArrayList<>();
        results = (ArrayList<PersonResponse>) request.getSession().getAttribute("p");

        out.println("<table id='table1'>");
        out.println("<tr>");
        out.println("<th>Förnamn</th>");
        out.println("<th>Efternamn</th>");
        out.println("<th>Ålder</th>");

        if (results != null) {
            System.out.println(results.get(0).getFirstName());

            for (int i = 0; i < results.size(); i++) {
                out.println("<tr>");

                // Col fName
                out.println("<td>");
                out.println(results.get(i).getFirstName());

                // Col lName
                out.println("<td>");
                out.println(results.get(i).getLastName());

                // Col Age
                out.println("<td>");
                out.println(results.get(i).getAge());
            }
        }
    %>
    </table>
</div>
</body>
</html>