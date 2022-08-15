//package junit.tutorial.ex03.e05;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class HelloServlet extends HttpServlet {
//
//	private static final long serialVersionUID = 1L;
//	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String name = req.getParameter("name");
//		resp.getOutputStream().println("Hello " + name);
//		resp.setContentType("text/plain; charset=UTF-8");
//		resp.flushBuffer();
//	}
//
//}
