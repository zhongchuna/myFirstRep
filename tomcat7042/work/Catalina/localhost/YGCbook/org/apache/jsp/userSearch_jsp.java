/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2021-12-26 03:33:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import co.jp.netwisdom.entity.UserInfo;

public final class userSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <title> 用户检索页面</title>\r\n");
      out.write("      ");
 List<UserInfo> list = (List<UserInfo>)request.getAttribute("list");
      out.write("\r\n");
      out.write(" \t   <style>\r\n");
      out.write("\t    #username{\r\n");
      out.write("\t   border:1px solid black;\r\n");
      out.write("       width:180px;\r\n");
      out.write("       height:30px;\r\n");
      out.write("       border-radius:25px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#password{\r\n");
      out.write("\t   border:1px solid black;\r\n");
      out.write("       width:180px;\r\n");
      out.write("       height:30px;\r\n");
      out.write("       border-radius:25px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#textarea{\r\n");
      out.write("\t   border:1px solid black;\r\n");
      out.write("       width:180px;\r\n");
      out.write("       height:30px;\r\n");
      out.write("       border-radius:25px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\tinput{\r\n");
      out.write("\t\tbackground-color: pink;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t<script language=\"javascript\" type=\"text/javascript\" >\r\n");
      out.write("\t\tfunction f1(e){\r\n");
      out.write("\t\te.style.backgroundColor = \"4169E1\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"resources/images/test.jpg\" style=\"text-align:center\">\r\n");
      out.write("\t<form action=\"userSearch\">\r\n");
      out.write("\r\n");
      out.write("\t              姓名<input type=\"text\" id=\"username\" name=\"username\" ><br>\r\n");
      out.write("\t               性别<input type=\"radio\"  name=\"sex\" value=0>男  \r\n");
      out.write("\t        <input type=\"radio\"  name=\"sex\" value=1>女<br>\r\n");
      out.write("\t              专业<select name=\"major\">\r\n");
      out.write("\t           <option value=\"\"></option>\r\n");
      out.write("\t           <option value=\"0\">软件工程</option>\r\n");
      out.write("\t           <option value=\"1\">英语</option>\r\n");
      out.write("\t           <option value=\"2\">数学</option>\r\n");
      out.write("\t        </select><br>            \r\n");
      out.write("\t      \r\n");
      out.write("\t        <input type=\"submit\"value=\"检索\" onclick=\"f1(this)\"></input>\r\n");
      out.write("\t        <input type=\"reset\" value=\"重置\"  onclick=\"f1(this)\"></input>  <br>\r\n");
      out.write("\t        检索一览\r\n");
      out.write("\t  </form>   \r\n");
      out.write("\t   \t<table border=\"1\" cellpadding=\"3\" cellspacing=\"0\" style=\"width: 60%;margin:auto\" >\r\n");
      out.write("\t   \t\t<tr>\r\n");
      out.write("\t   \t\t\t<th>用户名</th>\r\n");
      out.write("\t   \t\t\t<th>性别</th>\r\n");
      out.write("\t   \t\t\t<th>专业</th>\r\n");
      out.write("\t   \t\t\t<th>简介</th>\r\n");
      out.write("\t   \t\t</tr>\r\n");
      out.write("\t   \t\t\r\n");
      out.write("\t   \t\t");
if(list != null){
      out.write("\r\n");
      out.write("\t   \t\t\t");
for(UserInfo userinfo : list ){
      out.write("\r\n");
      out.write("\t   \t\t\t\r\n");
      out.write("\t   \t\t\t<tr>\r\n");
      out.write("\t   \t\t\t\t<td>");
      out.print(userinfo.getUsername());
      out.write("</td>\r\n");
      out.write("\t   \t\t\t\t<td>");
      out.print(userinfo.getSex().replace("0","男").replace("1","女"));
      out.write("</td>\r\n");
      out.write("\t   \t\t\t\t<td>");
      out.print(userinfo.getMajor().replace("0","软件工程").replace("1","英语").replace("2","数学"));
      out.write("</td>\r\n");
      out.write("\t   \t\t\t\t<td>");
      out.print(userinfo.getIntro());
      out.write("</td>   \t\t\t\r\n");
      out.write("\t   \t        </tr>\t   \t\t\t\r\n");
      out.write("\t   \t\t\t ");
}
      out.write("\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t   \t\t\r\n");
      out.write("\t   \t\t\r\n");
      out.write("\t   \t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
