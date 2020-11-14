# Preview

Use [WebClient](https://telecommand.netlify.app/) from Students End

Use Android App to connect with Arduino Controller (Laboratory End)

# Introduction

Every lab has some fixed expreiment which can be done by simple rotation, trasformation and turning switch on and off. These actions can be performed using simple arduino made controllers. So in this project we made an arduino controller to control these movement within the lab remotely. Moreover, as students have to collect experiment related data from different angle, there will be multiple live video stream from differnt point of view of the experiment. Lab assitant will set up the arduino controller and the cameras before starting the lab. As a result students will be to have __an experience of conducting the exeriment with practical data and insight which no simulation can provide__.  

In current online educational system, students are provided with single video to learn about an experiment from it. They can't gain proper view of the conducted experiment. In our platform we provided a way to share multiple videos of a single a experiment from a different point of view. Using these, they will have a better understanding of the on-going experiment.  

Students can ask questions to the teachers who is present in the lab. He can also review also review the experiment conducted remotely.  

Having lab teacher(s) and lab assistant(s) in a big lab is not a big deal keeping social distance during the corona pandemic.

# Features

- Pre-recorded lab instructions with __mutiple cameraview.__
- Students can get real __practice experience__ by controling aparatus, collecting lab data and conducting experiment
- __Low latency__ command sending with realtime database.
- Low latency video stream with WebRTC(Currently used google meet as there was not enought time to implement it).
- All lab class all in one place.

# Future plan

- Moving from google meet to self-develped WebRTC based video streaming
- Changing camera position remotely which is done by the lab assitant currently.
- Developing web app prototypes to a functionable educational platform where other academic activies can also be conducted.

# Development

__An overview of the whole project__   
![](https://i.ibb.co/BwjNtvK/Hack-the-verse.png)  

__Use case diagram__  

![](https://i.ibb.co/StSppfy/Use-Case-Diagram.png)

# Used Technologies

-  __Firebase realtime database:__ for sending command from web client(student) to arduino device(lab).
- __Firebase firestore:__ to store class links
- __Google Auth:__ for student authorization.
- __React__: for web app(student end).
- __Android__: for controlling arduino device.
- __Arduino__: for performing lab activities remotely(from home).

# How to use

_Step 1:_ Login to the [student webapp](https://telecommand.netlify.app/) using google account.  
![](https://i.ibb.co/wSQRJ0k/image.png)  
_Step 2:_ Navigate to class lectures or upcoming lab classes from sidebar.  
![](https://i.ibb.co/ZKNZjqd/image.png)  
_Step 3:_ Watch single experiment from multiple cameraview for better understanding.   

>> _\[video-1] \[video-2] \[video-3] will contain video of same experiment from diffrent angle.  
>> As we didn't have lab access we provided sample lab videos from youtube._   


![](https://i.ibb.co/CKPtGzt/image.png)  
![](https://i.ibb.co/dcpQ1x9/image.png) 
_Step 4:_ find all scheduled lab classes.  
![](https://i.ibb.co/xq10X34/image.png)  
_Step-5_ Join lab class with single tap.  
![](https://i.ibb.co/zZmxFj2/image.png)  
![](https://i.ibb.co/4t047w2/image.png)  
_Step-6:_ control remote lab devices from student end.  
![](https://i.ibb.co/5WNNmps/image.png)  

__LAB Side__
_Step 1:_ Configure device (here, it should hold a thermometer, which could be moved in to liquid or out)  
![](https://i.ibb.co/5sHMh2w/IMG-20201115-034144.jpg)  
_Step 2:_ Run Android App  
<img src="https://i.ibb.co/pK2YH1C/Screenshot-2020-11-15-04-24-30-138-com-engliplan-telelabclient.jpg" height=400>  
_Step 3:_ Connect to Arduino via Bluetooth  
<img src="https://i.ibb.co/jVcVvfF/Screenshot-2020-11-15-04-24-16-364-com-engliplan-telelabclient.jpg" height=400>  

__READY TO GO__

# Use cases
- __Physics lab:__ finding jule's constant( or mechanical equivalent of heat)  for exmaple
- __Chemistry lab:__ Doing titration for example
- __Bilogy lab:__ Watching somthing uder microscope and controlling the microscope to focus the slide for example. 
