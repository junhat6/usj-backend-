# USJ Backend

## 概要
USJ Backendは、Kotlin + Spring Boot 3を使用したRESTful API サーバーです。OpenAPI Generator を使用してAPI仕様から自動でコード生成を行い、PostgreSQLデータベースを使用します。

## 前提条件

### 必須環境
以下のソフトウェアがインストールされている必要があります：

- **Java Development Kit (JDK) 21**
  - Oracle JDK
  - インストール確認: `java -version`

- **Git**
  - バージョン管理システム
  - インストール確認: `git --version`

- **Docker Desktop**
  - データベース（PostgreSQL）を実行するために必要
  - インストール確認: `docker --version` および `docker-compose --version`

### 推奨環境
- **IntelliJ IDEA Community Edition** (無料版)
  - JetBrains公式サイトからダウンロード: https://www.jetbrains.com/idea/download/
  - Kotlinプラグインは標準でインストール済み

## 環境構築手順

### 1. リポジトリのクローン
```bash
git clone <リポジトリURL>
cd usj-backend
```

### 2. JDK 21のインストール（未インストールの場合）

#### Windows
1. [Amazon Corretto 21](https://aws.amazon.com/jp/corretto/) または [Oracle JDK 21](https://www.oracle.com/java/technologies/downloads/) をダウンロード
2. インストーラーを実行してインストール
3. 環境変数 `JAVA_HOME` を設定
4. コマンドプロンプトで確認: `java -version`

#### macOS（Homebrewを使用）
```bash
brew install openjdk@21
echo 'export PATH="/opt/homebrew/opt/openjdk@21/bin:$PATH"' >> ~/.zshrc
source ~/.zshrc
```

#### Linux（Ubuntu/Debian）
```bash
sudo apt update
sudo apt install openjdk-21-jdk
```

### 3. IntelliJ IDEA Community Editionのセットアップ

1. **IntelliJ IDEAのダウンロードとインストール**
   - https://www.jetbrains.com/idea/download/ から Community版をダウンロード
   - インストール完了後、起動

2. **プロジェクトの開き方**
   - IntelliJ IDEAを起動
   - "Open" または "Open or Import" を選択
   - クローンした `usj-backend` フォルダを選択
   - "Open as Project" を選択

3. **プロジェクト設定の確認**
   - File → Project Structure を開く
   - Project Settings → Project でProject SDK がJava 21に設定されていることを確認
   - 設定されていない場合は、"New..." から JDK 21を追加

4. **必要なプラグインの確認**
   - File → Settings → Plugins で以下のプラグインが有効になっていることを確認：
     - Kotlin（標準でインストール済み）
     - Gradle（標準でインストール済み）

### 4. データベース（PostgreSQL）のセットアップ

1. **Docker Desktopの起動**
   - Docker Desktopアプリケーションを起動し、Dockerエンジンが動作していることを確認

2. **PostgreSQLコンテナの起動**
   ```bash
   cd usj-backend
   docker-compose up -d
   ```

3. **データベース接続の確認**
   ```bash
   docker ps
   ```
   - `usj-postgres` コンテナが動作していることを確認

### 5. プロジェクトのビルドと実行

1. **Gradleの実行権限設定（Linux/macOS）**
   ```bash
   chmod +x gradlew
   ```

2. **依存関係のダウンロードとビルド**
   ```bash
   ./gradlew build
   ```
   
   Windows の場合:
   ```cmd
   gradlew.bat build
   ```

3. **アプリケーションの起動**
   ```bash
   ./gradlew bootRun
   ```
   
   Windows の場合:
   ```cmd
   gradlew.bat bootRun
   ```

4. **動作確認**
   - ブラウザで http://localhost:8080 にアクセス
   - Swagger UI: http://localhost:8080/swagger-ui.html
   - アクチュエーター: http://localhost:8080/actuator/health

### 6. IntelliJ IDEAでの実行方法

1. **Gradleタスクの実行**
   - 右側の "Gradle" パネルを開く
   - usj-backend → Tasks → application → bootRun をダブルクリック

2. **メインクラスから直接実行**
   - `src/main/kotlin` 配下のMainクラスを見つける
   - クラス名の横の緑色の実行ボタンをクリック

3. **実行設定の作成**
   - Run → Edit Configurations
   - "+" → Spring Boot を選択
   - Main class を設定
   - VM options や Program arguments を必要に応じて設定

## 開発環境の詳細

### データベース接続情報
- **ホスト**: localhost
- **ポート**: 5432
- **データベース名**: usj_db
- **ユーザー名**: usj_user
- **パスワード**: secretpass

### プロジェクト構成
```
usj-backend/
├── src/
│   ├── main/
│   │   ├── kotlin/           # Kotlinソースコード
│   │   ├── resources/        # 設定ファイル・静的リソース
│   │   │   ├── application.yml
│   │   │   └── openapi.yml   # OpenAPI仕様書
│   │   └── generated/        # 自動生成されたコード
│   └── test/                 # テストコード
├── build.gradle.kts          # ビルド設定
├── docker-compose.yml        # データベース設定
└── gradlew / gradlew.bat     # Gradleラッパー
```

### 使用技術スタック
- **言語**: Kotlin 1.9.25
- **フレームワーク**: Spring Boot 3.5.0
- **データベース**: PostgreSQL 15
- **ORM**: Spring Data JPA
- **API仕様**: OpenAPI 3.0 (Swagger)
- **ビルドツール**: Gradle (Kotlin DSL)
- **認証**: Spring Security
- **その他**: Spring Mail, WebSocket, Validation

### よく使用するGradleタスク
```bash
# ビルド
./gradlew build

# テスト実行
./gradlew test

# アプリケーション起動
./gradlew bootRun

# OpenAPIからコード生成
./gradlew openApiGenerate

# 依存関係の確認
./gradlew dependencies

# クリーンビルド
./gradlew clean build
```

## トラブルシューティング

### Java関連
- **JDKバージョンエラー**: `java -version` でJava 21以上が表示されることを確認
- **JAVA_HOME未設定**: 環境変数 `JAVA_HOME` がJDK 21のインストールパスに設定されていることを確認

### Docker関連
- **Dockerが起動しない**: Docker Desktopが起動していることを確認
- **ポート競合**: 他のアプリケーションがポート5432を使用していないか確認
- **データベース接続エラー**: `docker-compose logs postgres` でPostgreSQLのログを確認

### IntelliJ IDEA関連
- **プロジェクトが開けない**: File → Invalidate Caches and Restart を試行
- **Kotlinが認識されない**: Settings → Plugins でKotlinプラグインが有効になっていることを確認
- **Gradleが同期されない**: Gradle パネルの更新ボタンをクリック

### ビルド関連
- **依存関係エラー**: `./gradlew clean` 後に `./gradlew build` を実行
- **OpenAPI生成エラー**: `src/main/resources/openapi.yml` の構文を確認

## Git運用

### ブランチ戦略
- **main**: 本番環境用の安定版
- **develop**: 開発用の統合ブランチ
- **feature/xxx**: 機能開発用ブランチ

### コミット前のチェック
```bash
# テストの実行
./gradlew test

# コードフォーマットの確認
./gradlew ktlintCheck

# ビルドの確認
./gradlew build
```

## 開発チーム向けの注意事項

1. **OpenAPI仕様の更新**: `src/main/resources/openapi.yml` を変更した後は `./gradlew openApiGenerate` を実行
2. **データベースマイグレーション**: エンティティを変更した場合は、必要に応じてマイグレーションスクリプトを作成
3. **環境変数**: 本番環境固有の設定は環境変数で管理し、`application.yml` にはデフォルト値を設定
4. **テストの実行**: プルリクエスト前に必ずテストが通ることを確認
5. **コードレビュー**: すべての変更はプルリクエストを通してコードレビューを受ける

## 参考リンク

- [Spring Boot公式ドキュメント](https://spring.io/projects/spring-boot)
- [Kotlin公式ドキュメント](https://kotlinlang.org/docs/)
- [OpenAPI Generator](https://openapi-generator.tech/)
- [PostgreSQL公式ドキュメント](https://www.postgresql.org/docs/)
- [IntelliJ IDEA使い方ガイド](https://www.jetbrains.com/help/idea/)

---

何か問題が発生した場合は、チームメンバーまたはプロジェクトリードに相談してください。 