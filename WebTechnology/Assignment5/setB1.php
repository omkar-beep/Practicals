
<?php
{
if (file_exists('student.dat'))

$f=fopen('student.dat','r');

echo "<br/><br/><br/>";

echo "<table border type=3 align=center>";
echo "<tr><td colspan=7 align=center><h3>Student Records.</h3></td></tr>";
echo "<tr><td align=center>Roll no.</td>";
echo "<td align=center>Name.</td>";
echo "<td align=center>Electronics</td>";
echo "<td align=center>Computer.</td>";
echo "<td align=center>Maths</td>";
echo "<td align=center>Total.</td>";
echo "<td align=center>Percentage.</td></tr>";
while(!feof($f))
{

$d= fgets($f);
$s=explode(' ',$d);

if(!empty($s[0]) && !empty($s[1]) && !empty($s[2]) && !empty($s[3]) && !empty($s[4]))
{

$m1=$s[2];
$m2=$s[3];
$m3=$s[4];
$total=$m1+$m2+$m3;
$p=($total/300)*100;

echo "<tr><td align=center>$s[0]</td>";
echo "<td align=center>$s[1]</td>";
echo "<td align=center>$m1</td>";
echo "<td align=center>$m2</td>";
echo "<td align=center>$m3</td>";
echo "<td align=center>$total</td>";
echo "<td align=center>$p %</td></tr>";
}
}
echo "</table>";
}

?>