<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <Form method="post">
        <label for="">Enter String</label>
        <input type="text" name="string"><br><br>
        <input type="submit" name="submit">
    </Form>
    <?php
    if(isset($_POST['submit']))
{
     function length(){
         $string=$_POST['string'];
         $string_lenght = 0;
     while($string[$string_lenght] != ''){
         $string_lenght++;
     
     echo "Total String Length : ". $string_lenght;
     }
     length();
     function vowels(){
          $string=$_POST['string'];
          $vowels = array('a','e','i','o','u');
         $len = strlength($string);
         $num = 0;
         for($i=0; $i<$len; $i++){
             if(in_array($string[$i], $vowels))
             {
                 $num++;
             }
         }
          echo "Number of vowels : $num";
     }
    function lower(){
         $string=$_POST['string'];
         echo "strtolower($string)";
         echo "ucwords($string)";
    }
    lower();
}
}
    
    ?>
</body>
</html>