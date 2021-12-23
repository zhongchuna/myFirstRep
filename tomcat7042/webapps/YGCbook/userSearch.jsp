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
		<script language="javascript" type="text/javascript" >
		function f1(e){
		e.style.backgroundColor = "4169E1";
		}
		
		</script>
</head>
<body background="resources/images/test.jpg" style="text-align:center">
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
</body>
</html>