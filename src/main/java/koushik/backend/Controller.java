package koushik.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class serv
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getParameter("name"));
		response.getWriter().println(request.getParameter("gender"));
		PrintWriter out = response.getWriter();
		String [] languages =request.getParameterValues("language");
		if(languages!=null){
			for(int i=0;i<languages.length;i++){
				//out.println("<br>");
				out.println(languages[i]);
			}
			}
		else {
			out.println("Non Selected");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getParameter("name"));
		response.getWriter().println(request.getParameter("gender"));
		PrintWriter out = response.getWriter();
		String [] languages =request.getParameterValues("language");
		if(languages!=null){
			for(int i=0;i<languages.length;i++){
				out.println(languages[i]);
			}
			}
		else {
			out.println("Non Selected");
		}
	}

}
