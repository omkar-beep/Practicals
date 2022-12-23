<?php
    // code for access data from the input fields to store in database
    include("connection.php");
    $name=$_POST['name'];
    $add=$_POST['address'];
    $username=$_POST['username'];
    $pwd=$_POST['pwd'];
    //query for storing database
    $query="insert into batch VALUES('$name','$add','$username','$pwd')";   ////1 dbname
    // for execute query
    if(mysqli_query($conn,$query))
    {
        echo "Regitration successful";
    }
    else{
        echo "Registration failed";
    }

    ?>