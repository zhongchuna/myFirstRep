/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2021-12-20 01:41:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cn.key.entity.BookType;
import cn.key.dao.BookTypeDAO;
import cn.key.entity.BookInfo;
import cn.key.gwc.Gwc;
import cn.key.entity.CustomerInfo;

public final class fgLeft_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=gbk");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" text=\"#000000\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" >\r\n");
      out.write("<table width=\"770\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("\t");
 CustomerInfo customer =  (CustomerInfo)session.getAttribute("customer"); 
      out.write("\r\n");
      out.write("  <tr> \r\n");
      out.write("    <td rowspan=\"2\" width=\"152\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/FindBookTypeServlet\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/logo.gif\" width=\"152\" height=\"84\" alt=\"云工厂网上书店\" border=\"0\"></a></td>\r\n");
      out.write("    <td>\r\n");
      out.write("      <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"53\" width=\"62\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/dd00-h.gif\" width=\"62\" height=\"53\"></td>\r\n");
      out.write("          <td height=\"53\"><a href=\"BookInfomation.htm\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/daodu34.gif\" alt=\"广告区\" width=\"281\" height=\"44\" border=\"0\"></a></td>\r\n");
      out.write("          <td valign=\"bottom\" height=\"53\" width=\"50\"> \r\n");
      out.write("            <div align=\"center\"> <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/gwc.jsp\"><img src=\"images/daodu03.gif\" width=\"27\" height=\"25\" alt=\"购物车\"></a><br>\r\n");
      out.write("              <span class=\"wr1\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/gwc.jsp\">购物车</a></span></div>\r\n");
      out.write("          </td>\r\n");
      out.write("          <td valign=\"bottom\" height=\"53\" width=\"65\"> \r\n");
      out.write("            <div align=\"center\">\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ShowMyOrderServlet\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/daodu02.gif\" width=\"28\" height=\"25\" alt=\"订单查询\"><br>\r\n");
      out.write("              <span class=\"wr1\">订单查询</span></a></div>\r\n");
      out.write("          </td>\r\n");
      out.write("          <td valign=\"bottom\" height=\"53\" width=\"65\"> \r\n");
      out.write("            <div align=\"center\">\r\n");
      out.write("              <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/FgExitServlet\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/daodu04.gif\" width=\"26\" height=\"25\" alt=\"安全退出\"><br>\r\n");
      out.write("              <span class=\"wr1\">安全退出</span></a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </td>\r\n");
      out.write("          <td valign=\"bottom\" height=\"53\" width=\"65\"> \r\n");
      out.write("            <div align=\"center\">\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ShowMyFavoriteServlet\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/dd-10.gif\" width=\"27\" height=\"25\" alt=\"我的帐户\"><br>\r\n");
      out.write("              <span class=\"wr1\">我的收藏夹</span></a></div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr> \r\n");
      out.write("    <td valign=\"bottom\" nowrap><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/FindBookTypeServlet\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/daodu05.gif\" width=\"116\" height=\"31\" alt=\"首页\" border=\"0\"></a><a href=\"");
      out.print(request.getContextPath() );
      out.write("/FindBookTypeServlet\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/daodu08.gif\" width=\"95\" height=\"31\" alt=\"云工厂书系\" border=\"0\"></a><a href=\"");
      out.print(request.getContextPath() );
      out.write("/FindBookTypeServlet\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/daodu09.gif\" width=\"81\" height=\"31\" alt=\"文化\" border=\"0\"></a>\r\n");
      out.write("    ");
 if(customer != null) {
      out.write("\r\n");
      out.write("    \t&nbsp;&nbsp;&nbsp;&nbsp;<b>【<font color=\"blue\">");
      out.print(customer.getCustomerName());
      out.write("</font>】&nbsp;&nbsp;<font color=\"green\">欢迎你回来！！</font></b>\r\n");
      out.write("    ");
} else{
      out.write("\r\n");
      out.write("    \t&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"red\">您还没有登录请点击<a href=\"");
      out.print( request.getContextPath() );
      out.write("/egou/login.jsp\"><b>这里</b></a>登陆</font>！\r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"770\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\" height=\"28\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td background=\"");
      out.print(request.getContextPath());
      out.write("/images/daodu12.gif\" class=\"wr1\" width=\"147\"> \r\n");
      out.write("      <div align=\"center\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/FindBookTypeServlet\"><font color=\"#FFFFFF\" face=\"Arial, Helvetica, sans-serif\"><b>www.xaygc.com</b></font></a></div>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td background=\"");
      out.print(request.getContextPath());
      out.write("/images/daodu12.gif\" valign=\"bottom\" class=\"wr1\" width=\"415\"> \r\n");
      out.write("      <div align=\"right\"><font color=\"#FFFFFF\"><b>今日上架 | 专题特区 | 排行榜 | 书店平台 | 购书演示</b></font></div>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td background=\"");
      out.print(request.getContextPath());
      out.write("/images/daodu12.gif\" valign=\"bottom\" width=\"58\">&nbsp;</td>\r\n");
      out.write("    <td background=\"");
      out.print(request.getContextPath());
      out.write("/images/daodu12.gif\" valign=\"bottom\" width=\"150\"><font color=\"#FFFFFF\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/daodu14.gif\" width=\"96\" height=\"21\" alt=\"好书快讯\"></font></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"770\" border=\"0\" cellpadding=\"0\" align=\"center\" cellspacing=\"0\">\r\n");
      out.write("  <tr><td valign=\"top\"><br></td></tr><tr valign=\"top\"> \r\n");
      out.write("    <td width=\"170\"> \r\n");
      out.write("      <p>\r\n");
      out.write("      <table width=\"153\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("      <tr> \r\n");
      out.write("        <td width=\"9\"><img src=\"images/a1.gif\" width=\"10\" height=\"22\"></td>\r\n");
      out.write("        <td bgcolor=\"#8BB083\"> \r\n");
      out.write("          <div align=\"center\"><img src=\"images/wenhua06.gif\" width=\"40\" height=\"22\"><img src=\"images/wenhua05.gif\" width=\"67\" height=\"22\" alt=\"购物车\"></div>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"9\" align=\"right\"><img src=\"images/a2.gif\" width=\"10\" height=\"22\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    \t</table>\r\n");
      out.write("      ");
 Gwc gwc = (Gwc)session.getAttribute("gwc"); 
      	if(gwc != null && gwc.getItems().size() != 0) {
      out.write("\r\n");
      out.write("\t      \t\r\n");
      out.write("      \t\t<table width=\"153\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("\t        <tr> \r\n");
      out.write("\t          <td background=\"images/a3.gif\" class=\"wr1\"> \r\n");
      out.write("\t            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"5\">\r\n");
      out.write("\t              <tr>\r\n");
      out.write("\t                <td class=\"wr4\">有 <font color=\"#FF0000\">");
      out.print(gwc.getItems().size());
      out.write("</font> 种商品在购物车内<br>\r\n");
      out.write("\t                  总计：￥ <font color=\"#FF0000\">");
      out.print(gwc.getSum()[1]);
      out.write("</font> 元<br>\r\n");
      out.write("\t                  <a href=\"");
      out.print( request.getContextPath());
      out.write("/gwc.jsp\">查看购物车清单/结帐</a>&gt;&gt;&gt;<br>\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t              </tr>\r\n");
      out.write("\t            </table>\r\n");
      out.write("\t          </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr> \r\n");
      out.write("\t          <td valign=\"top\" height=\"20\"><img src=\"images/a4.gif\" width=\"153\" height=\"6\"></td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t      </table>\r\n");
      out.write("\t      \t\r\n");
      out.write("      ");
} else {
      out.write("\r\n");
      out.write("    \t  <table width=\"153\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("\t        <tr> \r\n");
      out.write("\t          <td background=\"images/a3.gif\" class=\"wr1\"> \r\n");
      out.write("\t            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"5\">\r\n");
      out.write("\t              <tr>\r\n");
      out.write("\t                <td class=\"wr4\"><font color=\"#FF0000\">购物车内没有商品，请您选购商品</font></td>\r\n");
      out.write("\t              </tr>\r\n");
      out.write("\t            </table>\r\n");
      out.write("\t          </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr> \r\n");
      out.write("\t          <td valign=\"top\" height=\"20\"><img src=\"images/a4.gif\" width=\"153\" height=\"6\"></td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t      </table>\r\n");
      out.write("      ");
}
      out.write("\r\n");
      out.write("      <table width=\"153\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td width=\"9\"><img src=\"images/a1.gif\" width=\"10\" height=\"22\"></td>\r\n");
      out.write("          <td bgcolor=\"#8BB083\" class=\"wr2\"> \r\n");
      out.write("            <div align=\"center\"><b><font color=\"#AC1000\">[图书搜索]</font></b> </div>\r\n");
      out.write("          </td>\r\n");
      out.write("          <td width=\"9\" align=\"right\"><img src=\"images/a2.gif\" width=\"10\" height=\"22\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <table width=\"153\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td background=\"images/a3.gif\" class=\"wr1\">\r\n");
      out.write("          <table width=\"90%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("              <tr> \r\n");
      out.write("\t\t          <td class=\"wr4\">\r\n");
      out.write("\t\t         \t<form name=\"findForm\" action=\"");
      out.print(request.getContextPath());
      out.write("/FindBookInfoByIndexServlet?nowPage=1\" method=\"post\">\r\n");
      out.write("\t\t         \t书名：<input type=\"text\" size=10 name=\"bookName\"><br>\t\r\n");
      out.write("\t\t         \t作者：<input type=\"text\" size=10 name=\"author\"><br><br>\r\n");
      out.write("\t\t         \t&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"images/changxiao09.gif\"  onclick=\"findForm.submit()\" width=\"45\" height=\"18\" alt=\"搜索\">\r\n");
      out.write("\t\t         \t<img src=\"images/reset.png\"  onclick=\"findForm.reset()\" width=\"45\" height=\"18\" alt=\"重置\"><br>\r\n");
      out.write("\t\t         \t</form>\r\n");
      out.write("\t\t         </td>\r\n");
      out.write("\t\t      </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td valign=\"top\" height=\"20\"><img src=\"images/a4.gif\" width=\"153\" height=\"6\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <table width=\"153\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("        <tr> \r\n");
      out.write("        \t\r\n");
      out.write("          <td width=\"10\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/dd-m2.gif\" width=\"10\" height=\"22\"></td>\r\n");
      out.write("          <td bgcolor=\"#3AA6BF\"> \r\n");
      out.write("            <div align=\"center\"><font color=\"#FFF1C9\" class=\"wr3\"><b><font color=\"#FDF6DF\">会员登录</font></b></font></div>\r\n");
      out.write("          </td>\r\n");
      out.write("          <td width=\"10\" align=\"right\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/dd-m3.gif\" width=\"10\" height=\"22\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <table width=\"153\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("      \t\r\n");
      out.write("        <tr> \r\n");
      out.write("        \r\n");
      out.write("          <td background=\"");
      out.print(request.getContextPath());
      out.write("/images/dd-m6.gif\" class=\"wr1\" valign=\"bottom\"> \r\n");
      out.write("            <div align=\"center\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <a href=\"egou/login.jsp\"><img border=\"0\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/daodu18.gif\" width=\"55\" height=\"21\" alt=\"登录\"></a>　\r\n");
      out.write("            <a href=\"egou/register.jsp\"><img border=\"0\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/dd-m1.gif\" width=\"76\" height=\"21\" alt=\"新会员注册\"></a></div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td valign=\"top\" height=\"20\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/dd-m4.gif\" width=\"151\" height=\"8\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      ");

      	
		List<BookType> bookTypes = (List<BookType>)session.getAttribute("bookTypes");
		BookTypeDAO dao = new BookTypeDAO();
		
      out.write("\r\n");
      out.write("      <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"3\" align=\"center\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td bgcolor=\"#3AA6BF\" colspan=\"2\"> \r\n");
      out.write("            <div align=\"center\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/dd-m17.gif\" width=\"82\" height=\"23\" alt=\"分类浏览\"></div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("         ");
 for (BookType bookType: bookTypes) {
      out.write("\r\n");
      out.write("        <tr> \r\n");
      out.write("\t       \t<td bgcolor=\"#F5F2E3\" class=\"wr1\" colspan=\"2\"> \r\n");
      out.write("\t       \t\t<p>\r\n");
      out.write("\t       \t\t<b><a href=\"");
      out.print(request.getContextPath());
      out.write("/ShowTitleOneServlet?bookTypeId=");
      out.print(bookType.getBookTypeId());
      out.write("&typeOne=");
      out.print(bookType.getBookTypeName());
      out.write('"');
      out.write('>');
      out.print(bookType.getBookTypeName());
      out.write(":</a></b>\r\n");
      out.write("\t\t       \t\t");
List<BookType> types = dao.findByParentId(bookType.getBookTypeId());
						for (BookType type : types) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/FindBookInfoByBookTypeServlet?bookTypeId=");
      out.print(type.getBookTypeId());
      out.write('"');
      out.write('>');
      out.write('|');
      out.print(type.getBookTypeName());
      out.write("|</a>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t       \t\t<br>\r\n");
      out.write("\t       \t\t</p>\r\n");
      out.write("\t       \t</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td bgcolor=\"#3AA6BF\" colspan=\"2\"> \r\n");
      out.write("            <div align=\"center\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/dd-m15.gif\" width=\"81\" height=\"21\" alt=\"更多书店\"></div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td> \r\n");
      out.write("            <div align=\"right\">\r\n");
      out.write("              <input type=\"text\" name=\"textfield4\" value=\"书店检索\" size=\"15\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </td>\r\n");
      out.write("          <td width=\"37\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/dd-m08.gif\" width=\"37\" height=\"21\" alt=\"检索\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <table width=\"150\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>\r\n");
      out.write("            <div align=\"center\" class=\"wr1\"><font color=\"#68A3A1\"><b>西安钟楼新华书店</b></font></div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"1\" bgcolor=\"#000000\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/point.gif\" width=\"1\" height=\"1\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("          <td>\r\n");
      out.write("            <div align=\"center\" class=\"wr1\"><font color=\"#68A3A1\"><b>西安外文书店</b></font></div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"1\" bgcolor=\"#000000\"><img src=\"images/point.gif\" width=\"1\" height=\"1\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("          <td>\r\n");
      out.write("            <div align=\"center\" class=\"wr1\"><font color=\"#68A3A1\"><b>影音第一站</b></font></div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"1\" bgcolor=\"#000000\"><img src=\"images/point.gif\" width=\"1\" height=\"1\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("          <td>\r\n");
      out.write("            <div align=\"center\" class=\"wr1\"><font color=\"#68A3A1\"><b>西安解放路图书大厦</b></font></div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"1\" bgcolor=\"#000000\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/point.gif\" width=\"1\" height=\"1\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("          <td class=\"wr1\">\r\n");
      out.write("            <div align=\"center\"><font color=\"#68A3A1\"><b>天德图书</b></font></div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"1\" bgcolor=\"#000000\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/point.gif\" width=\"1\" height=\"1\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("          <td>\r\n");
      out.write("            <div align=\"center\" class=\"wr1\"><font color=\"#68A3A1\"><b>音乐天地图书</b></font></div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"1\" bgcolor=\"#000000\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/point.gif\" width=\"1\" height=\"1\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("          <td>\r\n");
      out.write("            <div align=\"center\" class=\"wr1\"><font color=\"#68A3A1\"><b>西安晚报社书店</b></font></div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"1\" bgcolor=\"#000000\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/point.gif\" width=\"1\" height=\"1\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <p align=\"center\" class=\"wr1\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/3297030.gif\" width=\"100\" height=\"35\" alt=\"书店LOGO\"></p><hr>\r\n");
      out.write("      <p align=\"center\" class=\"wr1\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/3297036.gif\" width=\"100\" height=\"35\" alt=\"书店LOGO\"></p><hr>\r\n");
      out.write("      <p align=\"center\" class=\"wr1\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/3297038.gif\" width=\"100\" height=\"35\" alt=\"书店LOGO\"></p><hr>\r\n");
      out.write("      <p align=\"center\" class=\"wr1\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/3297041.gif\" width=\"100\" height=\"35\" alt=\"书店LOGO\"></p><hr>\r\n");
      out.write("    </td>");
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
