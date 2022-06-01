# Betriebsstellenverzeichnis_REST_Java

RestApi using Java Spring Boot.
It reads in a csv file with all Betriebsstellen and returns specific information
as a JSON response.

Use a get request with /betriebsstelle/RL-100numberYouWantToGetInformation <br>
e.G. /betriebsstelle/XBHS <br> <br>
if the values of the returned are NULL, there is no matching RL100-Code.

To change a file, edit the filepath at csvHandler.readCsv()method in BsvController class.


