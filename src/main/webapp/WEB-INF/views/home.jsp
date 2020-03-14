<%--
  Created by IntelliJ IDEA.
  User: Sabekur
  Date: 3/12/2020
  Time: 12:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ta" uri="https://github.com/dernasherbrezon/jtimeago"%>

<jsp:include page="common/header.jsp"/>
<html>
<head>
    <title>Insta Home</title>
</head>
<body>
<section id="gallary">
    <div class="main_body">
        <c:forEach items="${post_list }" var="posts">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8  border">
                        <div class="row">
                            <div class="col-lg-1">
                                <div class="pro">
                                    <a class="proimg" href="#"><img src="${pageContext.request.contextPath }${ posts.user.userImage }" alt=""></a>
                                </div>
                            </div>
                            <div class="col-lg-10 padd">
                                <div class="text1">
                                    <a class="tx-a1" href="#">${posts.user.username}</a>
                                </div>
                                <div class="text2">
                                    <a class="tx-a2" href="#">${posts.user.userEmail }</a>
                                </div>
                            </div>

                        </div>

                        <div class="row">
                            <div class="col-lg-12 p-0">
                                <div class="big-img">
                                    <img src="${pageContext.request.contextPath }${ posts.postsImage }" alt="">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-11">
                                <div class="icon_3">
                                    <ul class="i3-ul">
                                        <li class="i3-li"><a href="#"><i class="flaticon-heart"></i></a></li>
                                        <li class="i3-li"><a href="#"><i class="flaticon-comment"></i></a></li>
                                        <li class="i3-li"><a href="#"><i class="flaticon-plane"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col-lg-1">
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-lg-12 eye">
                                <div class="like">
                                    <a class="lve-like">1 like</a>
                                    <span><a class="love-like"><b>${posts.user.username}</b> ${posts.postsText}</a><br></span>
                                    <div class="love-like">
                                        <time class="published" >
                                            <ta:formatDate value="${posts.createdAt }"
                                                           pattern="dd MMM yyyy HH:mm" />
                                        </time>
                                    </div><br>
                                </div>
                            </div>
                        </div>
                        <div class="row top">
                            <div class="col-lg-10 p-0">
                                <form action="">
                                    <input type="text" placeholder="Add a comment" class="comments comment-query">

                                </form>
                            </div>
                            <div class="col-lg-2">
                                <input class="btn comment-query-submit" type="submit" value="Submit">
                            </div>
                        </div>
                        <div class="row"></div>
                    </div>

                    <div class="col-lg-4">
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>

</body>
</html>
