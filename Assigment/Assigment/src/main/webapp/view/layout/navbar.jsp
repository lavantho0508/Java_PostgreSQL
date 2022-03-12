<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>

<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
  <div class="container-fluid">
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active text-light" aria-current="page" href="#">Online Entertament</a>
        </li>
        <li class="nav-item ">
          <a class="nav-link text-light" href="#">My Favorite</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle text-light" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            My Account
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
           <c:if test="${ten!=null }">
           <li><a class="nav-link disable">Chào bạn ${ten}</a></li>
           </c:if>
          <c:forEach var="login" items="${paramValues.login_home}">
           <li><a class="dropdown-item" href="../Assigment/LoginServlet">${login }</a></li>
          </c:forEach>
          
           </ul>
          </ul>
      
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>