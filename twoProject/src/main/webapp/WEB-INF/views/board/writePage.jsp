<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
*{
	margin : 0 auto;
}

table{
	margin-top : 50px;
	
	
	max-width: 500px; 
}

.first_tbody tr td{
	
	background-color: #ccccff;
}


#contents{width: 400px; height: 300px;}
</style>
</head>
<body>


	<div id="write_box">
    <form id="write" action="writeform" method="post">
    	<table>
    		<thead>
    			<tr>
    				<td>글쓰기 예제</td>
    			</tr>
    		</thead>
    		<tbody class="first_tbody">
    		<tr>
    			<td>ID<input type="text" name="id" size="10">
    				title<input type="text" name="title" size="35">
    			</td>
    			
    			
    		</tr>
    		</tbody>
    		<tbody>
    			<tr>
    			<td colspan="2">
    				<textarea id="contents" name="contents" placeholder="여기다 글쓰면 됩니다."></textarea>
    			</td>
    		</tr>
    		</tbody>
    			
    		<tfoot>
    		
    		</tfoot>
    		<tr>
    			<td><input style="float: right; " type="submit" value="글 쓰기"></td>
    		</tr>
    
    		
    	</table>
    	
    	
    </form>
    </div>
</body>
</html>