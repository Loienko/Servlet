package net.ukr.dreamsicle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Yura on 01.05.2017.
 */
@WebServlet("/question")
public class QuestionServlet extends HttpServlet {

    static User user = new User();

    List<User> users = new ArrayList<>();



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        user.setName((String) req.getAttribute("name"));
        user.setSurname((String) req.getAttribute("surname"));
        user.setAge((Integer) req.getAttribute("age"));

        user.setQuestions((Set<Question>) req.getAttribute("question1"));
        user.setQuestions((Set<Question>) req.getAttribute("question2"));

        users.add(user);

        req.setAttribute("userLst", users);

        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
