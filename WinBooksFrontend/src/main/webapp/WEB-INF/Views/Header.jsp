 <%@taglib prefix="c" uri="http://www.springframework.org/tags"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html lang="en">
    <head>
     <c:url value="/resources/image" var="img"/>
    <c:url value="/resources/css" var="css"/>
    <c:url value="/resources/js" var="js"/>
    
       
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="images/icons/favicon.png"/>
        <title>WinBooks</title>

        <!-- Bootstrap core CSS -->
        <link href="${css}/bootstrap.min.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Custom styles for this template -->
        <link href="${css}/style.css" rel="stylesheet">
        <link href="${fonts}/antonio-exotic/stylesheet.css" rel="stylesheet">
        <link rel="stylesheet" href="css/lightbox.min.css">
        <link href="${css}/responsive.css" rel="stylesheet">
        <script src="${js}/jquery.min.js" type="text/javascript"></script>
        <script src="${js}/bootstrap.min.js" type="text/javascript"></script>
        <script src="${js}/lightbox-plus-jquery.min.js" type="text/javascript"></script>
        <script src="${js}/instafeed.min.js" type="text/javascript"></script>
        <script src="${js}/custom.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="page">
            <!---header top---->
            <div class="top-header">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6">
                            <!--                            <a href="#"> </a>
                                                        <div class="info-block"><i class="fa fa-map"></i>701 Old York Drive Richmond USA.</div>-->
                        </div>
                        <div class="col-md-6">
                            <div class="social-grid">
                                <ul class="list-unstyled text-right">
                                    <li><a><i class="fa fa-facebook"></i></a></li>
                                    <li><a><i class="fa fa-twitter"></i></a></li>
                                    <li><a><i class="fa fa-linkedin"></i></a></li>
                                    <li><a><i class="fa fa-instagram"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--header--->
           <header class="header-container">
                <div class="container">
                    <div class="top-row">
                        <div class="row">
                            <div class="col-md-2 col-sm-6 col-xs-6">
                                <div id="logo">
                                    <!--<a href="index.html"><img src="images/logo.png" alt="logo"></a>-->
                                    <a href="index.html"><span>Win</span>Books</a>
                                </div>                       
                            </div>
                            <div class="col-sm-6 visible-sm">
                                <div class="text-right"><button type="button" class="book-now-btn">Book Now</button></div>
                            </div>
                            <div class="col-md-8 col-sm-12 col-xs-12 remove-padd">
                                <nav class="navbar navbar-default">
                                    <div class="navbar-header page-scroll">
                                        <button data-target=".navbar-ex1-collapse" data-toggle="collapse" class="navbar-toggle" type="button">
                                            <span class="sr-only">Toggle navigation</span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                        </button>

                                    </div>
                                    <div class="collapse navigation navbar-collapse navbar-ex1-collapse remove-space">
                                        <ul class="list-unstyled nav1 cl-effect-10">
                                            <li><a  data-hover="Home" class="active"><span>Home</span></a></li>
                                            <li><a data-hover="AboutUs"  href="about.html"><span>AboutUs</span></a></li>
                                            <li><a data-hover="ContactUs"  href="rooms.html"><span>ContactUs</span></a></li>
                                            <li><a data-hover="BookList"  href="gallery.html"><span>BookList</span></a></li>
											<li><a data-hover="Admin" href="Admin.html" data-toggle="dropdown"><span>Admin</span></a>
														<ul class="dropdown-menu">
															<li><a href="<c:url value="/Category"/>">Category</a></li>
															<li><a href="<c:url value="/Supplier"/>">Supplier</a></li>
															<li><a href="<c:url value="/product"/>">Product</a></li>
														  </ul></li>
														</div>													
                                        </ul>

                                    </div>
                                </nav>
                            
                            <div class="col-md-2  col-sm-4 col-xs-12 hidden-sm">
                                <div class="text-right"><button type="button" class="book-now-btn">Book Now</button></div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>

    </body>
</html>
