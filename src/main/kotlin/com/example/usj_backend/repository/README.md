# repository

**役割**
- データベースへの永続化を抽象化
- Spring Data JPA の `JpaRepository` を継承して CRUD 操作を提供
- 複雑クエリが必要な場合は `@Query` アノテーションで定義

**主なクラス**
- `UserRepository.kt`
- `MatchRepository.kt`
