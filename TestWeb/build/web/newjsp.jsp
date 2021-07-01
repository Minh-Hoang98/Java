<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Smart Health Care System</title>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <link rel="icon" href="images/log.png" type="image/png" sizes="16x16">
        <link rel="icon" href="images/log.png" type="image/png" sizes="16x16">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="css/style.css" rel="stylesheet">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- template skin -->
        <link id="t-colors" href="css/default.css" rel="stylesheet">
        <script src="js/backNoWork.js"></script>

        <style>

            /* Footer */
            #footer {
                background: #222;
                border-top: 5px solid #333;
                color: #ccc;
                font-weight: bold;
                height: 50px;
                line-height: 50px;
                position: absolute;
                bottom: 0;
                left: 0;
                width: 100%;
                text-align: center;
            }

            .regis{
                position: absolute;
                right: 0;
                margin: 0px;
                max-width: 500px;
                padding: 16px;
                background-color: white;
            }
            .footer{
                position: absolute;
                bottom:  0;
                margin: 0px;
                max-width: 500px;
                padding: 16px;
                background-color: white;
            }
            .navbar-brand {
                padding: 0px;
            }
            .navbar-brand>img {
                height: 100%;
                padding: 15px;
                width: auto;
            }
            /* EXAMPLE 3

            line height is 20px by default so add 30px top and bottom to equal the new .navbar-brand 80px height  */

            .example3 .navbar-brand {
                height: 80px;
            }
            .example3 .nav >li >a {
                padding-top: 30px;
                padding-bottom: 30px;
            }
            .example3 .navbar-toggle {
                padding: 10px;
                margin: 25px 15px 25px 0;
            }
            /*            body {
                            background:url('images/pp2.png') no-repeat center center;
                            background-size:cover;
            
                             Workaround for some mobile browsers 
                            min-height:100%;
                        }*/
            html{
                /* This image will be displayed fullscreen */
                background:url('images/background.jpg') no-repeat center center;
                /* Ensure the html element always takes up the full height of the browser window */
                height:100%;
                /* The Magic */
                background-size:cover;
            }
            #navbar3 li a:hover
            {
                color:lightseagreen;
            }
        </style>
    </head>
    <body>
        <div class="example3">
            <nav class="navbar navbar-inverse navbar-static-top" style="background-color: whitesmoke;">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar3">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="index.jsp"><img src="images/log.png" alt="Dispute Bills"></a>
                    </div>
                    <div id="navbar3" class="navbar-collapse collapse">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="active"><a href="#">Home</a></li>
                            <li><a href="Services.jsp">Services</a></li>
                            <li><a href="About.jsp">About Us</a></li>
                            <li><a href="Contact.jsp">Contact Us</a></li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Sign Up <span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="PatientForm.jsp">Patient Sign Up</a></li>
                                    <li><a href="DoctorForm.jsp">Doctor Sign Up</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Login <span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="PatientLogin.jsp">Patient Login</a></li>
                                    <li><a href="DoctorLogin.jsp">Doctor Login</a></li>
                                    <li><a href="AdminForm.jsp">Administrator Login</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                    <!--/.nav-collapse -->
                </div>
                <!--/.container-fluid -->
            </nav>
        </div>



        <div class="regis">
            <form onsubmit="sendEmail(event)">
                <legend>Contact Form</legend>
                <div id="alert-field" class="alert hidden">
                    <p>Uh oh! Something went wrong!</p>
                </div>    
                <div class="form-group col-xs-6">
                    <label for="name-field">ID</label>
                    <input type="text" class="form-control" id="id-field" name="id-field" readonly required></br>
                    <label for="name-field">Email</label>
                    <input type="text" class="form-control" id="name-field" name="email-field" placeholder="Your name" required></br>
                    <label for="name-field">Contact No.</label>
                    <input type="text" class="form-control" id="name-field" name="contact-field" placeholder="Your name" required></br>
                    <label for="subject-field">Patient Gender</label>
                    <select class="form-control" name="subject-gender" onchange="changeSubject(event)"  required>
                        <option value="M">Male</option>      
                        <option value="F">Female</option>
                    </select>
                    </br>
                    <label for="name-field">Marital Status</label>
                    <select class="form-control" name="subject-marital" onchange="changeSubject(event)"  required>
                        <option value="M">Single</option>      
                        <option value="F">Married</option>
                    </select>   
                    </br>
                    </br>
                    </br>
                    </br>
                    <label for="name-field">Select Disease</label>
                    <input type="text" class="form-control" id="name-field" name="name-field" placeholder="Your name" required></br>
                </div>

                <div class="form-group col-xs-6">
                    <label for="email-field">Email</label>
                    <input type="email" class="form-control" id="email-field" name="email-field" placeholder="Email address" required>
                </div>

                <!--    <div id="subject-select" class="form-group col-xs-12">
                      <label for="subject-field">Subject</label>
                      <select class="form-control" name="subject-field" onchange="changeSubject(event)"  required>
                        <option value="Consulting">#EdTech Consulting</option>
                        <option value="Web Development">Web Development projects</option>
                        <option value="Google Scripts">Google Apps Scripts</option>
                        <option value="G Suite for Education">G Suite for Education Tools</option>
                        <option value="Other">Other</option>
                      </select>
                    </div>
                    
                    <div id="hidden-other-subject" class="form-group col-xs-6 hidden">
                      <label for="other-subject-field">Other</label>
                      <input type="text" class="form-control" id="other-subject-field" name="other-subject-field" placeholder="Other subject" />
                    </div>
                    
                    <div class="form-group col-xs-12">
                      <label for="body-field">Message</label>
                      <textarea id="body-field" name="body-field" class="form-control" placeholder="Type your message here" required></textarea>
                    </div>-->

                <div class="form-group col-xs-12">
                    <button type="submit" class="btn btn-primary btn-lg btn-block">Submit</button>  
                </div>   
            </form>    
        </div>   

        <!-- Footer -->
        <footer class="page-footer font-small blue-grey lighten-5">

            <div style="background-color: #21d192;">
                <div class="container">

                    <!-- Grid row-->
                    <div class="row py-4 d-flex align-items-center">

                        <!-- Grid column -->
                        <div class="col-md-6 col-lg-5 text-center text-md-left mb-4 mb-md-0">
                            <h6 class="mb-0">Get connected with us on social networks!</h6>
                        </div>
                        <!-- Grid column -->

                        <!-- Grid column -->
                        <div class="col-md-6 col-lg-7 text-center text-md-right">

                            <!-- Facebook -->
                            <a class="fb-ic">
                                <i class="fab fa-facebook-f white-text mr-4"> </i>
                            </a>
                            <!-- Twitter -->
                            <a class="tw-ic">
                                <i class="fab fa-twitter white-text mr-4"> </i>
                            </a>
                            <!-- Google +-->
                            <a class="gplus-ic">
                                <i class="fab fa-google-plus-g white-text mr-4"> </i>
                            </a>
                            <!--Linkedin -->
                            <a class="li-ic">
                                <i class="fab fa-linkedin-in white-text mr-4"> </i>
                            </a>
                            <!--Instagram-->
                            <a class="ins-ic">
                                <i class="fab fa-instagram white-text"> </i>
                            </a>

                        </div>
                        <!-- Grid column -->

                    </div>
                    <!-- Grid row-->

                </div>
            </div>

            <!-- Footer Links -->
            <div class="container text-center text-md-left mt-5">

                <!-- Grid row -->
                <div class="row mt-3 dark-grey-text">

                    <!-- Grid column -->
                    <div class="col-md-3 col-lg-4 col-xl-3 mb-4">

                        <!-- Content -->
                        <h6 class="text-uppercase font-weight-bold">Company name</h6>
                        <hr class="teal accent-3 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
                        <p>Here you can use rows and columns to organize your footer content. Lorem ipsum dolor sit amet,
                            consectetur
                            adipisicing elit.</p>

                    </div>
                    <!-- Grid column -->

                    <!-- Grid column -->
                    <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">

                        <!-- Links -->
                        <h6 class="text-uppercase font-weight-bold">Products</h6>
                        <hr class="teal accent-3 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
                        <p>
                            <a class="dark-grey-text" href="#!">MDBootstrap</a>
                        </p>
                        <p>
                            <a class="dark-grey-text" href="#!">MDWordPress</a>
                        </p>
                        <p>
                            <a class="dark-grey-text" href="#!">BrandFlow</a>
                        </p>
                        <p>
                            <a class="dark-grey-text" href="#!">Bootstrap Angular</a>
                        </p>

                    </div>
                    <!-- Grid column -->

                    <!-- Grid column -->
                    <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">

                        <!-- Links -->
                        <h6 class="text-uppercase font-weight-bold">Useful links</h6>
                        <hr class="teal accent-3 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
                        <p>
                            <a class="dark-grey-text" href="#!">Your Account</a>
                        </p>
                        <p>
                            <a class="dark-grey-text" href="#!">Become an Affiliate</a>
                        </p>
                        <p>
                            <a class="dark-grey-text" href="#!">Shipping Rates</a>
                        </p>
                        <p>
                            <a class="dark-grey-text" href="#!">Help</a>
                        </p>

                    </div>
                    <!-- Grid column -->

                    <!-- Grid column -->
                    <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">

                        <!-- Links -->
                        <h6 class="text-uppercase font-weight-bold">Contact</h6>
                        <hr class="teal accent-3 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
                        <p>
                            <i class="fas fa-home mr-3"></i> New York, NY 10012, US</p>
                        <p>
                            <i class="fas fa-envelope mr-3"></i> info@example.com</p>
                        <p>
                            <i class="fas fa-phone mr-3"></i> + 01 234 567 88</p>
                        <p>
                            <i class="fas fa-print mr-3"></i> + 01 234 567 89</p>

                    </div>
                    <!-- Grid column -->

                </div>
                <!-- Grid row -->

            </div>
            <!-- Footer Links -->

            <!-- Copyright -->
            <div class="footer-copyright text-center text-black-50 py-3">© 2018 Copyright:
                <a class="dark-grey-text" href="https://mdbootstrap.com/education/bootstrap/"> MDBootstrap.com</a>
            </div>
            <!-- Copyright -->

        </footer>
        <!-- Footer -->
    </body> 
</html>