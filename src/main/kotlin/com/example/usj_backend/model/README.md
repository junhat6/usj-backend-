# model

**役割**
- ドメインモデル（エンティティ／値オブジェクト）の定義
- ビジネスルールに基づく不変条件（バリデーション）を保持

**構成例**
- `User.kt` （`@Entity`）
- `Match.kt` （`@Entity`）
- `value/EmailAddress.kt` （値オブジェクト）
- `value/Location.kt` （値オブジェクト）
