# Simple_Calculator_Automation  

## Basic functionalities of a simple calculator application is automated using Appium on an emulator device powered by Android studio.

Basic operations of a calculator are tested included: 

* Addition  

* subtraction  

* Multiplication  

* Division
  
### Technology used:  

* Tool: Selenium Webdriver  
* IDE: Intellij, Android Studio 
* Build tool: Gradle  
* Language: Java  
* Test_Runner: Appium 
* Framework: TestNG 

### Prerequisites 
* Install Android Studio latest version 
* Install Appium 1.17.1 
* Install jdk 8 or any LTS version  
* Configure ANDROID_HOME, JAVA_HOME and GRADLE_HOME 
* Stable internet connection
* A PC/Laptop having minimum ram of 8GB 

### Project Run 
#### Appium 
* Create an emulator/virtual device in Android Studio and run it.
* Check the uuid of that emulator in cmd with "adb devices" command.
* Open Appium and start server. Then open inspector tool.
* Set the desired capabilities with following information:    

```
  "deviceName": "My Device",
  "platformName": "Android",
  "uuid": Enter your uuid here,
  "platformVersion": Enter your android version,
  "appPackage": "com.google.android.calculator",
  "appActivity": "com.android.calculator2.Calculator"
``` 

* Save this activity and click start session  
### Appium Environment: 
![image](https://user-images.githubusercontent.com/62753355/190922576-ca78d53a-97db-49e6-b948-ffb10919047c.png)


### Run the automation script in the terminal by following command: 
 ```
 gradle clean test 
```
 ### A report generated and will be looking like this:  
 ![report1](https://user-images.githubusercontent.com/62753355/190921988-a7d40e5c-e984-4196-b4d0-6bf2807071cd.PNG)    
 
 ![image](https://user-images.githubusercontent.com/62753355/190922367-b21d6ccd-9860-4e69-89e7-27de4fb6d581.png)

 
### Video of test run:
  

https://user-images.githubusercontent.com/62753355/190922321-623c9bf2-86ff-4a01-a0aa-826661208cb6.mp4


 
  

