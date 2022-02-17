<?php

/* 

 */
 
 // set our url 

$url = "https://swapi.dev/api/people/3";


$curl = curl_init($url);
curl_setopt($curl, CURLOPT_URL, $url);
// return the transfer as a string, also with setopt()
curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);

$headers = array(
   "Accept: application/json",
);
curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);

curl_setopt($curl, CURLOPT_SSL_VERIFYHOST, false);
curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, false);

$resp = curl_exec($curl);
$httpcode = curl_getinfo($curl, CURLINFO_HTTP_CODE);
// close curl resource to free up system resources
curl_close($curl);

$parsed_resp = json_decode($resp);
echo 'HTTP Response Code: '.$httpcode.'<br>';
//echo $parsed_resp;
//if statement to check if Response status is ok
if($httpcode == 200){
    echo 'HTTP Response Status: OK<br>';
	//for loop to pass the value for skin color
foreach ($parsed_resp as $key => $value) {
    if($key == 'name' || $key == 'skin_color'){
        echo 'Returned '.$value.' for '.$key.'<br>';
    }
}
}elseif($httpcode == 400){
    echo 'HTTP Response Status: Bad Request<br>';
}elseif($httpcode == 401){
    echo 'HTTP Response Status: Unauthorized<br>';
}elseif($httpcode == 403){
    echo 'HTTP Response Status: Forbidden<br>';
}elseif($httpcode == 404){
    echo 'HTTP Response Status: Not Found<br>';
}elseif($httpcode == 408){
    echo 'HTTP Response Status: Request Timeout<br>';
}elseif($httpcode == 500){
    echo 'HTTP Response Status: Internal Server Error<br>';
} else {
    echo 'Other error occurred';
}
?>
