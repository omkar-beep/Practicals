<?php
$first=$_POST['first'];
$second=$_POST['second'];
if(!file_exists($first))
{
die("<br>$first does not exist");
}
if(!file_exists($second))
{
die("<br>$second does not exist");
}
$fp1=fopen($first,'r') or die("unable to open first file");
$fp2=fopen($second,'a') or die("unable to open second file");
$data=fread($fp1,filesize($first));
fwrite($fp2,$data);
fclose($fp1);
fclose($fp2);
echo "<h2>Contents of first file is appanded to second file</h2>";
?>