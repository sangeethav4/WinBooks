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


            <!--end-->
            <div id="myCarousel1" class="carousel slide" data-ride="carousel"> 
                <!-- Indicators -->

                <ol class="carousel-indicators">
                    <li data-target="#myCarousel1" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel1" data-slide-to="1"></li>
                    <li data-target="#myCarousel1" data-slide-to="2"></li>
					<li data-target="#myCarousel1" data-slide-to="3"></li>
					
					
                </ol>
                <div class="carousel-inner">
                    <div class="item active"> <img src="${img}/Carousel-1.png" style="width:100%; height: 500px" alt="First slide">
                        <div class="carousel-caption">
                            <h1>Books are uniquely<br> portable magic</h1>
                        </div>
                    </div>
                    <div class="item"> <img src="${img}/IMG-3.jpg" style="width:100%; height: 500px" alt="Second slide">
                        <div class="carousel-caption">
                            <h1>the book you <br> wont read <br>cant help<br>you</h1>
                        </div>
                    </div>
					 <div class="item"> <img src="${img}/carousel-4.jpg" style="width:100%; height: 500px" alt="third slide">
                        <div class="carousel-caption">
                            <h1>The art of life  <br> Lies in a <br> constant Readjustment</h1>
                        </div>
                    </div>
					<div class="item"> <img src="${img}/carousel-3.jpg" style="width:100%; height: 500px" alt="third slide">
                        <div class="carousel-caption">
                            <h1>  <br>  <br></h1>
                        </div>
                    </div>
					
                            <h1></h1>
                        </div>
                    </div>

                </div>
                <a class="left carousel-control" href="#myCarousel1" data-slide="prev"> <img src="${img}/icons/left-arrow.png" onmouseover="this.src = 'images/icons/left-arrow-hover.png'" onmouseout="this.src = 'images/icons/left-arrow.png'" alt="left"></a>
                <a class="right carousel-control" href="#myCarousel1" data-slide="next"><img src="${img}/icons/right-arrow.png" onmouseover="this.src = 'images/icons/right-arrow-hover.png'" onmouseout="this.src = 'images/icons/right-arrow.png'" alt="left"></a>

            </div>
            <div class="clearfix"></div>

           

            <!--gallery block--->
            <section class="gallery-block gallery-front">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                            <div class="gallery-image">
                                <img class="img-responsive" src="${img}/img-1.jpg">
                                <div class="overlay">
                                    <a class="info pop example-image-link img-responsive" href="images/room1.png" data-lightbox="example-1"><i class="fa fa-search" aria-hidden="true"></i></a>
                                    
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                            <div class="gallery-image">
                                <img class="img-responsive" src="${img}/">
                                <div class="overlay">
                                    <a class="info pop example-image-link img-responsive" href="images/room2.png" data-lightbox="example-1"><i class="fa fa-search" aria-hidden="true"></i></a>
                                  
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                            <div class="gallery-image">
                                <img class="img-responsive" src="${img}/room3.png">
                                <div class="overlay">
                                    <a class="info pop example-image-link img-responsive" href="${img}/room3.png" data-lightbox="example-1"><i class="fa fa-search" aria-hidden="true"></i></a>
                                    
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                            <div class="gallery-image">
                                <img class="img-responsive" src="${img}/room4.png">
                                <div class="overlay">
                                    <a class="info pop example-image-link img-responsive" href="images/room4.png" data-lightbox="example-1"><i class="fa fa-search" aria-hidden="true"></i></a>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

          
            <!-----blog slider----->
            <!--blog trainer block-->
            <section class="blog-block-slider">
                <div class="blog-block-slider-fix-image">
                    <div id="myCarousel2" class="carousel slide" data-ride="carousel">
                        <div class="container">
                            <!-- Wrapper for slides -->
                            <ol class="carousel-indicators">
                                <li data-target="#myCarousel2" data-slide-to="0" class="active"></li>
                                <li data-target="#myCarousel2" data-slide-to="1"></li>
                                <li data-target="#myCarousel2" data-slide-to="2"></li>
								
				
                            </ol>
                            <div class="carousel-inner" role="listbox">
                                <div class="item active">
                                    <div class="blog-box">
                                        <p>Dont read success stories <br>you will only get a message <br> read failure stories<br> you will get some ideas to success...</p>
                                    </div>
                                    <div class="blog-view-box">
                                        <div class="media">
                                            <div class="media-left">
                                                <img src="${img}/quote-1.jpeg" class="media-object">
                                            </div>
                                            <div class="media-body">
                                                <h3 class="media-heading blog-title">The legend </h3>
                                                <h5>-Dr.A.P.J. Abdul kalam</h5>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="item">
                                    <div class="blog-box">
                                        <p>Two things are infinte:The universe and Human Stupidity and I am not sure about the universe<br>Learn from yesterday, live for today,hope for tomorrow,the important thing is not to stop questioning </p>
                                    </div>
                                    <div class="blog-view-box">
                                        <div class="media">
                                            <div class="media-left">
                                                <img src="${img}/quote-2.jpg" class="media-object">
                                            </div>
                                            <div class="media-body">
                                                <h3 class="media-heading blog-title">World Genius</h3>
                                                <h5 class="blog-rev">Albert Einstein..</h5>
                                            </div>
                                        </div>
                                    </div>
                                </div>
								<div class="item">
                                    <div class="blog-box">
                                        <p> Give me my robe,put on my crown<br>I have immortal longings in me.. </p>
                                    </div>
                                    <div class="blog-view-box">
                                        <div class="media">
                                            <div class="media-left">
                                                <img src="${img}/quote-3.jpeg" class="media-object">
                                            </div>
                                            <div class="media-body">
                                                <h3 class="media-heading blog-title">Ravinder Singh</h3>
												<h4> I too had a love Story</h4>
                                                <h5 class="blog-rev"></h5>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                        
								
                                <div class="item">
                                    <div class="blog-box">
                                        <p>A grain in the balance will determine which individual shall live and which shall die - which variety or species shall increase in number, and which shall decrease, or finally become extinct. </p>
                                    </div>
                                    <div class="blog-view-box">
                                        <div class="media">
                                            <div class="media-left">
                                                <img src="${img}/quote-3.jpg" class="media-object">
                                            </div>
                                            <div class="media-body">
                                                <h3 class="media-heading blog-title">Charles Darwin</h3>
                                                <h5 class="blog-rev">Satisfied Customer</h5>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="clearfix"></div>
            </section>

          

            <!---footer--->
            <footer>
                <div class="container">
                    <div class="row">
                        <div class="col-md-3 col-sm-6 col-xs-12 width-set-50">
                            <div class="footer-details">
                                <h4>Get in touch</h4>
                                <ul class="list-unstyled footer-contact-list">
                                    <li>
                                        <i class="fa fa-map-marker fa-lg"></i>
                                        <p>701 M.G. Road Bangalore, India</p>
                                    </li>
                                    <li>
                                        <i class="fa fa-phone fa-lg"></i>
                                        <p><a href="tel:+1-202-555-0100"> 1800 422 0000</a></p>
                                    </li>
                                    <li>
                                        <i class="fa fa-envelope-o fa-lg"></i>
                                        <p><a href="mailto:demo@info.com"> WinBooks@gmail.com</a></p>
                                    </li>
                                </ul>
                                <div class="footer-social-icon">
                                    <a href="#"><i class="fa fa-facebook"></i></a>
                                    <a href="#"><i class="fa fa-twitter"></i></a>                           
                                    <a href="#"><i class="fa fa-instagram"></i></a>
                                    <a href="#"><i class="fa fa-google-plus"></i></a>
                                    
                                </div>
                                
                            </div>
                        </div>
                       
                        <div class="col-md-6 col-sm-12 col-xs-12">
                            <div class="footer-details">
                                <h4>Best Selling</h4>
                                <div class="row">
                                                                    </div>
                            </div>
                        </div>
                    </div>

                   
                </div>
            </footer>

            
        </div>
    </body>
</html>
