package servlets;

import services.createPerson.CreatePersonRequest;
import services.createPerson.CreatePersonResponse;
import services.createPerson.PersonService;
import services.createPerson.PersonServiceImplService;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(name = "CreatePerson",  urlPatterns = "/createPerson")
public class CreatePerson extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);

        CreatePersonRequest person = new CreatePersonRequest();
        person.setAge(Integer.parseInt(age));
        person.setFirstName(firstName);
        person.setLastName(lastName);

        PersonServiceImplService serviceImplService = new PersonServiceImplService();
        PersonService personService = serviceImplService.getPersonServiceImplPort();
        CreatePersonResponse personResponse = personService.personCreate(person);

        System.out.println(personResponse.getStatus());
        System.out.println(personResponse.getMessage());
        response.sendRedirect("/register.jsp");
    }
}
