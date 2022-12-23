<?php
    if(isset($_POST['submit'])){
        $string=$_POST['email'];
    if(ereg('.@',$string)){
           echo "Done";
    }
    else{
        echo "fail";
    }
    }
?>