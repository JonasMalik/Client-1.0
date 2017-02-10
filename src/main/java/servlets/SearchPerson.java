package servlets;

import services.searchPerson.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "SearchPerson",  urlPatterns = "/searchPerson")
public class SearchPerson extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String search = request.getParameter("search");

        System.out.println(search);

        SearchRequest searchRequest = new SearchRequest();
        searchRequest.setSearch(search);

        SearchServiceImplService searchServiceImplService = new SearchServiceImplService();
        SearchService searchService = searchServiceImplService.getSearchServiceImplPort();
        SearchResponse searchResponse = searchService.createSearch(searchRequest);

        System.out.println(searchResponse.getPersonList());
        session.setAttribute("p", searchResponse.getPersonList());

        response.sendRedirect("/search.jsp");
    }
}
