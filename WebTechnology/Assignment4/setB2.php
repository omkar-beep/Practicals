<?php
$example = array("An example","Another example","Last example");
$searchword = 'last';
$matches = array_filter($example, function($var) use ($searchword) { return preg_match("/\b$searchword\b/i", $var); });


$example = array('An example','Another example','One Example','Last example');
$searchword = 'last';
$matches = array();
foreach($example as $k=>$v) {
    if(preg_match("/\b$searchword\b/i", $v)) {
        $matches[$k] = $v;
    }
}


?>