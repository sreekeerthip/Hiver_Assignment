Table of Content 
- About the Project
    - Build with
- Getting Started
    - Prerequisites
    - Installation
- Test Coverage
- Code download Link


# About the Project:
The majour purpose of this project is to run the implement and execute the automation test script to validate "Auto Response" flow of Shared MailBox of Hiver,which is gmail based chrome extension and it is specific to Chrome.
 
   - Build with:
   
- Java
- Selenium
- TestNG
- Maven

# Getting Started:

below are the Prerequisites to get started with the test

# Prerequisites:
The majour softwares and tools which are required to setup in the machine inorder to run the test are listed below

- Java
- Selenium
- TestNG
- Maven

# Installation:

Upon Installing the above requirements.Follow the below steps to execute the steps

- Import the Maven dependencies 

- Navigate to the folder where the code is present and where the project is cloned and placed from github

- Open the command prompt

- Provide the command and hit on enter 

mvn -Dplatform=DESKTOP_WEB -Dapp_browser_url= https://hiverhq.com -Dbrowser=chrome Dbrowser_bin_path="D:\BROWSERS\browsers\windows\chrome80\chrome.exe" -Dbrowser_driver_path="D:\BROWSERS\drivers\windows\chrome\driver80.exe"  -Dbrowser_resolution_width=1366 -Dbrowser_resolution_height=768  -Dscreenshot_path=screenshot\desktopweb -Dtest=testcore.scenarios.CustomerDetails.CustomerDetails#searchFiltersTest test.

# Test Coverage:

Below parts are covered in the automation script

- Login to Gmail using Username and Password
- How to install chrome extension from script
- Accessing Hiver addon
- Admin Panel
- Shared Mailbox
- Enter “Auto Response “in shared mailbox and save it 

Download the code from : https://github.com/MoolyaSoftwareTesting/Hiver_SreeKeerthi.git

NOTE: Please note to check before pushing code into this branch as it is a "Master" Branch

