<?php
error_reporting(0);
include("connection.php");
$query ="SELECT  `username`, `pwd` FROM `batch`";
$data = mysqli_query($conn,$query);
$total = mysqli_num_rows($data);
$result = mysqli_fetch_assoc($data);
//echo $total;
if($total!=0){
    echo "Table have records";
}
else{
    echo"Table is full";
}
echo $result['name']."".$result['address']."".['username']."".['pwd'];



?>