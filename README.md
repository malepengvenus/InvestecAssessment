# InvestecAssessment
Technology stack
Selenium WebDriver
Java SE 8
Gradle
TestNG
PHP

PART ONE

Please download Investec folder for UI

Installation

You must have Java installed. The recommended version is Java 8. Download it from Oracle and install it.
http://www.oracle.com/technetwork/java/javase/downloads/index.html

The recommended development environment is Eclipse.
https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-12/R/eclipse-inst-jre-win64.exe 

Create Workspace in Eclipse
This workspace named "C:\workspace" "D:\workspace" is like any other folder, which will store all the test scripts.

Import Java Project by clicking on File > Import> General > Existing Projects into Workspace > Browse Java Project ad click finish.

Click on Help in Eclipse > Eclipse MarketPlace > Search for TestNG in the search bar > Click go > Click install TestNG.
If you cannot find TestNG please download jar files from this link https://jar-download.com/artifacts/org.testng/testng/6.9.9/source-code.

Extract the folder downloaded from above link.
Right click project name > Build path > configure Build path > Under Libraries on the right side click Add External Jars > Import all the jar files from the folder extracted.

Inside the project name there is package called 'Chromedriver' with chrome driver version 98.0.4758.102, please check your browser version to see if it will be compatible to run thi version of driver.if not you can download your version that will work with your chrome browser from below link:
https://chromedriver.chromium.org/downloads

Then you can extract it and drag and drop it to chromedriver package in our project.

By running the application you should open a pack called testscript > open TestRunner.java > Right click and Click Run as TestNG Test.

PART TWO

Please download InvestecAPI folder

Programming language: PHP

Tools: Netbeans/Notepad++ and Xampp

Download IvestecAPI folder to your local machine and extract it.
Click here to XAMPP download for Windows: http://www.apachefriends.org/en/xampp-windows.html
After you have downloaded XAMPP, run the setup. The warning message dialog window shown below appears click ok.
In the succeeding screen, click next.
Configure xampp by moving to localdrive(C:, D:) > Xampp > htdocs > delete all the indexes.

Start xampp control panel and on control panel start 'Apache and mySql'.

After successful installation, go to localdrive(C:, D:) > Xampp > htdocs > paste the IvestecAPI folder
Go to any browser type http://localhost/investecAPI/APITest.php

