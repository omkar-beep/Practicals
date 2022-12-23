<?php
            $str = $_POST['string'];
            function string_length($str)
            {
                $count = 0;
                while($str[$count] != null){
                    $count++;
                }
                echo "Total String Length : ".$count;
                echo "<br>";
            }

            function vowel($str)
            {
                $vowel = 0;
                $len = strlen($str);
                for ($i = 0; $i < $len; $i++) { 
                    if ($str[$i]=='a' ||$str[$i]=='e' ||$str[$i]=='i' ||$str[$i]=='o' ||$str[$i]=='u') {
                        $vowel++;
                    }
                }
                echo "The Total Number of vowels in string is: ".$vowel;
                echo "<br>";
            }

            function case_convert($str)
            {
                $lower = strtolower($str);
                echo "The lowercase is: ".$lower;
                echo "<br>";
                $title = ucwords($str);
                echo "The titlecase is: ".$title;
                echo "<br>";
            }
            function padding($str)
            {
                echo(str_pad($str,20,"*",STR_PAD_BOTH));
                echo "<br>";
            }
            function remove_whitespaces($str)
            {
                echo(trim($str));
                echo "<br>";
            }
            function reverse($str)
            {
                echo(strrev($str));
                echo "<br>";
            }
            switch ($_POST["radio"]) {
                case '1':
                    string_length($str);
                    break;
                case '2':
                    vowel($str);
                    break;
                case '3':
                    case_convert($str);
                    break;
                case '4':
                    padding($str);
                    break;
                case '5':
                    remove_whitespaces($str);
                    break;
                case '6':
                    reverse($str);
                    break;
                default:
                    echo "Please Choose from the options above";
                    break;
            }
    ?>