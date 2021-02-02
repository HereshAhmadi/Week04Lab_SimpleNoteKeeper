package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            if (request.getParameter("edit").equals("")) {
                getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            }

        } catch (Exception e) {
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            BufferedReader bReader = new BufferedReader(new FileReader(new File(path)));

            String title = bReader.readLine();
            String content = bReader.readLine();

            Note note = new Note(title, content);

            getServletContext().setAttribute("note", note);
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pWriter = new PrintWriter(new BufferedWriter(new FileWriter(path,false)));

        String title = request.getParameter("title");
        String content = request.getParameter("content");

        Note note = new Note(title, content);

        getServletContext().setAttribute("note", note);
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

}
