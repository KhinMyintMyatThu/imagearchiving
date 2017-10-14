<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Image Archival System</title>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/index.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>
<style>
	p{
		font-size: 20px;
	}
</style>
</head>
<body>
	<div id="main_container">
		<div id="header">
			<div id="logo"><a href="index.jsp" style="text-decoration: none; color: white">Image Archival System</a></div>
			<div class="login_form">
				<form action="Login" method="post" id="login_form">
					<table>
						<tbody>
							<tr>
								<td>Email</td>
								<td>Password</td>
							</tr>
							<tr>
								<td><input type="text" placeholder="Email" required
									name="email" /></td>
								<td><input type="password" placeholder="Password" required
									name="password" /></td>
								<td><input type="submit" value="Log In" /></td>
								<%
									String loginMessage = (String) request.getSession(false).getAttribute("message");
									if (loginMessage != null) {
								%>
								<span class="error"><%=loginMessage%></span>
								<%
									}
								%>
								<td>&nbsp;&nbsp;&nbsp;<a href="html/about.jsp"
									style="text-decoration: none"><i class="fa fa-info"
										style="color: white"></i><span style="color: white">nfo</span></a></td>
							</tr>

						</tbody>
					</table>
				</form>
			</div>
		</div>
		<div id="body_section">
			<h1 align="center">Image Archival System</h1>
			<p>This system is the online photo management system. You can
				share your photos with your friends by tagging them and explore your
				friends photos.</p>
			<br>
			<h3>Login/Registration</h3>
			<p>To be able to use this system, you must be a registered user.
				You must fill first name, last name, email, password, date of birth,
				etc. After your registration is done, you can now login to the
				system.</p>
			<h3>Photostreams</h3>
			<p>As soon as you have logged into the system, you can see all of
				your photos that you uploaded to the system. You can see photo
				detail such as description about photo, created time, etc. by
				clicking on image. You can also delete the specific by clicking
				delete icon.</p>
			<h3>Tagged Photostreams</h3>
			<p>In tagged photostreams page, you can see all of the photos
				that you was tagged in other people photos. You can also see photo
				detail such as description about photo, created time, etc. by
				clicking on image. </p>
			<h3>Explore friends</h3>
			<p>On that page, you can explore new friends, you can see people
				whom you are following and who follow you. You can make your
				friendship in this page.</p>
			<h3>Upload photo</h3>
			<p>You can upload one or more photo on that page. You can add
				description to your photo. You can tag your photo or photos with
				keywords with which can be search by other people. You can also
				share your photo or photos with other people if they are friends
				with you that is you follow them and they follow you. Note that if
				you didn't choose any photo and fill other fields the system will be
				uploaded nothing.</p>
			<h3>Search</h3>
			<p>You can search photos by two ways: search by keyword and
				search photo by people. After you have typed and clicked search
				button, you can see three matched searches such as matched with
				keywords, matched with photo uploaded people's name and matched with
				tagged people in photos.</p>

		</div>
	</div>
</body>
</html>