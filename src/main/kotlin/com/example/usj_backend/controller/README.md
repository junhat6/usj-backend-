# controller

**役割**
- HTTP リクエストを受け取り、ビジネスロジック層（service）を呼び出す
- 入力パラメータのバリデーションを行い、DTO を受け渡す
- サービスから得た結果を HTTP レスポンス（JSON）として返却

**主なクラス**
- `UserController.kt`
- `MatchController.kt`
- `HelloController.kt`
