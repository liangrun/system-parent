<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="../../../common/common.jsp"%>
<%@ include file="../../../common/url.jsp " %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Work</title>
<%@ include file="../../../common/head.jsp" %></head>
<body data-spy="scroll" data-target=".bs-docs-sidebar">
<!-- Navbar
    ================================================== -->
<div class="nav-agency">
  <div class="navbar navbar-static-top"> 
    <!-- navbar-fixed-top -->
    <div class="navbar-inner">
      <div class="container"> <a class="brand" href="${home }"> <img src="${basePath }assets/img/Logodark.png" alt="Logo"></a>
        <div id="main-nav">
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li><a href="${home }">Home</a> </li>
              <li class="dropdown active"><a class="dropdown-toggle" data-toggle="dropdown" href="javascript:"> Work <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="${onework }">One Column</a></li>
                  <li><a href="${twowork }">Two Column</a></li>
                  <li><a href="work-three-columns.html">Three Column</a></li>
                  <li><a href="work-details.html">Work Details</a></li>
                </ul>
              </li>
              <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="javascript:"> Pricing <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="pricing.html">Four Column</a></li>
                  <li><a href="pricing-three-columns.html">Three Column</a></li>
                </ul>
              </li>
              <li class="dropdown"><a href="javascript:" class="dropdown-toggle" data-toggle="dropdown"> Pages <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="faq.html">FAQ</a></li>
                  <li><a href="contact.html">Contact Us</a></li>
                  <li><a href="components.html">Components</a></li>
                </ul>
              </li>
              <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="javascript:"> Blog <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="blog.html">Blog Page</a></li>
                  <li><a href="blog-single.html">Single Page</a></li>
                </ul>
              </li>
              <li><a href="index.html">Purchase</a> </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<div class="container">
  <div class="row-fluid">
    <div class="span12">
      <div class="page-header">
        <div class="row-fluid">
          <div class="span12">
            <h1> Work Details</h1>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="work">
    <div class="row-fluid">
      <div class="span4">
        <h5> Client Name</h5>
        <p> Client inc</p>
        <h5> Project Year</h5>
        <p> 2012</p>
        <h5> About Project</h5>
        <p> Sed libero quam, gravida in tristique non, dapibus eget velit. Aliquam sed arcu
          tincidunt ante eleifend tempus.<br />
          Sed libero quam, gravida in tristique non, dapibus eget velit. Aliquam sed arcu
          tincidunt ante eleifend tempus. </p>
        <a class="button" href="">Visit online</a> </div>
      <div class="span8">
        <ul class="portfolio_showcase">
          <li> <img src="${basePath }assets/img/1.png" alt="Image" /></li>
          <li> <img src="${basePath }assets/img/2.png" alt="Image" /></li>
          <li> <img src="${basePath }assets/img/3.png" alt="Image" /></li>
          <li> <img src="${basePath }assets/img/4.png" alt="Image" /></li>
        </ul>
        <div id="number" class="work-pagination"> </div>
      </div>
    </div>
  </div>
</div>

<!-- Footer
    ================================================== -->
	<%@ include file="../../../common/footer.jsp"%>
<!-- Le javascript
    ================================================== --> 
<!-- Placed at the end of the document so the pages load faster --> 
<%@ include file="../../../common/commonjs.jsp" %>
<div style="display:none"></div>
</body>
</html>
