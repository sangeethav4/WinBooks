<html lang="en">
    <head>
     

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
<fieldset>

<c:url value="/addproduct" var="prod"/>
 <form:form action="${prod}" method="post" commandName="product" enctype="multipart/form-data">
 
 <div class="row">
      <div class="col-25">
           <label for="Id"> Product Id:</label>
      </div>
        <div class="col-75">
              <form:input type="text" id="Product Id" path="productId"/>
         </div>
  </div>
      <div class="row">
       <div class="col-25">
            <label for="Product Name">Product Name:</label>
        </div>
         <div class="col-75">
           <form:input type="text" id="Product Name" path="productname"/>
       </div>
    </div>


   <div class="row">
       <div class="col-25">
            <label for="Quantity">Quantity:</label>
        </div>
         <div class="col-75">
           <form:input type="text" id="Quantity"  path="quantity"/>
       </div>
    </div>

 <div class="row">
       <div class="col-25">
            <label for="Price">Price:</label>
        </div>
         <div class="col-75">
           <form:input type="text" id="Price" path="price"/>
       </div>
    </div>
 <div class="row">
 <div class="col-25">
 <label for="Description">Description</label>
 </div>
 <div class ="col-75">
 <form:input type="text" id="Description" path="description"/>
 </div>
 </div>
<br>
<br>
<label>Category Id</label>
<form:select path="category.catId">
<c1:forEach items="${categories}" var="cat">
<option value="${cat.getCatId()}" label="${cat.getCatname()}">${cat.getCatname()}</option>
</c1:forEach>
</form:select>
<label>Supplier Id</label>
<form:select path="supplier.suppId">
<c1:forEach items="${suppliers}" var="supp">
<option value="${supp.getSuppId()}" label="${supp.getSuppName()}">${supp.getSuppName()}</option>
</c1:forEach>
</form:select>
<br>
<label>Choose Product</label>
<form:input path="pimg" type="file" value="Upload File"/>

<div class="row">
      <input type="submit" value="Submit">
    </div>
	<br>
	
 <div class="row">
      <input type="reset" value="Cancel">
    </div>

</form:form>
</fieldset>

<table>
<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Description</th>
<th>Price</th>
<th>Quantity</th>
<th>Category Id</th>
<th> Supplier Id</th>
<th>Edit/Delete</th>
</tr>
<c1:forEach items="${products}" var="prod">
<tr>
<td><img src="<c:url value="/resources/image/${prod.getProductId()}.jpg"/>">
<td>${prod.getProductId()}</td>
<td>${prod.getProductname()}</td>
<td>${prod.getDescription()}</td>
<td>${prod.getPrice()}</td>
<td>${prod.getQuantity()}</td>

<td><a href="<c:url value='/editproduct/${prod.getProductId()}'/>">EditProduct</a><a href="<c:url value='/deleteProduct/${prod.getProductId()}'/>">DeleteProduct</a></td></tr>
</tr>

</c1:forEach>
</table>
</body>
</html>
	




