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
* {
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
	margin-left:15px;
	width:230px;
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
	margin-left:15px;
	width:230px;
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

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}


/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media (max-width: 800px) {
    .col-25, .col-75, input[type=submit] {
        width: 50%;
        margin-top: 0;
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
border-radius:8px;
border-width:40;
}
</style>
</head>
<body>
<fieldset>
<c:url value="/addsupplier" var="supplier"/>
 <form:form action="${supplier}" method="post" commandName="supplier">
 
      <div class="row">
       <div class="col-25">
            <label for="Supplier Name">Supplier Name :</label>
        </div>
         <div class="col-75">
           <form:input type="text" id="Supplier Name" path="suppName"/>
       </div>
    </div>

       <div class="row">
      <div class="col-25">
           <label for=" Id">Supplier Id :</label>
      </div>
        <div class="col-75">
              <form:input type="text" id="Supplier Id" path="suppId"/>
         </div>
  </div>
  <div class="row">
      <div class="col-25">
           <label for=" Id">Email-id:</label>
      </div>
        <div class="col-75">
              <form:input type="text" id="Email- id" path="email"/>
         </div>
  </div>
<div class="row">
      <div class="col-25">
           <label for=" Id">Phone no:</label>
      </div>
        <div class="col-75">
              <form:input type="text" id="Phone no" path="phoneno"/>
         </div>
  </div>
<div class="row">
      <div class="col-25">
           <label for=" Id">Address:</label>
      </div>
        <div class="col-75">
              <form:input type="text" id="Address" path="address"/>
         </div>
  </div>

<div class="row">
      <input type="submit" value="Submit">
    </div>
	<br>
	
 <div class="row">
      <input type="reset" value="Cancel">
    </div></form:form>
	</fieldset>
	
	<table>
<tr>
<th>suppId</th>
<th>suppName</th>
<th>address</th>
<th>phone no</th>
<th>email</th>


</tr>
<c1:forEach items="${suppliers}" var="supp">
<tr>

<td>${supp.getSuppId()}</td>
<td>${supp.getSuppName()}</td>
<td>${supp.getAddress()}</td>
<td>${supp.getPhoneno()}</td>
<td>${supp.getEmail()}</td>

<td><a href="<c:url value='/editsupplier/${supp.getSuppId()}'/>">EditSupplier</a><a href="<c:url value='/deleteSupplier/${supp.getSuppId()}'/>">DeleteSupplier</a></td></tr>
</c1:forEach>

</table>
</html>