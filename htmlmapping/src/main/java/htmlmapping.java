

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class htmlmapping
 */
public class htmlmapping extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public htmlmapping() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void ProcessRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("Text/Html");
    	PrintWriter pw = response.getWriter();
//    	pw.println("<B>WELCOME TO http SERVLET</B>");
    	String name=request.getParameter("uname");
    	String age=request.getParameter("uage");
    	String gender=request.getParameter("ugender");
    	String course=request.getParameter("ucourse");
    	String checkbox=request.getParameter("ucheckbox");
		
    	if(checkbox.equals("ucheckbox")) {
    		pw.println("<p>NAME is " + name );
    		pw.println("<p>AGE is " + age );
    		pw.println("<p>GENDER is " + gender );
    		pw.println("<p>COURSE is " + course );
    		
    	}
    	
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ProcessRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProcessRequest(request,response);
	}

}
