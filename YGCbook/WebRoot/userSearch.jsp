<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@page import="co.jp.netwisdom.entity.UserInfo"%>
<%@page import="co.jp.netwisdom.entity.Hobby"%>
<html>
<head>
 <title> 用户检索页面</title>
      <% List<UserInfo> list = (List<UserInfo>)request.getAttribute("list");%>
      <% List<Hobby> listForHobby = (List<Hobby>)request.getAttribute("listForHobby");%>
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
		<script language="javascript" type="text/javascript" >
		function f1(e){
		e.style.backgroundColor = "4169E1";
		}
		
		</script>
</head>
<body background="resources/images/test.jpg" style="text-align:center" >
	<form action="userSearch">

	              姓名<input type="text" id="username" name="username" ><br>
	               性别<input type="radio"  name="sex" value=0>男  
	        <input type="radio"  name="sex" value=1>女<br>
	              专业<select name="major">
	           <option value=""></option>
	           <option value="0">软件工程</option>
	           <option value="1">英语</option>
	           <option value="2">数学</option>
	        </select><br>            
	      
	        <input type="submit"value="检索" onclick="f1(this)"></input>
	        <input type="reset" value="重置"  onclick="f1(this)"></input>  <br>
	        检索一览
	  </form>   
	   	<table border="1" cellpadding="3" cellspacing="0" style="width: 60%;margin:auto" >
	   		<tr>
	   			<th>用户名</th>
	   			<th>性别</th>
	   			<th>爱好</th>
	   			<th>专业</th>
	   			<th>简介</th>
	   		</tr>
	   		
	   		<%if(list != null && listForHobby != null){%>
	   			<%for(UserInfo userinfo : list ){%>
	   			
	   			<tr >
	
	   				<td><%=userinfo.getUsername()%></td>
	   				<td><%=userinfo.getSex().replace("0","男").replace("1","女")%></td>
	   				<%for(Hobby hobby:listForHobby){%>
	   					<%if(userinfo.getUsername().equals(hobby.getUsername())){%>
	   					   <td><%=hobby.getHobby().replace("0","足球").replace("1","篮球").replace("2","网球")%></td>
	   					<%}%>
 				<%}%>
					<td><%=userinfo.getMajor().replace("0","软件工程").replace("1","英语").replace("2","数学")%></td>
	   				<td><%=userinfo.getIntro()%></td>   			
	   	        </tr>	   			
	   			 <%}%>
			<%}%>
	   		
	   		
	   	</table>
</body>
</html>