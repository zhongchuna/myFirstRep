<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@page import="co.jp.netwisdom.entity.UserInfo"%>
<%@page import="co.jp.netwisdom.entity.Hobby"%>

<html>
<head>
<title> 云工厂网上书店注册页面</title> 
<style>
	    #username{
	   border:1px solid black;
       width:180px;
       height:30px;
       border-radius:25px;
		}
		#password{
	   border:1px solid black;
       width:180px;
       height:30px;
       border-radius:25px;
		}
		#textarea{
	   border:1px solid black;
       width:180px;
       height:30px;
       border-radius:25px;
		}
		<style type="text/css">
		input{
		background-color: pink;
		}
		</style>
		<script language="javascript" type="text/javascript">
		
		</script>
</head>
 <% UserInfo userinfo = (UserInfo)request.getAttribute("userinfo");%>
 <% Hobby hobby = (Hobby)request.getAttribute("hobby");%>
<body background="resources/images/test.jpg" style="text-align:center">
	<form action="userUpdate"  id="form">
		<%if(userinfo != null && hobby != null){%>
	              姓名<input type="text" id="username" name="username" value="<%=userinfo.getUsername()%>"><br>
	               密码<input type="password" id="password" name="password" value="<%=userinfo.getPassword()%>"><br>
	               性别<input type="radio"  name="sex" value=0 <%=userinfo.getSex().equals("0")?"checked":""%>>男  
	        <input type="radio"  name="sex" value=1 <%=userinfo.getSex().equals("1")?"checked":""%>>女<br>
	               专业<select name="major">
	           <option value="0" <%=userinfo.getMajor().equals("0")?"selected":""%>>软件工程</option>
	           <option value="1" <%=userinfo.getMajor().equals("1")?"selected":""%>>英语</option>
	           <option value="2" <%=userinfo.getMajor().equals("2")?"selected":""%>>数学</option>
	        </select><br>
	               简介<input type="textarea" id="intro" name="intro" value=<%=userinfo.getIntro()%>><br>
	               爱好<input type="CheckBox" id="hobby" name="hobby" value=0 <%=hobby.getHobby().contains("0")?"checked":""%>>足球
	        <input type="CheckBox" id="hobby" name="hobby" value=1 <%=hobby.getHobby().contains("1")?"checked":""%>>篮球
	        <input type="CheckBox" id="hobby" name="hobby" value=2 <%=hobby.getHobby().contains("2")?"checked":""%>>网球
	        <br>
	        <input type="submit"value="更新用户"></input>
	        <input type="submit"value="删除"></input><br>
	      <%}%>
	  </form>    
</body>

</html>