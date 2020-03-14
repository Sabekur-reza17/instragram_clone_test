<%--
  Created by IntelliJ IDEA.
  User: Sabekur
  Date: 3/14/2020
  Time: 1:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!-- GLOBAL HEADER -->

<jsp:include page="../common/header.jsp"></jsp:include>

<html>
<head>
    <title>Profile</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/profile.css">
</head>
<body>
<header>

    <div class="container">

        <div class="profile">

            <div class="profile-image" >

                <img class="dilog_opener" src="${pageContext.request.contextPath}${user.userImage}" alt="" height="150" width="150">

            </div>

            <div class="profile-user-settings">

                <h1 class="profile-user-name">${user.username}</h1>

                <button class="btn profile-edit-btn">Edit Profile</button>

                <a class="btn profile-edit-btn" href="${pageContext.request.contextPath }/logout">Log Out</a>
                <!-- <button class="btn profile-settings-btn" aria-label="profile settings"><i class="fas fa-cog" aria-hidden="true"></i></button> -->

            </div>

            <div class="profile-stats">

                <ul>
                    <li><span class="profile-stat-count">${post_size}</span> posts</li>
                    <li><span class="profile-stat-count">0</span> followers</li>
                    <li><span class="profile-stat-count">0</span> following</li>
                </ul>

            </div>

            <div class="profile-bio">

                <p><span class="profile-real-name">${user.userFullName}</span> Lorem ipsum dolor sit, amet consectetur adipisicing elit 📷✈️🏕️</p>

            </div>

        </div>
        <!-- End of profile section -->

    </div>
    <!-- End of container -->

</header>

</body>
</html>
