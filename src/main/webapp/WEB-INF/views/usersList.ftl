<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Users List</title>
</head>
<body>
    <h1>Page Users List</h1>

    <table class="table">
        <thead class="black white-text">
        <tr>
            <th scope="col">#/id</th>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col">Age</th>
            <th scope="col"><button><a href="/addUser">Create User</a></button></th>
        </tr>
        </thead>

        <tbody>
            <#list users as user>
            <tr>
                <th scope="row">${user.id}</th>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.age}</td>
                <td><a href="/user/${user.id}">Info</a>| <a href="/update/${user.id}">Edit</a> | <a href="/delete/${user.id}">Delete</a></td>
            </tr>
            </#list>
        </tbody>
    </table>

</body>
</html>