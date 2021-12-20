<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
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
		<!--
		function f1(e){
		e.style.backgroundColor = "4169E1";
		}
		//-->
		</script>
</style>
</head>
<body background="resources/images/test.jpg" style="text-align:center">
	<form>
	              姓名<input type="text" id="username" name="name"><br>
	               密码<input type="password" id="password" name="password"><br>
	               性别<input type="radio"  name="sex">男  
	        <input type="radio"  name="sex">女<br>
	               专业<select>
	           <option value="0">软件工程</option>
	           <option value="1">英语</option>
	           <option value="2">数学</option>
	        </select><br>
	               简介<input type="textarea" id="textarea" name="textarea"><br>
	               爱好<input type="CheckBox" id="hobby" name="hobby">足球
	        <input type="CheckBox" id="hobby" name="hobby">篮球
	        <input type="CheckBox" id="hobby" name="hobby">网球
	        <br>
	        <input type="submit"value="提交"  onclick="f1(this)"></input>
	        <input type="reset" value="重置"  onclick="f1(this)"></input>
	  </form>    
</body>
</html>