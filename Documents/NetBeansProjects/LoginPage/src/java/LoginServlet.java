import java.io.IOException;
import java.io.PrintWriter;
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
        PrintWriter p = response.getWriter();
        response.setContentType("text/html"); 
        String username = request.getParameter("username");
        String password = request.getParameter("userpass");

        if(username.equals(user) && password.equals(pass))
        {
            p.println("Login Success");
        }
        else
        {
            p.println("Login Failed");
        }
    }

}