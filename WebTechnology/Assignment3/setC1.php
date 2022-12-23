<?php
    if(isset($_POST['submit'])){
        $java=$_POST['1'];
        $php=$_POST['2'];
        $py=$_POST['3'];
        $html=$_POST['4'];
        $css=$_POST['5'];

        $total=0;
        $per=0;
        $grade=0;
        $avg=0;

        $total=$java+$php+$py+$html+$css;
        $avg=$total/5;
        $per=($total/500)*100;
        if($avg>=90){
            $grade="A";
        }
        else if($avg>=80){
            $grade="B";
        }
        else if($avg>=70){
            $grade="C";
        }
        else if($avg>=60){
            $grade="d";
        }
        else{
            $grade="E";
        }

    }
    echo "Total:$total ";
    echo "Percentage:$per ";
    echo "Grade:$grade";
    
    ?>