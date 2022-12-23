<?php
     if(isset($_POST['submit'])){
        function split(){
            $string=$_POST['str'];
            $select=$_POST['select'];
            $split=explode($select,$string);
            print_r($split);
        }
        split();
        function replace(){
            $string=$_POST['str'];
            $select=$_POST['select'];
            $replace=str_replace($select,'&',$string);
            echo $replace;
        }
        replace();
         function last(){
             $string=$_POST['str'];
             $select=$_POST['select'];
             $last=strrstr($string);
             echo $last;
         }
         replace();
    }
    ?>