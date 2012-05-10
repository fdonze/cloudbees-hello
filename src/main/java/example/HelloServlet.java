package example;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TimeZone;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Hello world!
 *
 */
public class HelloServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String hello = "World";
        out.println("<h1>Hello " + hello + "</h1>");
        out.print("<p>local address: " + req.getLocalAddr() + "</p>");
        out.print("<p>remote address: " + req.getRemoteAddr() + "</p>");
        out.print("<p>server name: " + req.getServerName() + "</p>");
        out.close();
    }
}
