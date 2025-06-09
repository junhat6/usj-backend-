# service

**役割**
- ビジネスロジックの実装
- トランザクション管理（`@Transactional`）
- ドメインモデル操作（entity）および永続化層（repository）の呼び出し
- 必要に応じて外部 API 呼び出しや非同期処理を統括

**主なクラス**
- `UserService.kt`
- `MatchService.kt`
