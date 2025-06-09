package com.example.usj_backend.controller

import com.example.usj_backend.api.AuthApi
import com.example.usj_backend.model.AuthResponse
import com.example.usj_backend.model.LoginRequest
import com.example.usj_backend.model.UserRegistrationRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthControllerImpl : AuthApi {

    override fun apiAuthLoginPost(loginRequest: LoginRequest): ResponseEntity<AuthResponse> {
        // TODO: ログイン処理の実装
        // 1. メールアドレスとパスワードの検証
        // 2. JWTトークンの生成
        // 3. ユーザー情報の取得
        
        // 仮の実装
        val authResponse = AuthResponse(
            token = "dummy-jwt-token",
            user = null // TODO: ユーザー情報を設定
        )
        
        return ResponseEntity.ok(authResponse)
    }

    override fun apiAuthLogoutPost(): ResponseEntity<Unit> {
        // TODO: ログアウト処理の実装
        // 1. JWTトークンの無効化
        // 2. セッション情報の削除
        
        return ResponseEntity.ok().build()
    }

    override fun apiAuthRegisterPost(userRegistrationRequest: UserRegistrationRequest): ResponseEntity<AuthResponse> {
        // TODO: ユーザー登録処理の実装
        // 1. 入力データの検証
        // 2. メールアドレスの重複チェック
        // 3. パスワードのハッシュ化
        // 4. ユーザー情報の保存
        // 5. JWTトークンの生成
        
        // 仮の実装
        val authResponse = AuthResponse(
            token = "dummy-jwt-token",
            user = null // TODO: 作成されたユーザー情報を設定
        )
        
        return ResponseEntity.status(HttpStatus.CREATED).body(authResponse)
    }
} 