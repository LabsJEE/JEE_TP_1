import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTraitement
 */
@WebServlet("/ServletTraitement")
public class ServletTraitement extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTraitement() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
    }

    /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String nom = request.getParameter("nom");
	String prenom = request.getParameter("prenom");
	String sexe=request.getParameter("sexe");
	String occ=request.getParameter("occ");
	String [] loisir = request.getParameterValues("loisir");
	PrintWriter out=response.getWriter();
	out.println("Bonjour "+(sexe.equals("M")? "Monsieur":"Madame")+" "+prenom+" "+nom);	
	out.println("<br/> Vous êtes "+occ+"</br>");
	try {
            if(loisir.length!=0) {
            	out.println("Vos loisirs sont: <br/>");    
            	for(String e : loisir) {
                    out.print(e+"<br/>");
                }
            }
        }
        catch(NullPointerException e) {
            out.println("Vous n'avez pas de loisir");
        }
    }
}