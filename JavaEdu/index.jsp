<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

String s = request.getParameter("dan")==null? "2": request.getParameter("dan") ;


 
int int_val = Integer.parseInt(s);
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>구구단TEST</title>

<script>

function fn_test(){
	
	console.log("1111");
	location.href="/index.jsp?dan="+document.all.dan.value;
	

};
</script>

</head>

<body>

<input type="text" name="dan" >
<input type="button" value="전송" onclick="fn_test();">

<BR>


<%

	for(int i =1;i<=9;i++){	

	%>
<%=int_val+"X"+i+"="+(i*int_val)+"<br>"%>

<%	

		}

	%>

</body>

</html>