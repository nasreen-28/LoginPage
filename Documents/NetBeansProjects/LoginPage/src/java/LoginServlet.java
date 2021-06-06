import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    public static String user="nasreenbanuak";
    public static String pass="nasreen";
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("userpass");

        if(username.equals(user) && password.equals(pass))
        {
            response.sendRedirect("hello.html");
        }
        else
        {
            response.sendRedirect("error.html");
        }
    }

}