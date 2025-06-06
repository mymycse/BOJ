# [Bronze III] 디미고에 가고 싶어! - 32184 

[문제 링크](https://www.acmicpc.net/problem/32184) 

### 성능 요약

메모리: 2020 KB, 시간: 0 ms

### 분류

사칙연산, 구현, 수학

### 제출 일자

2025년 5월 12일 23:55:27

### 문제 설명

<p>ecode는 디미고에 가고 싶어 입학 설명회를 다녀왔다. 디미고에 대해 더욱 자세히 알고 싶었던 ecode는 학교에 대한 정보가 담겨 있는 책자를 받았다.</p>

<p>책자는 한 장이 두 페이지로 이루어져 있으며 <strong>아무 면이나 펼쳤을 때 왼쪽이 홀수 번째 페이지, 오른쪽이 짝수 번째 페이지</strong>이다.</p>

<p>ecode는 이 책자의 $A$번째 페이지부터 $B$번째 페이지까지의 내용을 사진으로 저장해두고 싶다. 번거롭게 모든 페이지를 촬영하기 귀찮았던 ecode는 책자의 펼친 면에 저장해두고 싶은 페이지가 모두 포함되어 있으면 휴대전화를 가로로 기울여 해당 부분을 한 번에 촬영하기로 하였다.</p>

<p>아래의 예시는 $4$번째 페이지부터 $6$번째 페이지까지 저장하고 싶을 때 사진을 촬영하는 최적의 방법이다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/3ef89dc3-67ce-4652-bef2-85d2a4c0d46f/-/preview/" style="max-width:100%"></p>

<p>휴대전화를 세로로 기울여 $4$번째 페이지만 한 번 촬영하고, 가로로 기울여 $5$, $6$번째 페이지를 한 번에 촬영하면 $2$번의 촬영 만에 원하는 페이지들을 모두 저장할 수 있다.</p>

<p>최소 몇 번 사진을 촬영해야 $A$번째 페이지부터 $B$번째 페이지까지 저장할 수 있는지 알아보자!</p>

### 입력 

 <p>첫 번째 줄에 ecode가 사진을 촬영하려고 하는 부분의 시작 페이지를 나타내는 정수 $A$와 끝 페이지를 나타내는 정수 $B$가 공백으로 구분되어 주어진다. $(1\leq A \leq B \leq 1\,000)$</p>

### 출력 

 <p>최소 몇 번 사진을 촬영해야 $A$번째 페이지부터 $B$번째 페이지까지 한 페이지도 빠짐없이 전부 저장할 수 있는지 출력한다.</p>

