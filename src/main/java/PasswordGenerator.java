import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;

@WebServlet(name = "PasswordGenerator", value = "/password")
public class PasswordGenerator extends HttpServlet {
    private static SecureRandom random = new SecureRandom();
    private static String LETTERS_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String letters = "abcdefghijklmnopqrstuvwxyz";
    private static String numbers = "0123456789";
    private static String specialChar = "!@#$%^&*_=+-/";
    private static int lenght;
    private static String result = "";


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        lenght = Integer.valueOf(request.getParameter("passSize"));

        if (request.getParameter("passKind").equals("letters")) {
            String dic = letters + LETTERS_CAPS;
            for (int i = 0; i < lenght; i++) {
                int index = random.nextInt(dic.length());
                result += dic.charAt(index);
            }
        }

            out.println("<center><h1>Twoje hasło: " + result + "</h1></center>");
            result = "";
            out.println("");
            out.println("");
            out.println("");
            out.println("<a href=\"index.jsp\">back menu</a>");


    }
}