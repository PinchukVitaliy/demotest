<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>User Edit</title>
</head>
<body>
    <h1>Edit User Page</h1>
    <form name="user" action="/updateUser" method="post" class="container-fluid">
        <div class="form-group">
            <label for="name">Id</label>
            <input type="text" class="form-control" name="id" value="${user.id}" readonly>
        </div>
        <div class="form-group">
            <label for="name">Name</label>
            <input type="text" class="form-control" name="name" value="${user.name}">
        </div>
        <div class="form-group">
            <label for="email">Email address</label>
            <input type="email" class="form-control" name="email"  value="${user.email}">
        </div>
        <div class="form-group">
            <label for="age">Age</label>
            <input type="text" class="form-control" name="age"  value="${user.age}">
        </div>
        <button type="submit" class="btn btn-primary">Edit save User</button>

        <br>
        <a href="/users">Beck on Users List page</a>
    </form>
</body>
</html>