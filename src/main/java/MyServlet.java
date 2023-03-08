import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// http://localhost:8080/MyServlet/my_servlet
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().printf("<html><body>");
        resp.getWriter().printf("<h1>Hello,GeekBrains!!!!</h1>");
        resp.getWriter().printf("<h2>Here we go</h2>");
        resp.getWriter().printf("</body></html>");
    }

    @Override
    public void init() throws ServletException {

    }
}