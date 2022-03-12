<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
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
<div class="row"><br><br><br><br><br></div>
 <div class="row"> 
 <div class="col-3"></div>
 <div class="col-9">
 <form action="/Assigment/LoginServlet" method="POST">
<div class="card bg-dark" style="width: 30rem;">
  <div class="card-header text-light h1">
   Login
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item"><label for="username">UserName</label></li>
    <li class="list-group-item"><input class="form-control" type="text" name="username" required="required" id="username" placeholder="username" value="${username}"/></li>
      <li class="list-group-item"><label for="passwd">PassWord</label></li>
    <li class="list-group-item"><input class="form-control" type="password" name="passwd" required="required" id="passwd" placeholder="*********" value="${passwd}"/></li>
     <li class="list-group-item"><input class="" type="checkbox" name="remember" id="remember" value="true"/><label for="remember">Remember me ?</label></li> 
     <div class="row">
     <div class="col-8">
     <div class="${message_alert}" role="alert">${message}</div>
     </div>
     <div class="col-4 m-0"><li class="list-group-item bg-dark"><button class="btn btn-success">Đăng nhập</button></li></div>
     </div>
  </ul>
</div>
</form>
 </div>
 </div>
</div>

</body>
</html>