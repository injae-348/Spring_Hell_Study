# 2주차 과제
안녕하세요 커피요정 개발자 이서현입니다.
금주의 과제는 기존의 상태에 따라 반환되는 요청의 형태는 같아도, 데이터가 다르다는 분기점이 핵심입니다.

최대한 코드의 복잡성을 줄이고, 객체지향적으로 문제를 해결할 수 있도록 고민해보시길 바랍니다.
이번 과제는 별도의 DB를 사용하지 않고 기존에 작성된 database 패키지의 코드를 사용하시길 바랍니다.
- (단 작성된 코드는 수정은 불가하지만 추가는 가능합니다.)

# 1번 문제

서현이는 남원에서 만나는 사람이 없다 보니 친구들에게 쪽지를 보내며 외로움을 달래보고자 한다.

그래서 더 편하게 쪽지를 나누기 위해 쪽지 플랫폼을 만들고자 한다.

쪽지 플랫폼은 쪽지방을 만들어서 친구를 초대하여 채팅방에서 쪽지를 주고 받을 수 있습니다.

쪽지방에 대한 요구사항은 아래와 같습니다.

### 요구사항

- 내가 차단한사람이면 쪽지가 안오고, 기존 쪽지도 안보여야함.
- 채팅방처럼 최신 쪽지가 상단으로 보여야함
- 안읽은 쪽지가 있으면 화면에 표시되어야함
- 쪽지를 하던 상대방이 쪽지방에서 나가더라도 내방에는 상대방과 나눈 쪽지가 계속있어야한다.
- 상대방이 나와 쪽지를 하다가 나간 상태였을 때, 상대방이 다시 쪽지를 하게되면 상대방은 새로운 방에 들어간것 처럼 보여야한다.
    - 부연 설명 : ‘새로운 방에 들어간 것’ 처럼의 의미는 기존 쪽지의 기록을 확인할 수 없다는 의미입니다.
- 상대방이 나와 쪽지를 하다가 나간 상태였을 때, 상대방이 다시 쪽지를 하게되면 나는 원래있던방에서 쪽지가 와야한다.
- 내가 보낸 쪽지는 이미 읽은 쪽지 처리한다.
- 개별 쪽지마다 읽었는지 확인해야 한다(읽음 처리 해야한다). 읽지 않은 쪽지가 있는지 확인할 수 있어야 합니다.

### 미션

- 쪽지방을 구현하기 위한 API를 구현하시오.
- 초대, 차단, 쪽지 주고받기, 쪽지 상태 관리 등 위 요구사항을 충족하는 자유로운 형태로 작성하시면 됩니다.

# 2번 문제

쪽지 기능을 완성했습니다 뿌-듯.

하지만 서버를 모니터링 하다 이상한 것을 발견했습니다. 이진혁이 테스트를 해보겠다고 모르는 유저에게 몇백만건의 쪽지방 초대를 요청했습니다.

쪽지의 요청량을 제한하자는 요구사항을 추가로 논의하여 개발하기로 했습니다. 요구사항은 아래와 같습니다.

- 친구를 초대하는데 내가 이전에 초대했던 친구는 다시 초대할 수 없다.
- 초대한 친구가 차단한 친구일 경우 초대를 보내지 않는다.
- 초대한 친구가 다른 초대한 친구의 차단한 친구라면 초대를 보내지 않는다.
- 쪽지방에 제한 인원은 100명을 넘지 않도록 한다.

2) 최근 저장한 5번의 비밀번호에서 일치한 같은 패턴은 저장할 수 없다.

3) 전체 유저가 현재 사용하고 있는 비밀번호중 100개 이상 넘으면 안된다.

# 3번 문제

앗! 쪽지 플랫폼을 다 만들었더니 이슈가 발생했습니다. 쪽지를 보내고 나서 바로 앱을 껐는데 송신 도중 엄마가 랜선을 뽑았습니다. 그래서 쪽지 요청은 받았으나, 처리 응답을 받지 못하고 요청을 마무리 하지 못했습니다.

- 네트워크 장애로 인한 문제로 쪽지 유실 문제가 발생하지 않도록 코드를 개선하세요.
- 즉, 쪽지 처리를 실패했을 경우에 At-Least-Once (적어도 한번) 처리될 수 있도록 코드를 개선하세요.

# 4번 문제

위 문제를 해결하면서 해결한 과정을 정리하여 pdf로 제출하시길 바랍니다.

제출지 : ymecca730135@gmail.com

### 마감시간 : 2024:04:28/21:30