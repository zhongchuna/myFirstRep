<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>



<html>
<head>
<title> 云工厂网上书店注册页面</title>

</head>
<body>
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
	        <input type="submit" value="提交"></input>
	        <input type="reset" value="重置"></input>
	  </form>    

</body>

</html>
