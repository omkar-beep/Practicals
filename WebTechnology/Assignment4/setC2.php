<?php
function mergeSort($array) {
    echo "array = " . json_encode($array) . "\n";
    $count = count($array);
    if ($count == 1) {
        return $array;
    }
    return merge(
        mergeSort(array_splice($array, 0, $count / 2)),
        mergeSort($array)  // use the leftovers
    );
}

function merge($half1, $half2) {
    do {
        $temp[] = $half1[0] < $half2[0] ? array_shift($half1) : array_shift($half2);
    } while(isset($half1[0], $half2[0]));
    return array_merge($temp, $half1, $half2);  // gather any potential remaining elements
}

$input = [4, 2, 7, 5, 3];
$input = mergeSort($input);
var_export($input);






?>