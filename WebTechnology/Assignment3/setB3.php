<?php
    if(isset($_POST['submit'])){
        $name=$_POST['name'];
        $clg=$_POST['clg'];
        $msg=$_POST['msg'];
        function massage($name,$clg,$msg){
          echo "$msg, my Name is $name and my Collage Name is $clg.";
        }
       massage($name,$clg,$msg);
    }
    
    ?>