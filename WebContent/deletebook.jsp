<!DOCTYPE HTML>
<html>
	<head>
		<title>BookApp</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body>

		<!-- Header -->
			<header id="header">  
				<div class="inner">
					<a href="menu.jsp" class="logo"><strong>BOOK APPLICATION</strong></a>
					<nav id="nav">
						
						<a href="login.jsp">Logout</a>

						
					</nav>
					<a href="#navPanel" class="navPanelToggle"><span class="fa fa-bars"></span></a>
				</div>
			</header>
		<!-- Banner -->
			<section id="banner">
				<div class="inner">
					
<footer id="footer">
				<div class="inner">

					<h3>DELETE BOOK</h3>

					<form action="DeleteServlet" method="post">

                        <center>
						<div class="field half">
							<label for="bookid">Book ID</label>
							<input name="bookid" id="bookid" type="text" placeholder="Enter Book ID">
						</div>
    </center>
						
						<ul class="actions">
							<li><input value="DELETE" class="button alt" type="submit"></li>
						</ul>
					</form>

					<div class="copyright">
						&copy; Untitled. Design: <a href="https://templated.co">TEMPLATED</a>. Images: <a href="https://unsplash.com">Unsplash</a>.
					</div>

				</div>
			</footer>

					
			</section>

  
	

		<!-- Footer -->
			
		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>