<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="post">
        <label for="">1st Number</label>
        <input type="text" value="" name="1st" id="1st"><br><br>
        <label for="">2nd Number</label>
        <input type="text" value="" name="2nd" id="2nd"><br><br>
         <input type="submit" name="submit"><br>
    </form>
    <?php
    if(isset($_POST['submit']))
    {
        function mod(){
            $num1=$_POST['1st'];
            $num2=$_POST['2nd'];
            $mod=$num1%$num2;
            echo "Mod of $num1 and $num2 is $mod ";
        }
        mod();
       function power(){
        $num1=$_POST['1st'];
        $num2=$_POST['2nd'];
        $finalnum = 1;
        while($num1 > 0){
          $finalnum = $finalnum * $num2;
          $num1--;
       }
       echo "power: $finalnum \n";
    }
    power();

    function sum(){
        $num1=$_POST['1st'];
        $i=1;
        $sum=0;
        while($i<=$num1){
            $sum += $i;
            $i++;
        }
        echo "sum: $sum";
    }
    sum();

    function fact(){
        $num2=$_POST['2nd'];
        $fact=1;
        for($x=1;$x<=$num2;$x++){
            $fact=$fact * $x;
        }
        echo "Factorial of $num2 is $fact\n";
    }
    fact();
}
    ?>
</body>
</html>