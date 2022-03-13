<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<style type="text/css">
body{
background-image: url("../Assigment/view/images/postgresql.png");
}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-3"></div>
<div class="col-8">
<form action="/Assigment/RegServlet" method="POST">
<div class="card" style="width: 30rem;">
  <div class="card-header">
    Đăng ký
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item"><label for="username" class="form-label">USERNAME</label></li>
    <li class="list-group-item"><input type="text" class="form-control" placeholder="username" required="required" id="username" name="username"/></li>
 <li class="list-group-item"><label for="passwd" class="form-label">PASSWORD</label></li>
    <li class="list-group-item"><input type="password" class="form-control" placeholder="*******" required="required" id="passwd" name="passwd"/></li>
     <li class="list-group-item"><label for="fullname" class="form-label">FULLNAME</label></li>
    <li class="list-group-item"><input type="text" class="form-control" placeholder="Michael Jackson" required="required" id="fullname" name="fullname"/></li>
     <li class="list-group-item"><label for="email" class="form-label">EMAIL</label></li>
    <li class="list-group-item"><input type="email" class="form-control" placeholder="example@email.com" required="required" id="email" name="email"/></li>
    <div class="row">
    <div class="col-8">
    <div class="${reg}" role="alert">
        ${reg_message}
</div>
    </div>
    <div class="col-3"><button class="btn btn-success">Sign up</button></div>
    </div>
  </ul>
</div>
</form>

</div>
</div>
</body>
</html>