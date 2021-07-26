# CODING_TEST

<strong>Git 파일 올리는 방법</strong>
<br>
<br>
<strong>[ 초기 설정 ]</strong>
1. 초기 설정을 위해 Git Bash Here 에서 
   git config --global user.name [깃허브 가입 시 이름]
   git config --global user.email [깃허브 가입 시 이메일]
   두 가지를 입력 해 준다.
<br>
<br>
<br>
<strong>[ 깃 신규파일 또는 수정파일 올리기 ]</strong>
1. 올리고자 하는 프로젝트 우클릭 > Git Bash Here 클릭
<br>
2. 깃을 올릴 수 있는 폴더가 아닌 경우 
   git init 
   으로 .git 폴더 생성 해 준다.
   
   만약 깃허브에 파일을 가지고 오고 싶다면
   git clone http://github.com/프로젝트명
   을 입력하면 깃허브 프로젝트 내에 있는 파일들과 .git 폴더가 자동으로 생성된다.
<br>
3. 현재 상태를 확인하는 명령어인 
   git status
   으로 수정된 파일이나 신규 파일이 있는지 확인 해 준다.
<br>   
   만약 add를 해줘야 되는 파일들이 있다면
   git add 파일명   또는   git add .
   으로 파일을 add 시켜준다.
<br>   
   → 이 과정은 우리가 현재 작업하고 있는 영역인 Working Directory 영역에서 
     commit 전의 영역인 Staging Area로 옮겨주는 과정이다.
<br>   
4. 이후 커밋을 하기 위해
   git commit -m "커밋 로그 작성란"
   으로 코드 변경 사항을 포함해 파일들을 커밋 해 줍니다.
<br>   
5. 마지막으로 commit이 완료된 파일들을 원격 저장소로 최종 업로드 하기 위해
   git push origin master 
   를 써주면 깃에 파일을 올릴 수 있다.
<br>   
   → 이 과정은 commit 전의 영역인 Staging Area에서 
     원격 저장소로 업로드 하는 repository로 옮겨주는 과정이다.
<br>	 
<br>	 
<br>
<strong>[ 오류 ]</strong>
1. error : filed to push some refs to '깃허브 주소'
   원격 저장소와 로컬 저장소가 서로 동기화 되어있지 않다는 뜻으로
   git pull origin master 또는
   git pull --rebase origin master
   을 사용하여 원격 저장소와 로컬 저장소를 동기화 시켜준다.
   
