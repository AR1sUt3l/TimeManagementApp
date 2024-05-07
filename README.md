# TimeManagementApp

## Introduction

### Purpose
This Java application is intended to help users manage their time. In our current society, which is fast-paced, it is hard for some people to be able to get things done in time due to time constraints and most of the time, procastination. Therefore, I would like to design an app that can help keep track of what tasks they have to do and when they have to get it done. I also plan to add a Pomodoro Timer as it instills a sense of urgency, by allowing the user to set a time in which they will complete a certain task or tasks, and take short breaks in between, ensuring that they do not overwork themselves and will be able to sustain their concentration. In addition, an extra activity that I plan to do but am uncertain whether I am able to get it done is a badge reward system that can motivate the users to use the app. I hope that through the use of the app, people are able to delegate their time more efficiently.

### Features
The application has 3 main parts:
* To-do List
  - Helps users to keep track of what they have to do and when they have to complete the task
  - Helps organize which are the more urgent tasks that they have to complete
  
* Pomodoro Timer
  - Helps maintain their focus on their task in a short period of time
  - Helps them take breaks in between to sustain their focus
  
* Reward or achievement system (Badges)
  - To encourage the use of the application
  - Users will be rewarded certain badges based on how many tasks they have completed and how long they have used the pomodoro timer every month

### Requirements
* Design an intro screen that contains the tasks that they have input into the app
* Design a To-do list that:
  - will allow users to add a new task, its deadline, be able to sort it based on urgency, name, type
  - display tasks based on their date
* Design a Pomodoro Timer that:
  - has a timer, default time, an option to designate a new task, or a task that in the To-do list
* Design a reward or achievement system that:
  - has a awards badges based on how many tasks you completed, and how long the user has used the pomodoro timer
  - will refresh every month and keep record of the badges earned in the previous months

## CRC Cards and Class Diagram (may be subjected to changes)
![CRC Cards](https://github.com/AR1sUt3l/TimeManagementApp/blob/main/images/CRC%20Cards/v1.jpg)
![Class Diagram](https://github.com/AR1sUt3l/TimeManagementApp/blob/main/images/Class%20Diagrams/v1.jpg)

## WireFrame
![WireFrame](https://github.com/AR1sUt3l/TimeManagementApp/blob/main/images/WireFrame/v1.png)

## Requirements Traceability Matrix
| Test ID | Requirements                                                    | Source Files(s) | Test Status |
|---------|-----------------------------------------------------------------|-----------------|-------------|
| 1       | Allow user to add a new task                                    | Task.java       | TBD         |
| 2       | Allow user to determine due date for the task                   | DueDate.java    | TBD         |
| 3       | Allow user to determine a type for the task                     | Type.java       | Pass        |
| 4       | Allow user to sort tasks by deadline (default settings)         | Task.java       | TBD         |
| 5       | Allow user to sort tasks by alphabetic order (name)             | Task.java       | TBD         |
| 6       | Sort types list by alphabetic order upon addition of new type   | Type.java       | Pass        |
| 7       | Delete type from list when no current tasks of that type exists | Type.java       | Pass        |
| 8       | Allow users to be able to not include a deadline and and type for task | Task.java | Pass |

## Weekly Updates
### Week 1
* Thought of what I wanted to do for my final project
* Worked on README
  - Added the Introduction
* Made the rough draft of the CRC cards and Class Diagrams
### Week 2
* Worked on some of the classes: Task, Type
* Added some interfaces
* Added a few unit tests for Type class
### Week 3
* Continued working on and refined some of the classes: Type
* Added a wireframe
### Week 4
* Continued working on some classes
* Added more tests for the unit test
* Created RTM
### Week 5
* Continued working on some more of the classes
* Created a simple GUI
### Week 6
