<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>User Show</title>
</head>
<body>
    <h1>Show User Page</h1>
    <div class="container-fluid">
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text">Id</span>
            </div>
            <input type="text" class="form-control" value="${user.id}" readonly>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text">Name</span>
            </div>
            <input type="text" class="form-control"  value="${user.name}" readonly>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text">Email</span>
            </div>
            <input type="text" class="form-control" value="${user.email}" readonly>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text">Age</span>
            </div>
            <input type="text" class="form-control" value="${user.age}" readonly>
        </div>

        <br>
        <a href="/users">Beck on Users List page</a>
    </div>
</body>
</html>