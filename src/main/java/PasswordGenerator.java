import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
    protected void doPost(HttpServletRequest request,   HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");


    }
}