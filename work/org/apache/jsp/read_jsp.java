package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import CasleyTalk.Topic;
import java.util.List;

public final class read_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h2>CasleyTalk</h2>\r\n");
      out.write("\r\n");
      out.write("<a href=\"read\">再読み込み</a>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<form action=\"post\" method=\"Post\">\r\n");
      out.write("\tタイトル<input type=\"text\" name=\"title\" size=\"40\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<textarea name=\"content\" rows=\"5\" cols=\"40\"></textarea>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<input type=\"submit\" value=\"投稿\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");

List topics = (List)request.getAttribute("topics");
if(topics != null){
	for(int i = topics.size()-1; i >= 0; i--){
		Topic topic = (Topic)topics.get(i);

      out.write("\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\tタイトル ");
      out.print(topic.getTitle() );
      out.write("\r\n");
      out.write("\t\t(");
      out.print(topic.getPostDate());
      out.write(")\r\n");
      out.write("\t\t<pre>");
      out.print(topic.getContent() );
      out.write("</pre>\r\n");

	}
}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
