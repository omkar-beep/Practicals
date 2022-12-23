<?php
    if(isset($_POST['submit'])){
        function small(){
        $str1=$_POST['1st'];
        $str2=$_POST['2nd'];
        if(ereg($st2,$st1))
        {
         echo "Smaller string appears at the first in larger string";
        }
        else
        {
         echo "Smaller string not at first in larger string";
        }
    }
    small();
}
    ?>