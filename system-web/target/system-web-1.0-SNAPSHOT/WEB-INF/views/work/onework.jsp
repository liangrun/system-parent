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
      <div class="container"> <a class="brand" href="index.html"> <img src="assets/img/Logodark.png" alt="Logo"></a>
        <div id="main-nav">
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li class=""><a href="${home }">Home</a> </li>
              <li class="dropdown active"><a class="dropdown-toggle" data-toggle="dropdown" href="javascript:"> Work <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="${one-work }">One Column</a></li>
                  <li><a href="work-two-columns.html">Two Column</a></li>
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
          <div class="span4">
            <h1> Work</h1>
          </div>
          <div class="span8">
            <ul id="work-filter">
              <li><a href="#" data-filter="*" class="btn btn-success ione-col">Show All</a></li>
              <li><a href="#" data-filter=".graphics" class="btn ione-col">Graphics</a></li>
              <li><a href="#" data-filter=".nature" class="btn ione-col">Nature</a></li>
              <li><a href="#" data-filter=".food" class="btn ione-col">Food</a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="work" id="portfolio">
    <div class="row-fluid work-item food">
      <div class="span3">
        <h2> Delicious World</h2>
        <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
          incididunt ut labore et dolore magna aliqua.</p>
        <h5> Skills/Tools Used</h5>
        <ul>
          <li>Adobe Photoshop</li>
          <li>Adobe Dreamweaver</li>
          <li>HTML5/CSS3</li>
        </ul>
      </div>
      <div class="span9 work-item-image-container">
        <div class="work-item-overlay">
          <div class="inner">
            <ul>
              <li><a rel="prettyPhoto[gallery]" href="assets/img/work8.jpg" class="gallery-btn">View
                Gallery</a></li>
              <li><a class="detail-link" href="work-details.html">View Details</a></li>
            </ul>
          </div>
        </div>
        <img src="assets/img/work8.jpg" alt="Delicious World" /> </div>
    </div>
    <div class="row-fluid work-item nature">
      <div class="span3">
        <h2> Beach Heat</h2>
        <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
          incididunt ut labore et dolore magna aliqua.</p>
        <h5> Skills/Tools Used</h5>
        <ul>
          <li>Adobe Photoshop</li>
          <li>Adobe Dreamweaver</li>
          <li>HTML5/CSS3</li>
        </ul>
      </div>
      <div class="span9 work-item-image-container">
        <div class="work-item-overlay">
          <div class="inner">
            <ul>
              <li><a rel="prettyPhoto[gallery]" href="assets/img/work3.jpg" class="gallery-btn">View
                Gallery</a></li>
              <li><a class="detail-link" href="work-details.html">View Details</a></li>
            </ul>
          </div>
        </div>
        <img src="assets/img/work3.jpg" alt="Beach Heat" /> </div>
    </div>
    <div class="row-fluid work-item graphics">
      <div class="span3">
        <h2> iPhonegraphy</h2>
        <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
          incididunt ut labore et dolore magna aliqua.</p>
        <h5> Skills/Tools Used</h5>
        <ul>
          <li>Adobe Photoshop</li>
          <li>Adobe Dreamweaver</li>
          <li>HTML5/CSS3</li>
        </ul>
      </div>
      <div class="span9 work-item-image-container">
        <div class="work-item-overlay">
          <div class="inner">
            <ul>
              <li><a rel="prettyPhoto[gallery]" href="assets/img/work1.jpg" class="gallery-btn">View
                Gallery</a></li>
              <li><a class="detail-link" href="work-details.html">View Details</a></li>
            </ul>
          </div>
        </div>
        <img src="assets/img/work1.jpg" alt="iPhonegraphy" /> </div>
    </div>
    <div class="row-fluid work-item graphics">
      <div class="span3">
        <h2> Cables and Balls</h2>
        <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
          incididunt ut labore et dolore magna aliqua.</p>
        <h5> Skills/Tools Used</h5>
        <ul>
          <li>Adobe Photoshop</li>
          <li>Adobe Dreamweaver</li>
          <li>HTML5/CSS3</li>
        </ul>
      </div>
      <div class="span9 work-item-image-container">
        <div class="work-item-overlay">
          <div class="inner">
            <ul>
              <li><a rel="prettyPhoto[gallery]" href="assets/img/work2.jpg" class="gallery-btn">View
                Gallery</a></li>
              <li><a class="detail-link" href="work-details.html">View Details</a></li>
            </ul>
          </div>
        </div>
        <img src="assets/img/work2.jpg" alt="Cables and Balls" /> </div>
    </div>
    <div class="row-fluid work-item graphics">
      <div class="span3">
        <h2> Fireworks</h2>
        <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
          incididunt ut labore et dolore magna aliqua.</p>
        <h5> Skills/Tools Used</h5>
        <ul>
          <li>Adobe Photoshop</li>
          <li>Adobe Dreamweaver</li>
          <li>HTML5/CSS3</li>
        </ul>
      </div>
      <div class="span9 work-item-image-container">
        <div class="work-item-overlay">
          <div class="inner">
            <ul>
              <li><a rel="prettyPhoto[gallery]" href="assets/img/work6.jpg" class="gallery-btn">View
                Gallery</a></li>
              <li><a class="detail-link" href="work-details.html">View Details</a></li>
            </ul>
          </div>
        </div>
        <img src="assets/img/work6.jpg" alt="Fireworks" />< </div>
    </div>
    <div class="row-fluid work-item nature">
      <div class="span3">
        <h2> Beauty</h2>
        <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
          incididunt ut labore et dolore magna aliqua.</p>
        <h5> Skills/Tools Used</h5>
        <ul>
          <li>Adobe Photoshop</li>
          <li>Adobe Dreamweaver</li>
          <li>HTML5/CSS3</li>
        </ul>
      </div>
      <div class="span9 work-item-image-container">
        <div class="work-item-overlay">
          <div class="inner">
            <ul>
              <li><a rel="prettyPhoto[gallery]" href="assets/img/work4.jpg" class="gallery-btn">View
                Gallery</a></li>
              <li><a class="detail-link" href="work-details.html">View Details</a></li>
            </ul>
          </div>
        </div>
        <img src="assets/img/work4.jpg" alt="Fireworks" /> </div>
    </div>
    <div class="row-fluid work-item nature">
      <div class="span3">
        <h2> Bridge</h2>
        <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
          incididunt ut labore et dolore magna aliqua.</p>
        <h5> Skills/Tools Used</h5>
        <ul>
          <li>Adobe Photoshop</li>
          <li>Adobe Dreamweaver</li>
          <li>HTML5/CSS3</li>
        </ul>
      </div>
      <div class="span9 work-item-image-container">
        <div class="work-item-overlay">
          <div class="inner">
            <ul>
              <li><a rel="prettyPhoto[gallery]" href="assets/img/work7.jpg" class="gallery-btn">View
                Gallery</a></li>
              <li><a class="detail-link" href="work-details.html">View Details</a></li>
            </ul>
          </div>
        </div>
        <img src="assets/img/work7.jpg" alt="Bridge" /> </div>
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
