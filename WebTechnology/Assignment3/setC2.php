<?php
    if(isset($_POST['submit'])){
         function delete(){
         $str1=$_POST['1st'];
         // $str2=$_POST['2nd'];
         $delete=substr($str1,0,strpos($str1," ",8));
         echo "Upadeted String:$delete    ";
     }
     delete();
    function add(){
        $str1=$_POST['1st'];
        $str2=$_POST['2nd'];
        $replace=substr_replace($str1,$str2,4,0);
        echo "Added String:$replace ";
    }
    add();
    function replaceone(){
        $str1=$_POST['1st'];
        $str2=$_POST['2nd'];
        $replace=substr_replace($str1,$str2,0,2);
        echo "Replaced Character:$replace ";
    }
    replaceone();

    function replace(){
        $str1=$_POST['1st'];
        $str2=$_POST['2nd'];
        $replace=substr_replace($str1,$str2,0);
        echo "Replaced String:$replace ";
    }
    replace();
}
    ?>