# 블랙잭 게임

블랙잭은 플레이어, 딜러가 가진 카드의 합이 21에 최대한 가깝도록 하는 게임이다.

## 기능 요구 사항

- [x] 처음 사용자는 게임에 참여할 플레이어를 입력할 수 있다.
  - [x] 쉼표로 구분한다.
  - [x] 플레이어가 없으면 예외를 발생시켜야 한다.
- [ ] 각 플레이어는 처음 시작할 때 베팅 금액을 입력할 수 있다.
  - [ ] 입력받을 때 사람들의 이름이 같이 출력되어야 한다.
- [ ] 처음에 딜러와 플레이어들에게 카드를 두장씩 나눠줄 수 있다.
  - [ ] 플레이어의 첫 두장이 21이 넘지 않으면 카드를 더 뽑을지 여부를 물어본다.
  - [ ] 딜러는 첫 두장의 합이 16이하면 무조건 카드를 받는다.
- [ ] 딜러의 합이 21이 넘으면 플레이어는 무조건 승리해 베팅 금액을 받는다.
  - [ ] 플레이어의 승리는 베팅한 금액을 돌려받고, 베팅한 금액을 추가로 받는 것을 의미한다.
- [ ] 플레이어가 처음 두장이 21이면, 베팅 금액의 1.5배를 딜러에게서 받음.
- [ ] 플레이어와 딜러 모두 처음 두 장이 21이면, 베팅금액을 플레이어가 돌려받음



### 카드 요구 사항

- [ ] 킹, 퀸, 잭은 모두 10으로 취급한다.
- [ ] 에이스는 1 혹은 11로 취급한다.
- [ ] 카드 문양은 하트, 클로버, 다이아몬드, 스페이드가 있다.
- [ ] 카드 숫자는 그대로 취급한다.