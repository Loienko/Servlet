package net.ukr.dreamsicle;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Yura on 04.05.2017.
 */
public class AnketaServlet extends HttpServlet {

    static String Name;
    static String Surname;
    static int Age;
    public static int q1Yes = 0;
    public static int q1No = 0;
    public static int q2Yes = 0;
    public static int q2No = 0;

    final String TEMPLATE = "<html>" +"<head><title>dreamsicle.ukr.net</title></head>" +
            "<body><h1>%s</h1></body></html>";

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String age = request.getParameter("age");
        String question1 = request.getParameter("question1");
        String question2 = request.getParameter("question2");

        if (question1.equals("yes"))
            q1Yes++;
        if (question1.equals("no"))
            q1No++;

        if (question2.equals("yes"))
            q2Yes++;
        if (question2.equals("no"))
            q2No++;

        HttpSession session = request.getSession(true);
        session.setAttribute("user", name+" "+ surname + " " + age);

        /*String result = "<p> Question 1: Yes = " + q1Yes + ", No" + q1No;
        result += "<p> Question 2: Yes = " + q2Yes + ", No" + q2No;

        response.getWriter().println(String.format(TEMPLATE, result));*/
        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String a = request.getParameter("a");
        HttpSession session = request.getSession(false);

        if ("exit".equals(a) && (session != null))
            session.removeAttribute("user");

        response.sendRedirect("index.jsp");
    }

}
