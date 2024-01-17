package supermercato;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class reg extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Ottenere i parametri dal modulo di registrazione
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Puoi aggiungere ulteriori logiche di validazione e gestione qui

        // Esempio di output nella risposta
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Risposta Registrazione</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Registrazione Effettuata con Successo!</h2>");
        out.println("<p>Nome: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        // Non è sicuro mostrare la password così in un'applicazione reale, questo è solo un esempio
        out.println("<p>Password: " + password + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
