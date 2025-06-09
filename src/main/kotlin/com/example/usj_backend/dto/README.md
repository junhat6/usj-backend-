# dto

**役割**
- Controller ⇔ Client 間のデータ交換オブジェクト
- エンティティをそのまま渡さず、必要なフィールドだけを公開
- リクエスト用（`request/`）、レスポンス用（`response/`）に分割

**ディレクトリ構成**
- `dto/request/`
    - `CreateUserRequest.kt`
    - `CreateMatchRequest.kt`
- `dto/response/`
    - `UserResponse.kt`
    - `MatchResponse.kt`
