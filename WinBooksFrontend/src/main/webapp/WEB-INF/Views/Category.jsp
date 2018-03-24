 <%@taglib prefix="c" uri="http://www.springframework.org/tags"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
    <head>
    <c:url value="/resources/image" var="img"/>
    <c:url value="/resources/css" var="css"/>
    <c:url value="/resources/js" var="js"/>
    <c:url value="/resources/font-awesome" var="font-awesome"/>
    
<%@include file="Header.jsp" %>

    <style>
     { 
     box-sizing: border-box; 
 } 

 form:input[type=text], select, textarea { 
     width:67%; 
     padding:12px; 
     border: 1px solid #ccc; 
     border-radius: 4px; 
     resize: vertical; 
     focus:#ff4157; 
 	border-color:#ff4157; 
 } 

 label { 
     padding: 12px 12px 12px 0; 
     display: inline-block; 
 } 

 input[type=submit] { 
     background-color:#ff4157 ; 
     color: white; 
     padding: 10px ; 
     border: none; 
     border-radius:15px; 
     cursor: pointer; 
     float:left; 
 	margin-left:220px; 
 	width:205px; 
 } 

 input[type=submit]:hover { 
     background-color:#00001a; 

 } 

 input[type=reset] { 
 background-color:#ff4157 ; 
     color: white; 
     padding: 10px ; 
     border: none; 
     border-radius:15px; 
     cursor: pointer; 
     float:left; 
 	margin-left:220px; 
 	width:205px; 
 } 

 input[type=reset]:hover { 
     background-color:#00001a; 

 } 

 .col-25 { 
    float: left; 
 	margin-left:150px; 
     width: 20%; 
     margin-top: 6px; 
 } 

 .col-75 { 
     float: left; 
     width: 40%; 
 	margin-left:2px; 
     margin-top: 6px; 
 } 

  Clear floats after the columns  
 .row:after { 
     content: ""; 
     display: table; 
     clear: both; 
 } 


  Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other  
 @media (max-width: 800px) { 
     .col-25, .col-75, input[type=submit] { 
         width: 50%; 
         margin-top:0; 
     } 
 } 


 fieldset{ 
 margin-left:300px; 
 margin-right:380px; 
 padding-top:30px; 
 padding-bottom:20px; 
 padding-left:-100px; 
 padding-right:-200px; 
 border: 5px solid black; 
 border-radius:30px; 
 border-width:40 
 } 
 </style> 
 
<body>
<c:url value="/addcat" var="cat"/>
<form:form action="${cat}" method="post" commandName="category">
      <fieldset>
      <div class="row">
      
      <div class="row">
      <div class="col-25">
           <label for=" Id">Category Id :</label>
      </div>
        <div class="col-75">
              <form:input type="text" id="Category  Id"  path="catId"/>
         </div>
  </div>
      
       <div class="col-25">
            <label for="Category Name">Category Name :</label>
        </div>
         <div class="col-75">
           <form:input type="text" id="Category  Name"  path="catname"/>
       </div>
    </div>
<br>

<br>
<br>
<div class="row">
      <input type="submit" value="Submit">
    </div>
	<br>
	
 <div class="row">
      <input type="reset" value="Cancel">
    </div>
	</fieldset>
</form:form>


<table>
<tr>
<th>CatId</th>
<th>CatName</th>
</tr>
<c1:forEach items="${categories}" var="cat">
<tr>
<td>${cat.getCatId()}</td>
<td>${cat.getCatname()}</td>
<td><a href="<c:url value='/editcat/${cat.getCatId()}'/>">EditCategory</a><a href="<c:url value='/delete/${cat.getCatId()}'/>">DeleteCategory</a></td></tr>
</c1:forEach>
</table>
</div>
</body>
</html>

