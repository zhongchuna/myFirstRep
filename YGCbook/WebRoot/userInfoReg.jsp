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
		.buttonStyle{
			width:100px;
		     text-align:center;
		     line-height:100%;
		     padding:0.3em;
		     font:16px Arial,sans-serif bold;
		     font-style:normal;
		     text-decoration:none;
		     margin:2px;
		     vertical-align:text-bottom;
		     zoom:1;
		     outline:none;
		     font-size-adjust:none;
		     font-stretch:normal;
		     border-radius:50px;
		     box-shadow:0px 1px 2px rgba(0,0,0,0.2);
		     text-shadow:0px 1px 1px rgba(0,0,0,0.3);
		     color:black;
		     border:0.2px solid #2299ff;
		     background-repeat:repeat;
		     background-size:auto;
		     background-origin:padding-box;
		     background-clip:padding-box;
		     background-color:#87CEEB;
		     background: linear-gradient(to bottom, #eeeff9 0%,#3399ff 100%);
		}
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
	        <input type="submit" class="buttonStyle" value="提交"></input>
	        <input type="reset" class="buttonStyle" value="重置"></input>
	  </form>    

</body>

</html>
