<?php
function cmp($a, $b)
{
    return $b['avgSearchVolume'] - $a['avgSearchVolume'];
}

usort($array, "cmp");
?>