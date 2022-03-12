<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Assigment</title>
<style type="text/css">

header{
padding: 0;
}

</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
<div class="row">
<header>
<jsp:include page="layout/banner.jsp">
<jsp:param value="../Assigment/view/images/banner.png" name="images_banner"/>
</jsp:include>
<div class="row">
<jsp:include page="layout/navbar.jsp" >

<jsp:param  name="login_home" value="${login[0]}"/>
<jsp:param  name="login_home" value="${login[1]}"/>
<jsp:param  name="login_home" value="${login[2]}"/>
<jsp:param  name="login_home" value="${login[3]}"/>
</jsp:include>
</div>
</header>
</div>
</div>
</body>
</html>