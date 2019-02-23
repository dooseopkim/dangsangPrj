package aboutme;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String currentTime = getTime();
		StringBuilder sb = new StringBuilder();
		PrintWriter out = response.getWriter();
		sb.append("<html>")
		.append("<head>")
		.append("<title>About Me</title>")
		.append("<link rel=\"stylesheet\" href=\"./resources/css/custom.css\" />")
		.append("</head>")
		.append("<body>")
		.append("<a id=\"go-first\"href=\"/aboutme/index.html\">메인으로..</a>")
		.append("<div id=\"today\">현재시간  : " + currentTime + "</div>")
		.append("</body>")
		.append("</html>");
		out.println(sb.toString());
	}
	public String getTime() {
		LocalDateTime localDateTime =  LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		return localDateTime.format(format);
	}
}
