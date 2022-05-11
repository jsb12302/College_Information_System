# 대학 정보 시스템

## 개요

한 시스템에서 다양한 사용자들(교수, 학생, 직원)의 정보를 관리하며 발생하는 정보의 훼손 및 위험성을 보완하고, 사용자들의 작업을 효율적으로 지원하기 위한 대학 정보 시스템을 구축하려고 한다.

이 서비스의 목표는 다음과 같다

대학정보시스템을 통해서 학생, 교수, 관리자를 모두 하나의 통합된 프로그램으로 관리할 수 있다. 시스템에 있는 학사 관리 기능, 수업 관리 기능, 수강 관리 기능, 사용자 관리 기능은 사용자의 특성마다 사용할 수 있는 기능이 제한된다. 사용자들에게 필요한 정보를 GUI 화면으로 제공하여 사용자가 프로그램을 편리하게 사용할 수 있도록 한다.

## 개발 환경
```
* Language : Java
* Platform : NetBeans 11.3
* DB : NotePad
* Tools : JAVA SWING
```

서비스의 주요 기능은 다음과 같다  

가. 공통기능  
 ● 학생/교수/직원 아이디,초기 암호 생성  
 ● 로그인 후 암호 수정 가능  

나. 학사 담당자  
● 학생/교수 추가.  
● 사용자 정보 검색, 수정, 삭제  

다. 수업 담당자    
● 강좌 정보 추가 및 수정  
● 등록된 강좌 강의 개설  
● 수강료 청구서 발급  

라. 학생  
● 수강신청  
● 성적 확인  

마. 교수  
● 강좌 학생 몇단 확인  
● 학생 성적 입력  
● 출석부 조회  

# 클래스 설계
1. 공통기능  
![공통기능](image/ClassStructure.png)
2. 사용자 기능  
![사용자기능](image/사용자기능.png)
3. 가맹점 기능  
![가맹점기능](image/가맹점기능.png)

### 서버 아키텍쳐
![서버 아키텍쳐](image/서버아키텍쳐.png)
### DB 설계
![DB설계](image/DB설계.png)


## 실행 화면
### 로그인
![로그인](image/로그인.png)

### 사용자
![사용자](image/사용자.png)

### 가맹점
![가맹점](image/가맹점.png)

## 시연 영상 및 발표 영상
[![Video Label](https://img.youtube.com/vi/BuqNLZQmd-o/0.jpg)](https://youtu.be/BuqNLZQmd-o)  


## Contributors

This project exists thanks to all the people who [contribute](https://github.com/jsb12302/android/graphs/contributors).

<a href="https://github.com/Bonyeong1998">
<img src="https://avatars.githubusercontent.com/u/73810809?v=4" height="50" alt="Bonyeong1998"/></a>
<a href="https://github.com/jsb12302">
<img src="https://avatars.githubusercontent.com/u/73890228?v=4" height="50" alt="jsb12302"/></a>
<a href="https://github.com/rlarlxo2323">
<img src="https://avatars.githubusercontent.com/u/81959996?v=4" height="50" alt="rlarlxo2323"/></a>
<a href="https://github.com/ads0070">
<img src="https://avatars.githubusercontent.com/u/73926856?v=4" height="50" alt="ads0070"/></a>
